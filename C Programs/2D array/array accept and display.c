#include<stdio.h>

//int display(int a)
//{
//  
//}
void main()
{
	int i,j ;

   int a[3][3], b[3][3];
   printf("Enter the elements ::");
   for(i=0;i<3;i++)
   {
      for(j=0;j<3;j++)
	  {
	     scanf("%d",&a[i][j]);
	  }
   }
   for( i=0;i<3;i++)
   {   printf("\n\n");
      for(j=0;j<3;j++)	
	  {
	     printf("%d\t",a[i][j]);
	  }
   }
     for( i=0;i<3;i++)
   {   printf("\n\n");
      for( j=0;j<3;j++)	
	  {
	     b[j][i]=a[i][j];
	  }
   }
	 for( i=0;i<3;i++)
   {   printf("\n\n");2
      for( j=0;j<3;j++)	
	  {
	     printf("%d\t",b[i][j]);
	  }
   }
	 fflush(stdin);
}