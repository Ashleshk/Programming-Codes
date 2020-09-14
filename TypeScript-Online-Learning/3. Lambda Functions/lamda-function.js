var car = /** @class */ (function () {
    function car() {
        this.getAmount = 0;
        this.carObj = document.getElementById("gasplayer");
    }
    car.prototype.run = function () {
        var _this = this;
        setInterval(function () {
            _this.getAmount++;
            _this.carObj.innerText = _this.getAmount.toString();
        }, 500);
    };
    return car;
}());
var myCar = new car();
myCar.run();
