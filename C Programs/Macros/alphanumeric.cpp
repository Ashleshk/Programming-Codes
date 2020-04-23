#include<stdio.h>
#include<ctype.h>
#define check(ch) isalpha(ch)?printf("\nyou entered char\n\n"):printf("\nyou entered non char\n\n") 
void main()
{
   char ch ;
   printf("\nEnter character:");
   scanf("%c",&ch);
   check(ch);

}