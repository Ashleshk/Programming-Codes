#include<stdio.h>
int main()
{
    int i,n , j ;
	j =1;
	printf("\nEnter number:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	   j=j*i;
	}
	printf("\n factorial is:%d",j);
}

