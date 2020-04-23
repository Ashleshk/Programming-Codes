#include<stdio.h>

void main()
{
	int i,j,k;

	for(i=1;i<=5;i++)
	{
		printf("\n\n\t");  
		for(j=5;j>=i;j--)
			printf("  ");
		for(j=1,k=i;j<=i;j++,k--)
			printf("%d ",k);
		for(j=2;j<=i;j++)
			printf("%d ",j);

	}
	printf("\n\n\n");
}
