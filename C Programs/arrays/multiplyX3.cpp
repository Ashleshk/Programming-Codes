#include<stdio.h>
void main()
{

  int a[5];
  printf("\nEnter the elements:");
  for(int i=0; i<=4;i++)
  {
     scanf("%d",&a[i]);
     
  }
  for(int i=0; i<=4;i++)
  {
     a[i]=a[i]*3;
  }
  for(int i=0; i<=4;i++)
  {
     printf("%d\t",a[i]);
     
  }
}