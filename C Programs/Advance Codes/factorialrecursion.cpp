#include<stdio.h>
int fact(int);
void main()
{
   int num, res=1;
   printf("\nEnter the number:");
   scanf("%d",&num);
   res=fact(num);
   printf("the result is:%d\n",res);
}
int fact(int x)
{
   int f;
   if(x==1)
	   return 1;
   else
   {
      f=x*fact(x-1);
   }
}