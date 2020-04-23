#include<stdio.h>
int main()
{  void charline(int x);
   int c ;
   c=50;
   charline(c);
   printf("\n\nDATA TYPE\t\tSIZE IN BYTE\n\n");
   charline(c);
   printf("\n\ninteger\t\t\t 2\n\n");
   charline(c);
   printf("\n\ncharacter\t\t 1\n\n");
   charline(c);
   printf("\n\nfloat\t\t\t 4\n\n");
   charline(c);
   return(0);
}
void charline(int x)
{
   int i;
   for(i=0;i<=x;i++)
   {
     printf("*");
   }

}