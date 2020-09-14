//interfaces are like structures in c,c++
function operate(x) {
    return x.side * x.side;
}
var calc = operate({ shape: "sqaure", side: 5 });
console.log(calc);
