alert("Welcome to your Coffee Lover")
var love = prompt("how would like coffee ")
alert("you like " + love)
console.log("You are a good person")


//if(condition)
/*{ 
   condiyiom
}*/
/*var hot = false;
var temp = 160;
if(temp>80)
{
  console.log("temp is greater than 80");

}*/
var firstName = prompt("First Name Please:")
var LastName = prompt("Last Name Please: ")
var age = prompt("How old are you ?")
var height = prompt("What is your height?")
var petName = prompt("What is your pet Name");
alert("Thank you so much for the information")



//conditiodn'

var nameCod = null;
var AgeCond = null;
var hegihtCond = null;
var petCOnd = null;

if (firstName[0] === LastName[0]) {
    nameCod = true;
} else {
nameCod = false;
}

if (age >= 20 && age <= 30) {
    AgeCond = true;
} else {
    AgeCond = false;
}


if (height >= 170) {
    hegihtCond = true;

} else {
hegihtCond = false;
}

if (petName[petName.length - 1] === "y") {
    petCOnd = true
}
else {
    petCOnd = false
}

if (nameCod && AgeCond && hegihtCond && petCOnd) {
    console.log("Welcome SPy!!1");
}
else {
    console.log("Nothing to see here");
}



////////////////////////////////////////////////////////
///         functions
////////////////////////////////////////////////////////
function hello(name) {
    console.log("hello world"+name);

}
///this can add string  nand strin+num etc
function AddNum(num1, num2=5) {
    console.log(num1+num2);
    //return num1+num2
}

//gloabal scope
var v = "GLOBAL V"
var stuff="GLOBAL STUFF"
function fun(stuff)
{
  console.log(v);
  stuff="reassign stuff insodr func"
  console.log(stuff);
}
console.log(stuff);
////////////////////////////////////////////////////////////
//////////////           exercise             //////////////
/////////////////////////////////////////////////////////////////
function sleepIn(weekday,vacation)
{
    return (!weekday || vacation)
}
///////////////////////////////////////////////////////////
function monkeyTrouble(aSmile,bSmile)
{
    return (aSmile && bSmile)||(!aSmile && !bSmile)
}
////////////////////////////////////////////////////////
function stringTimes(str,n)
{
    var returnstr= "";
    var i=0;
    while(i<n)
    {
        returnstr += str;
        i++
    }
    return returnstr
}
/////////////////////////////////////////////
function luckySum(a,b,c)
{
    if(a===13)
    {
        return 0
    }
    else if(b===13)
    {
      return a
     }
     else if(c===13)
     {
        return a+b
     }
     else
        return a+b+c
}
//////////////////////////////////////////////
function caught_speeding(speed,is_birthday)
{
    if(is_birthday){
        speed -=5
    }
    if(speed <=60)
    {
        return 0
    }
    if(60<speed<=80)
    {
        return 1
    }
    return 2    
}
//////////////////////////////////////////////////////
function makebricks(small , big ,goal)
{
  return goal%5 >= 0 && goal%5 - small <= 0 && small + 5*big >= goal;
}
/////////////////////////////////////
///  ararys are mitable(changebale)
///   strings are immutable (cant be chaeged)

/*

   for(var i=0;i<arr.length;i++){}


   for(anynaem of arr)
   {
   
   }


   arr.foreach(alert);

*/



///////////////////////////////////////////////////////////
///////////////     object                    //////
/*
     can take mixed data type   ....key-value  pair

     var mynew = {a:"hello",b:[1,2,3] c:{inside:['a','b']}};

        mybew['a']   ====>   hello


        //to see the objects
        console.dir(mynew);


        //iterating in objects
        for(anyname in mynew)
        {
        console.log(key);
        console.log(mynew[key]);
        }
*/