#include<stdio.h>
void main()
{
   int a[8],i;
    int max;
    int min=0;
   printf("\nEneter the elements:");
   for(int i=0;i<8;i++)
   {
	   scanf("%d",&a[i]);

   }
   max=a[0];
   min=a[0];
   for(i=0;i<8;i++)
   {
	 if(a[i]>max)
	 {
		 max=a[i];
	 }
	  if(a[i]<min)
	 {
		min=a[i];
	 }

   }
   printf("\n");
   printf(" the greatest is:%d\n",max);
   printf("\nthe mininmum is:%d\n",min);

}