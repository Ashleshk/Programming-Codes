alert('heelo there!!!!!!!!!001;');


//default argument
function areaoEllipse(r1:number,r2:number=r1){
    return Math.PI*r1*r2;
}
console.log(areaoEllipse(2));

//opataional argument
function  areasquare(side:number,isInteger?:boolean){
    if(isInteger){
        return Math.floor(side*side);

    }
    return side*side;
}
console.log(areaofsquare(5.25));

//Overload function 
function areaQuad(side1:number);
function areaQuad(side1:number,side2:number);
function areaQuad(side1:number,side2:number,side3:number,side4:number);
function areaQuad(side1:number,side2?:number,side3?:number,side4?:number)
{
     if(side2 === undefined && side3===undefined && side4===undefined)
     {
         side2=side3=side1;
         return side1*side2;
     }
     else if(side3===undefined && side4 ===undefined)
     {
         side3=side1;
         side4=side2;
         return side1*side2;
     }
     return -1;
}
areaofQuad(1);
areaofQuad(1,2);
areaofQuad(1,2,3,4);