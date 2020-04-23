#include<stdio.h>
void main()
{
  int id[7];
  printf("\nEnter the elements:");
  for(int i=0; i<=6;i++)
  {
     scanf("%d",&id[i]);
     
  }
  for(int i=0; i<=6;i++)
  {
     printf("%d\t",id[i]);
     
  }
}