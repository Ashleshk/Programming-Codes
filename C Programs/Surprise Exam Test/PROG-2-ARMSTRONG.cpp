#include<stdio.h>
void main()
{
   int r, i,t,s;
   s=0;
   
   printf("\nEnter the number you want to check for armstrong number:");
   scanf("%d",&i);
   t=i;
   for(;i>0;)
   {
      r=i%10;
	  i=i/10;
	  s=s + (r*r*r);
   }
   if(s==t)
   {
      printf("\nthe number  is an ARMSTRONG NUMBER");
   } 
   else
   {
      printf("\nthe number is NOT AN ARMSTRONG NUMBER");
   }
}