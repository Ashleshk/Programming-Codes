#include<stdio.h>
void main()
{
   int n , i ;
   printf("\nneter number whose multiplication you want to find:");
   scanf("%d",&n);
   for(i=1;i<=10;i++)
   {
      int k ;
	  k = n* i ;
	  printf("\n%dx%d=%d",n,i,k);
   }
   

}