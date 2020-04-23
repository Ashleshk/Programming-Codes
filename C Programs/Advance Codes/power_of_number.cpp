#include<stdio.h>
int pow(int x, int y);
int main()
{ 
  int a,b,c ;
  printf("\nEnter number whose power is to be find:");
  scanf("%d",&a);
  printf("\nEnter the index of the number:");
  scanf("%d",&b);
  c=pow(a,b);
  printf("\n the answer is:%d", c);
}
int pow(int x, int y)
{
   int i,z;
   z=1;
   for(i=1;i<=y;i++)
   {
     z=z*x;
   }
   return(z);
}