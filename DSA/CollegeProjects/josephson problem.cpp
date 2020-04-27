#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node
{   int id;
struct node *next;
};
node *p,*q,*h;
void main()
{
      int k ,l ;
	  int i , count ;
	  printf("\nenter number of players:");
	  scanf("%d",&k);
	  printf("\nenter the mth element you wanr to delete");
	  scanf("%d",&l);
	  p=q=h=(node*)malloc(sizeof(struct node));
	  p->id=1;
	  for(i=2;i<=k;i++)
	  {
		  p->next=(node*)malloc(sizeof(struct node));
		 
		  p=p->next; p->id=i;
	  }
	  p->next=q;
	  p=h;
	  for(i=0;i<k;i++)
	  {
		  printf("%d\t",p->id);
		  p=p->next;
	  }
	  for(count=k;count>1;--count)
	  {
	     for(i=0;i<l-1;i++)
		 {
			 p=p->next;
		 }
		 p=p->next->next;
	  }
	  printf("\nast player standing is %d",p->id);
	  getch();
	  //for

}