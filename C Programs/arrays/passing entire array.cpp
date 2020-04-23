#include<stdio.h>
void accept(int a[])
{
	 int s=0;
	 float avg=0;
	 for(int i=0;i<=4;i++)
	 {
	 
		 s=s+a[i];
	 }
	 avg=(float)s/5;
	 printf("\nThe average is %f\n", avg);
 
}
void main()
{
   int marks[5];
   for(int i=0;i<=4;i++)
   {
      scanf("%d",&marks[i]);
   }
   accept(marks);
}