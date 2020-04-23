#include<stdio.h>
void bubblrsort(int *a)
{
   int i,j, temp ;
   int pass=0,count=0;
  for(i=0;i<5;i++)
   { 
	   for(j=0;j<5;j++)
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
    for(int i=0;i<5;i++)
   {
   
	   printf("%d\n", a[i]);

   }
   printf("Array after sorting is:");
    for(i=0;i<5;i++)
   {
   
	   printf("%d\n", a[i]);
	}
	printf("\n\ncount=%d and pass=%d\n\n",count,pass);
}
void main()
{  int a[5];
   
   printf("Enter elements:");
   for(int i=0;i<5;i++)
   {
   
	   scanf("%d",&a[i]);

   }
   
	printf("Array before sorting is:");
    for(int i=0;i<5;i++)
   {
   
	   printf("%d\n", a[i]);

   }
	bubblrsort(a);
}