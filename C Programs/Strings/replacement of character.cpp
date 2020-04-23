#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{   char s[20];
    int i,j,k;
	printf("\n\nEnter the string::");
	gets(s);
	k=strlen(s);
	for(i=0;i<k ;i++)
	{
	   if(s[i]=='a'||s[i]=='A')
	   {
	      s[i]='e';
	   }
	}
	puts(s);


	return 0;
}