#include<stdio.h>
#include<string.h>
#include<stdlib.h>
char** accept(char **pname,int n)
{  int i,num;
   char temp[20];
    num=n;
   gets(temp);
   pname=(char**)malloc(sizeof(char*)*num);
  for(i=0;i<num;i++)
  {
     printf("\n\nEnter name of flowers::");
	 flushall();
	 gets(temp);
	 pname[i]=(char*)malloc(strlen(temp)+1);
	 strcpy(pname[i],temp);
  }

   return pname;
}
int main()
{
  int num ,i ;
  char **str=NULL, temp[10];
  printf("Enter number of flowers you want to enter::");
    scanf("%d",&num);
    str=accept(str,num);
    for(i=0;i<num;i++)
  { 
	  printf("\n");
     puts(str[i]);
	 printf("\n");
  }
	   for(i=0;i<num;i++)
  {
     free(str[i]);
  }
  
}