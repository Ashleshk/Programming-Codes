#include<stdio.h>
void main()
{
  int n,flag ;
  flag=0;
  printf("\nEnter number:");
  scanf("%d",&n);
  int i ;
  for(i=2;i<n-1;i++)
  {
    if(n%i==0)
	{
		 printf("not prime");
		 break;
	}
	
  }
  if(i==n)
   {
	   printf("\nthe number is prime.....");

  }
}