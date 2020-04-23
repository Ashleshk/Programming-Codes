#include<stdio.h>
struct book
{
   char name[20];
   int pages;
   float pr;
   char author[20];
   char pub[20];

};
void main()
{    int i,n;
    struct book b1[50];
	printf("Enter the number of books you want to enter::");
	scanf("%d",&n);

	for(i=0;i<n;i++)
	{
	printf("\nEnter name pf the book::");
	scanf("%s",b1[i].name);
	printf("\nenter number of pages::");
	scanf("%d",&b1[i].pages);
	printf("\nEnter price of the book::");
	scanf("%g",&b1[i].pr);
	printf("\nEnter author::");
	scanf("%s",b1[i].author);
	printf("\nEnter publisher ::");
	scanf("%s",b1[i].pub);
	}
	for(i=0;i<n;i++)
	{
	    printf("\n\nNAME || PAGES || PRICE || AUTHOR || PUBLISHER \n");
		printf("\n\n%s\t%d\t%g\t%s\t%s\n\n",b1[i].name,b1[i].pages,b1[i].pr,b1[i].author,b1[i].pub);
	}
}