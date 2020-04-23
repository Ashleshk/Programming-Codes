#include<stdio.h>
int main()
{
   int n,r,t,s ;
   s=0;
   printf("\nEnter any number:");
   scanf("%d",&n);
   t=n;
   while(n>0)
   {
      r=n%10;
	  n=n/10;
	  s=s+(r*r*r);
   
   }
   if(t==s)
   {
      printf("\nthe number is an armstrong");
   }
   else
   {
   
   printf("\nthe number is not an armstrong number");
   }
}