#include<stdio.h>
struct book
{
   char name[20];
   int pages;
   float pr;

};
void main()
{  
    struct book b1;
	printf("\nEnter name pf the book::");
	gets(b1.name);
	printf("\nenter number of pages::");
	scanf("%d",&b1.pages);
	printf("\nEnter price of the book::");
	scanf("%g",&b1.pr);
	printf("\n\nNAME\t\t\t\PAGES\t\t\tPRICE");
	printf("\n\n%s\t\t\t%d\t\t\t%g",b1.name,b1.pages,b1.pr);
}