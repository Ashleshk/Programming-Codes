#include<stdio.h>
void main()
{
	int i,j ;

   int a[4][4];
   printf("Enter the elements ::");
   for(i=0;i<4;i++)
   {
      for(j=0;j<4;j++)
	  {
	     scanf("%d",&a[i][j]);
	  }
   }
   for(i=0;i<4;i++)
   {  printf("\n\n");
      for(j=0;j<4;j++)
	  {
	     printf("%d\t",a[i][j]);
	  }
   }
     for(i=0;i<4;i++)
   {
      for(j=0;j<4;j++)
	  {
	     if(i<j)
		 {
		    a[i][j]=0;
		 }
	  }
   }
 for(i=0;i<4;i++)
   {  printf("\n\n");
      for(j=0;j<4;j++)
	  {
	     printf("%d\t",a[i][j]);
	  }
   }
}