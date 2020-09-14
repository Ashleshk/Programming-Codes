var flag = true;
flag = false;
flag = true;
var mtsre = "mef";
var myarr = [1, 2, 3, 4];
var v = [1, 2, 'asdsaf'];
// enums
var myconstant;
(function (myconstant) {
    myconstant[myconstant["pi"] = 3.14] = "pi";
    myconstant[myconstant["e"] = 2.73] = "e";
    myconstant[myconstant["log2"] = 0.3] = "log2";
    myconstant[myconstant["log5"] = 0.7] = "log5";
})(myconstant || (myconstant = {}));
console.log('fonding Circle circumferecnce:');
var radius = 10;
console.log(2 * myconstant.pi * radius);
