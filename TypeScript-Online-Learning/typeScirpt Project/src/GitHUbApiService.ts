import * as request from 'request';
import { User } from './User';
import { Repo } from './Repo';

const OPTIONS: any ={
    headers:{
        "user-Agent" :"request"
    },
    json: true
};


export class GitHUbApiService{
    getUserInfo(userName :string,cb:(user:User)=>any)
    {
        
        request.get('https://api.github.com/users/'+userName,OPTIONS,(error:any,response:any, body:any)=>{
            //console.log(error);
            // console.log(response);
            // console.log(body);

             let user =new User(body);
            // console.log(user);

            cb(user)
        })

    
    }
    getRepos(userName :string,cb:(repos:Repo[])=>any)
    {
        request.get('https://api.github.com/users/'+userName+'/repos',OPTIONS,(error:any,response:any, body:any)=>{
           let repos= body.map((repo:any) => new Repo(repo));
             cb(repos);
        })
    }
}