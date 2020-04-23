#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
  int num ,i ;
  char **str, temp[10];
  printf("Enter number of string::");
  scanf("%d",&num);
  str=(char**)malloc(sizeof(char*)*num);
  for(i=0;i<num;i++)
  {
     printf("\n\nEnter strings:");
	 flushall();
	 gets(temp);
	 str[i]=(char*)malloc(strlen(temp)+1);
	 strcpy(str[i],temp);
  }
    for(i=0;i<num;i++)
  {
     puts(str[i]);
  }
	   for(i=0;i<num;i++)
  {
     free(str[i]);
  }
}