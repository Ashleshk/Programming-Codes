function addNumber(a: number, b: number) {
    return a + b;
}
var sum: number = addNumber(10,15)
console.log('Sum of the two numbers is: ' +sum); 

function addNums(num1:any ,num2:number):number{
    if(typeof num1 == "string")
    {
        if(isNaN(parseInt(num1,10))){
            return 0;
        }
        num1=parseInt(num1,10);
    }
    return num1+num2;
}
console.log(addNums('10',20));