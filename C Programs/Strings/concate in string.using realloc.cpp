#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
int main()
{
	char *one;
	char temp[20];
	int len1,len2 ;
	printf("\n\nEneter the string 1::");
	gets(temp);
	len1=strlen(temp);
	one=(char*)malloc(len1+1);
	strcpy(one, temp);
	puts(one);
	printf("\n\nEnter the string 2::");
	gets(temp);
	len2=strlen(temp);
	one=(char*)realloc(one,len1+len2+1);
	strcat(one,temp);
	puts(one);
	free(one);


return 0;
}