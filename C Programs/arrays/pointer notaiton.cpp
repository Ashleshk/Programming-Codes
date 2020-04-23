#include<stdio.h>
void main()
{
   int marks[5];
   printf("\nEnter the elements;");
   for(int i=0;i<5;i++)
   {
	   scanf("%d",(marks +i));

   }
   printf("your elements:");
   for(int i=0;i<5;i++)
   {
	   printf("%d\t",*(marks +i));

   }
}