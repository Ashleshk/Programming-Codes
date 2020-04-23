#include<stdio.h>
void main()
{
  int a, b,c,d,e,s;
  printf("\nenter marks of five subject:");
  scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
  s = (a+b+c+d+e)/5;
  printf("the average of marks obtained are:%d ", s);

}