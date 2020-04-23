#include<stdio.h>
#include<string.h>
void main()
{
  char str[15];
  int i=0 ;
  int l=0 ;
  printf("enter the string :");
  gets(str);
  while(str[i] !='\0')
  {
    i++;
	l++;
  }
  printf("The length is %d",l);
}