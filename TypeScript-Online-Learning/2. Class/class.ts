class website{
    url:string;
    facebooklikes:number;
    constructor(url:string,fblikes:number)
    {
        this.url=url;
        this.facebooklikes=fblikes;
    }

    likesinK():string
    {
        return (this.facebooklikes/1000)+'K';
    }
}
//setters and getteres also work
var google =new website("http:google.com",32135);
console.log(google.likesinK());[]