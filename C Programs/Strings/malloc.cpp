#include<stdio.h>
#include<stdlib.h>
void main()
{
   int i,j,*a,num;
   int sum=0;
   float avg=0;
   printf("\nEnter the size of the array");
   scanf("%d",&num);
   a=(int*)malloc(sizeof(int)*num);
   printf("\nEnter elements :");
   for(i=0;i<num;i++)
   {
      scanf("%d",&a[i]);
   }
   for(i=0;i<num;i++)
   {
      sum=sum+a[i];
   }
   avg=(float)sum/num;
   printf("data\n");
   printf("%f",avg);
}