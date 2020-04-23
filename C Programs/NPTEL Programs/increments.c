#include<stdio.h>
int sum(int x, int y)
{
  return(++x + ++y);
}
int main()
{
	int i=sum(3,5);
	printf("%d",i);
	scanf("%d",&i);

	return 0;
}