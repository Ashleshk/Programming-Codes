#include<stdio.h>
int area(int x);
void main()
{
   int a , b ;
   printf("Enter the radius of the circle:");
   scanf("%d",&a);
   b=area(a);

}
int area(int x)
{
  int z ;
  z=(22*x*x)/7;
  printf("The are of circle having radius %d is:%d\n\n",x,z);
  return(0);
}