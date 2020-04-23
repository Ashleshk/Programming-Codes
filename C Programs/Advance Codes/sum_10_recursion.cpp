#include<stdio.h>

int sum(int );
void main()
{   int a,r;
    a=10;
   r=sum(a);
   printf("\nthesum is:%d",r);
}
int sum(int x)
{
   
   int i=0;
  if(x!=0)
	{  
		return(x+sum(x-1));
       
    }
  else
   return x;
}