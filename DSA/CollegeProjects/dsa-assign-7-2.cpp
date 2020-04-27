
/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
QUEUE USING LINKED-LIST: Write a program in c to implement queue using:
1.array                                                               2.linked list (in this code) 
************************************************************************************************************/
#include<stdio.h>                                                               //header files
#include<stdlib.h>
 
 typedef struct  node
 { 
       int data;
	   struct node *next;
 }node;
int i=0,val,ch;
/************************************************************************************************************/
 node *create()
{   
    node *head, *first, *temp = 0;
    first = 0;
    while(ch)
    {
        head  = (node *)malloc(sizeof(node));
        printf("\nEnter the data item :\t");
        scanf("%d", &head-> data);
        if (first != 0)
        {
            temp->next = head;
            temp = head;
        }
        else
        {
            first = temp = head;
        }
        fflush(stdin);                               //free stdin buffer
		  
        printf("Do you want to continue(Type 0 or 1)? : ");
        scanf("%d", &ch);
    }
    temp->next = 0;                                /*  reset temp to the beginning */
    temp = first;
	return(temp);
}
/************************************** DISPLAY **************************************************/
 node *display(node *head)
{   node *q;
    q=head;
    printf("\nFRONT");
	while(q!=NULL)
	{
		printf("->%d",q->data);
		q=q->next;
	}
	printf("<-REAR");
	return(head);
}
/************************************** ENQUEUE-(INSERT-AT-END) **************************************************/
node *push(node * head,int x)
{
	node *p,*q;
	p =(node*)malloc(sizeof(node));
	p->data=x;
	p->next=NULL; 
	if(head==NULL)  
	{ 
		return(p);
	}
    q=head;
	while(q->next!=NULL)
	{ 
		q=q->next;
	}
	q->next=p; 
	printf("\n...NODE ADDED SUCCCESSFULLY ...");
    return(head);
}
/************************************** DEQUEUE-(DELETE-AT-FRONT) **************************************************/
node *pop(node *head, int x)
{
	node *p,*q;
	int i;
	if(x==1)
	{
	   p=head;
	   head=head->next;
	   free(p);
	}
	q=head;
	if(q==NULL)
	{
	    printf("\nUNDERFLOW");
		return(head);
	}
	printf("\n...NODE DELETED SUCCCESSFULLY ...");
	return(head);
}
/************************************** MAIN-FUNCTION **************************************************/
void main()
{  node *HEAD=NULL;
   
   do
   { printf("\n\t+---------------------------------------+");
	 printf("\n\t*\tMENU\t\t\t\t*\
			\n\t*\t1.CREATE\t\t\t*\t\
			 \n\t*\t2.INSERT\t\t\t*\
			\n\t*\t3.DELETE\t\t\t*\
			\n\t*\t4.DISPLAY\t\t\t*\
			\n\t*\t5.EXIT\t\t\t\t*\
			\n\t*\t CHOOSE YOUR OPTION :");
	 scanf("%d",&ch);
	 printf("\t+---------------------------------------+\n");
	 switch(ch)
	 {
	 case 1: HEAD=create();
		     break;
	 case 2:   printf("\nEnter data :\t");
		       scanf("%d",&val);
			   
		       HEAD=push(HEAD,val);
		        break;
	  case 3:  HEAD= pop(HEAD,1);
	 	        break;
	  case 4:   display(HEAD);
		        break;
	  case 5:   exit(0);
	 default: printf("\nINVALID INPUT !!");
	 }
    
   printf("\n\ndo you want to continue press 1 for yes or other for no : ");
   scanf("%d",&ch);
  }while(ch==1);
}