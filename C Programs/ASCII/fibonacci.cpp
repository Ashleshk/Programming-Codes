#include<stdio.h>
void main()
{
  int i,num, res =0 ;
  int f=0, s=1 ;
  printf("\nEnter the number;");
  scanf("%d",&num);
  printf("%d \t %d \t ",f, s );
  for(i=1;i<=num;i++)
  {
    res=f+s;
	f=s;
	s=res;
	printf("%d \t",res);
  }
}
