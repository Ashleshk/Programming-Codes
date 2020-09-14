//interfaces are like structures in c,c++

interface operatorInterfaces{
    shape:string;
    side? : number;
}


function operate(x:operatorInterfaces){
    return x.side*x.side;
}

var calc =operate({shape:"sqaure",side:5});
console.log(calc);