#include<stdio.h>
#define SQUARE(i) i*i 
#define CUBE(i) SQUARE(i)*i
void main()
{  
    int a;
	printf("\nEnter the number:");
    scanf("%d",&a);
	printf("\nthe square of number %d is %d:",a,SQUARE(a));
	printf("\nthe cube of number %d is %d:\n\n",a,CUBE(a));
}