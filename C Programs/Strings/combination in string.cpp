#include<stdio.h>
#include<stdlib.h>
int main()
{
	char str[20];
	int i,j;

	printf("Enter String\n");
	flushall();
	gets(str);

	printf("\n\nCombinations of user entered String are\n\n");
	for(i=0;str[i]!='\0';i++)
	{
		for(j=i;str[j]!='\0';j++)
		{
			printf("%c",str[j]);
		}
		if(i!=0)
		{ 
			for(j=0;j<i;j++)
			{
				printf("%c",str[j]);
			}
		}
	printf("\n\n");
	}

	return 0;
}