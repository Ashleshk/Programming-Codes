#include<stdio.h>
void main()
{
  int r[7];
  int s=0;
  printf("\nEnter the elements :");
  for(int i=0; i<=6;i++)
  {
     scanf("%d",&r[i]);
     
  }
  for(int i=0; i<=6;i++)
  {
     s=s+r[i];
  }
  printf("\nyour array");
  for(int i=0; i<=6;i++)
  {
     printf("%d\t",r[i]);
     
  }
  printf("\naverage rainfall is: %f\n",(float)s/7);
}