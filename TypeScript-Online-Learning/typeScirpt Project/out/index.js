"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
var GitHUbApiService_1 = require("./GitHUbApiService");
var _ = __importStar(require("lodash"));
console.log("heelo");
var svc = new GitHUbApiService_1.GitHUbApiService();
if (process.argv.length < 3) {
    console.log('Please pass the username as an argument....');
}
else {
    var username_1 = process.argv[2];
    svc.getUserInfo(username_1, function (user) {
        svc.getRepos(username_1, function (repos) {
            var sortedRepos = _.sortBy(repos, [function (repos) { return repos.forkcount; }]);
            var filterRepos = _.take(sortedRepos, 5);
            user.repos = filterRepos;
            console.log(user);
        });
    });
}
