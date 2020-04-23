#include<stdio.h>
#define one 1 
#define two one + one 
#define error  printf("\ndivide by zero error")
void main()
{
   int a,b ;
   printf("\nEnter two number:");
   scanf("%d%d",&a,&b);
   printf("\n%d",two);
   if(b==0)
   {
     error;
   }

}
