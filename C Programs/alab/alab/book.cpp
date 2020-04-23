#include<stdio.h>
void accept();

typedef struct book 
{   
    int id;
   char name[20];
  
   float pr;

}Book; 
void display(book);
void main()
{  
   
   accept();
}
void accept()
{
    Book b1[3];
	for(int i=0;i<3;i++)
	{
	printf("\nenter ID of the book::");
	scanf("%d",&b1[i].id);
	printf("\nEnter name pf the book::");
	flushall();
	gets(b1[i].name);
	printf("\nEnter price of the book::");
	scanf("%g",&b1[i].pr);
	}
	printf("\n\nbook ID\t\t\tNAME\t\t\tPrice\n\n");
	for(int i=0;i<3;i++)
	{   display(b1[i]);

	}
}
void display(Book x)
{
    
	
	
	printf("\n\n%d\t\t\t%s\t\t\t%g",x.id,x.name,x.pr);
	
}