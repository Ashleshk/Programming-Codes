class car{
    getAmount:number;
    carObj:HTMLElement;

    constructor()
    {
        this.getAmount=0;
        this.carObj=document.getElementById("gasplayer");
    }

    run():void{
        setInterval(() => {
            this.getAmount++;
            this.carObj.innerText =this.getAmount.toString();
        },500);
    }
}

var myCar = new car();
myCar.run();
