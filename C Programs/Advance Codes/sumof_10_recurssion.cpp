#include<stdio.h>
int sum(int, int);
void main()
{
   int res=0 ,n,r;
   printf("\nEnter the number of your choice:");
   scanf("%d",&n);
   r=sum(n ,res);
   printf("\nthe sum of%d is:%d",n,r);
}
int sum(int x,int s)
{
   if(x==0)
	   return 0;
   else

 return(x%10+sum(x/10,s));
   
}