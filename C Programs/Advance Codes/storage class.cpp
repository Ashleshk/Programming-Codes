#include<stdio.h>
int printline();
void main()
{
   int r;
   printline();
   printline();
   printline();
   r=printline();
   printf("function calls=%d\n\n",r);
}
int printline()
{
 static int count=0 ;
 printf("$");
 count++;
 return count;
}