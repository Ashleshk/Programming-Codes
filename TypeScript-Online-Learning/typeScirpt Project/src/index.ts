import {GitHUbApiService} from './GitHUbApiService';
import * as _ from 'lodash';
import { User } from './User';
import { Repo } from './Repo';
console.log("heelo");
let svc = new GitHUbApiService();

if(process.argv.length<3){
    console.log('Please pass the username as an argument....');
}
else {

let username = process.argv[2];
svc.getUserInfo(username,(user:User)=>{
    svc.getRepos(username,(repos:Repo[])=>{
       
        let sortedRepos = _.sortBy(repos,[(repos:Repo)=> repos.forkcount]); 
        let filterRepos = _.take(sortedRepos,5);      
        user.repos =filterRepos;
        console.log(user);
    })
});

}