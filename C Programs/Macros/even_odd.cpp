#include<stdio.h>
#define check(n)    if(n%2==0)\
                    {\
					printf("EVEN\n\n");\
					}\
                    else\
                    {\
					printf("ODD\n\n");\
                    }\
                    
void main()
{
   int num ;
   printf("enter number:");
   scanf("%d",&num);
   check(num);

}