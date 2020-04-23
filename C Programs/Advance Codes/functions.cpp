#include<stdio.h>
int add(int x,int y)
{  int z;
   z= x + y;
   return(z);
   
}

int main()
{ int add(int x, int y);
  int a , b, c ;
  printf(" Enter any two number: ");
  scanf("%d%d",&a,&b);
  c=add(a,b);
  printf("%d",c);
}
