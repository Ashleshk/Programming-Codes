var website = /** @class */ (function () {
    function website(url, fblikes) {
        this.url = url;
        this.facebooklikes = fblikes;
    }
    website.prototype.likesinK = function () {
        return (this.facebooklikes / 1000) + 'K';
    };
    return website;
}());
var google = new website("http:google.com", 32135);
console.log(google.likesinK());
