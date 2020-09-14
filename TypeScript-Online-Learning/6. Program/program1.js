function addNumber(a, b) {
    return a + b;
}
var sum = addNumber(10, 15);
console.log('Sum of the two numbers is: ' + sum);
function addNums(num1, num2) {
    if (typeof num1 == "string") {
        if (isNaN(parseInt(num1, 10))) {
            return 0;
        }
        num1 = parseInt(num1, 10);
    }
    return num1 + num2;
}
console.log(addNums('10', 20));
