#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
   int *a[3];
   int cols,i,j;
   printf("ENter the colsize:");
   scanf("%d",&cols);
   for(i=0;i<3;i++)
   {
      a[i]=(int*)malloc(sizeof(int)*cols);

   }
   printf("\nEnter the elements::");
   for(i=0;i<3;i++)
   {
      for(j=0;j<cols;j++)
	  {
	     scanf("%d", *(a+i)+j);
	  }
   }
   for(i=0;i<3;i++)
   {
      for(j=0;j<cols;j++)
	  {
	     printf("%d\t", *(*(a+i)+j));
	  }
	  printf("\n\n");
   }
}