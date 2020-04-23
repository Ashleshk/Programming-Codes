#include<stdio.h>
int main()
{
	int i,j ;
	char ch,n;
	printf("\nEnter character:");
	scanf("%c",&ch);
	i=int(ch);
	if(i>=97 && i<=127)
	{
	   j=i-32;
	   printf("\nthe converted form is %c\n\n",j);
	}
	else if(i>=65 && i<=90)
	{
	
	  j=i+32;
	  printf("\n the converted form is %c\n\n", j);
	}
	else
	{
	 printf("\n\ninvalid character!@!!!!!!!!");
	}
	return 0 ;
}