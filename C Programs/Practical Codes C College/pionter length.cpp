#include<stdio.h>
#include<string.h>
void main()
{
  char str[15];
  char *p;
  p=str;
  int i=0 ;
  int l=0 ;
  printf("enter the string :");
  gets(str);
  while( *p !='\0')
  {
    p++;
	l++;
  }
  printf("The length is %d",l);
}