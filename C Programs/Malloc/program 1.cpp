#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void acceptnames(char names)
{
  int i, num ;
  char temp[20];
  printf("\nEnter number of strings");
  scanf("%d",&num);
  names=(char**)malloc(sizeof(char*)*num);
  for(i=0;i<num;i++)
  {
      printf("\nEnter the string:");
	  fflush(stdin);
	  gets(temp);
	  names[i]=(char*)malloc(strlen(temp) +1);
	  strcpy(names[i],temp);
  }

}
int main()
{    char c[4] ;
	 acceptnames(c);
}