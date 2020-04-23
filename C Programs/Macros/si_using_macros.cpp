#include<stdio.h>
#define s(p,n,r)  p*n*r/100
void main()
{  int a,b,c;
  printf("\nENter principale ,time, rate:");
  scanf("%d%d%d",&a,&b,&c);
   printf("%d\n", s(a,b,c));
}