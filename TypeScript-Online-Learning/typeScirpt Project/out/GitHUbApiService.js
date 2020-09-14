"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
var request = __importStar(require("request"));
var User_1 = require("./User");
var Repo_1 = require("./Repo");
var OPTIONS = {
    headers: {
        "user-Agent": "request"
    },
    json: true
};
var GitHUbApiService = /** @class */ (function () {
    function GitHUbApiService() {
    }
    GitHUbApiService.prototype.getUserInfo = function (userName, cb) {
        request.get('https://api.github.com/users/' + userName, OPTIONS, function (error, response, body) {
            //console.log(error);
            // console.log(response);
            // console.log(body);
            var user = new User_1.User(body);
            // console.log(user);
            cb(user);
        });
    };
    GitHUbApiService.prototype.getRepos = function (userName, cb) {
        request.get('https://api.github.com/users/' + userName + '/repos', OPTIONS, function (error, response, body) {
            var repos = body.map(function (repo) { return new Repo_1.Repo(repo); });
            cb(repos);
        });
    };
    return GitHUbApiService;
}());
exports.GitHUbApiService = GitHUbApiService;
