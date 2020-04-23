#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
   int **a;
   int cols,rows,i,j;
   printf("Enter the rowsize:");
   scanf("%d",&rows);
   printf("Enter the colsize:");
   scanf("%d",&cols);
   a=(int**)malloc(sizeof(int)*rows);
   for(i=0;i<rows;i++)
   {
      a[i]=(int*)malloc(sizeof(int)*cols);

   }
   printf("\nEnter the elements::");
   for(i=0;i<rows;i++)
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