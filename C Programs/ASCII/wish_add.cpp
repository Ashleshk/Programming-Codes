#include<stdio.h>

void main()
{
  char ch ;
  int a,b,s ;

  do
  {
    printf("\nEnter TWO number:");
	scanf("%d%d",&a,&b);
	s=a+b;
	printf("\nthe sum is:%d",s);
	printf("\ndo yo want to add some more:");
	ch=getchar();
	ch=getchar();
  }while(ch=='Y' &&  ch!='N');

}