#include<stdio.h>
#include<conio.h>
void main()
{
   int i,j,sum1=0,sum2=0,sum3=0,sum;
   for(i=3;i<1000;i++)
   {
       if(i%3==0)
	   {
		   sum1=sum1+i;
	   }
	   else if(i%5==0)
	   {
	     sum2=sum2+ i;
	   }
	   else if(i%3==0 && i%5==0)
	   {
		   sum3=sum3+i;
	   }
   }
   sum=sum1+sum2+sum3;
   printf("%d",sum);
   getch();
}