//incomplete 

#include<stdio.h>
int check(int x)
{
	if(x>0)
	{
	   return -1;
	}
	else
	{
	   return 1;
	}

}   
void prime(int x)
{  int i;
   for(i=2;i<=x-1;i++)
   {
     if(x%i==0)
	 {
	   printf("\nthe number is not an prime");
	   break;
	 }
   }
   if(x==i)
   {
      printf("no is prime.....");
   }
}
void main()
{
   static int t=0, i=1,n=5;
   do
   {
   printf("\nEnter a number:");
   scanf("%d",&n);
   t=check(n);
   i=n*t;
   if(t==-1)
   {
     break;
   }
  
   }while(n<0);
    if(t==-1)
   {
      printf("\nthe number is positive\n");
	  prime(n);
   }

}
