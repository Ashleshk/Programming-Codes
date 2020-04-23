#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
  int num ,i ;
  char **str, temp[10];
  printf("Enter number of flowers you want to enter::");
  scanf("%d",&num);
  str=(char**)malloc(sizeof(char*)*num);
  for(i=0;i<num;i++)
  {
     printf("\n\nEnter name of flowers::");
	 flushall();
	 gets(temp);
	 str[i]=(char*)malloc(strlen(temp)+1);
	 strcpy(str[i],temp);
  }
    for(i=0;i<num;i++)
  {
     puts(str[i]);
	 printf("\n");
  }
	   for(i=0;i<num;i++)
  {
     free(str[i]);
  }
}