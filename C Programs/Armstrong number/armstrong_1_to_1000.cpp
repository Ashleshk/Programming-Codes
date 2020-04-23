#include<stdio.h>
int main()
{
   int i ,r,k,m ;
  
   for(i=100;i<=1000;i++)
   {  r=0;
       m=i;
	   while(m!=0)
   {
	   
	   k=m%10;
	   m=m/10;
      r=r+(k*k*k);
   }
	  if(i==r)
	  {
	      printf("the number %d is an armstrong number...",  i);
	  }
	  
	  
   }
   return 0;
}