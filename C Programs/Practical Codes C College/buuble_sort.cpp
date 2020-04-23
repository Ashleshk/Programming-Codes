#include<stdio.h>
void main()
{  int a[5];
   int i,j, temp ;
   int pass=0,count=0;
   printf("Enter elements:");
   for(i=0;i<5;i++)
   {
   
	   scanf("%d",&a[i]);

   }
   for(i=0;i<5;i++)
   { 
	   for(j=0;j<4;j++)
	   {
	     if(a[j]>a[j+1])
		 {
		    temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		 }
		 count++;

	   }
   pass++;
    
   }
   printf("Array after sorting is:");
    for(i=0;i<5;i++)
   {
   
	   printf("%d\n", a[i]);

   }
}