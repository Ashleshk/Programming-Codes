alert('heelo there!!!!!!!!!001;');
//default argument
function areaoEllipse(r1, r2) {
    if (r2 === void 0) { r2 = r1; }
    return Math.PI * r1 * r2;
}
console.log(areaoEllipse(2));
//opataional argument
function areaofsquare(side, isInteger) {
    if (isInteger) {
        return Math.floor(side * side);
    }
    return side * side;
}
console.log(areaofsquare(5.25));
function areaofQuad(side1, side2, side3, side4) {
    if (side2 === undefined && side3 === undefined && side4 === undefined) {
        side2 = side3 = side1;
        return side1 * side2;
    }
    else if (side3 === undefined && side4 === undefined) {
        side3 = side1;
        side4 = side2;
        return side1 * side2;
    }
    return -1;
}
areaofQuad(1);
areaofQuad(1, 2);
areaofQuad(1, 2, 3, 4);
