/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
SINGLE LINKED LIST: Write a program in c to implement singly linked list with operation:
1.create     2.print      3.delete    4.insert     5.sort        6.search     7.concate   
************************************************************************************************************/
#include<stdio.h>                                       //header files
#include<conio.h>
#include<stdlib.h>
typedef struct node                                    // node declaration
{
     int data ;
     struct node *next;	
}node;
int total_nodes=0; //globalised node-counter
/********************* CREATE-A-NODE *****************************************/
node *create()
{   
    node *head, *first, *temp = 0;
    int count = 0,choice = 1;
    first = 0;
    
	while (choice)
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
		total_nodes++;
        printf("Do you want to continue(Type 0 or 1)? : ");
        scanf("%d", &choice);
    }
    temp->next = 0;                                /*  reset temp to the beginning */
    temp = first;
	return(temp);
}
/********************* DISPLAY-SLL *****************************************/
node * print(node *head)
{   node *q;
    q=head;
    printf("\nHEAD->");
	while(q!=NULL)
	{
		printf("%d->",q->data);
		q=q->next;
	}
	printf("NULL");
	printf("\n\nno of nodes =%d",total_nodes);
	return(head);
}
/*********************INSERTION-IN-BEGINNING *****************************************/
node *insert_beg(node * head,int x)
{
	node *p,*q;int i;
	p =(node*)malloc(sizeof(node));
	p->data=x;
	p->next=NULL;
	if(head==NULL)  
	  return(p);
	q=head;
	p->next=q;
	head=p;
	total_nodes++;
	printf("\n...NODE ADDED SUCCCESSFULLY ...");
 return(head);
}
/********************* INSERTION-IN-BETWEEN *****************************************/
node *insert(node *head,int x,int key)
{
	node *p,*q;int i;
	p =(node*)malloc(sizeof(node));
	p->data=x;
	if(key==-1)
	{
	   p->next=head;
	   head=p;
	}
	else
	{ 
	  q=head;
	  for(i=1;i<key-1;i++)
	  {
		  if(q!=NULL)
		  {
		     q=q->next;
		  }
		  else
		  {
		     printf("\nOVERFLOW");
			 return(head);
		  }
      }
	  p->next=q->next;
		  q->next=p;
     }
	total_nodes++;
	printf("\n...NODE ADDED SUCCCESSFULLY ...");
	return(head);
}
/********************* INSERTION-AT-END *****************************************/
node *insert_end(node * head,int x)
{
	node *p,*q;int i;
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
	q->next=p;total_nodes++;
	printf("\n...NODE ADDED SUCCCESSFULLY ...");
 return(head);
}
/********************* DELETE-NODE-IN-BETWEEN/START*****************************************/
node *delete_node(node * head, int x)
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
	for(i=1;i<x-1;i++)
    {     
		q=q->next;
	}
	if(q==NULL)
	{
	    printf("\nUNDERFLOW");
		return(head);
	}
	p=q->next;
	q->next=p->next;
	free(p);
    total_nodes--;
	printf("\n...NODE DELETED SUCCCESSFULLY ...");
	return(head);
}
/********************* DELETE-END-DEFINATION *****************************************/
node *delete_end(node *head)
{
	node *p,*q;
	if(head->next==NULL)
	{
	   free(head);
	   head=NULL;
	   total_nodes--;
	   return(head);
	}
	q=head;
	while(q->next->next !=NULL)
	{     q=q->next;
	}
	p=q->next;
	free(p);
	q->next=NULL;
	total_nodes--;
	printf("\n...NODE DELETED SUCCCESSFULLY ...");
	return(head);
}
/********************* SORT-ALL-NODE-BY-DATA *****************************************/
void sort(node * head)
{
   node *p,*q;
   int i,j,temp;
   for(i=1;i<total_nodes;i++)
   {
      p=head;
	  q=p->next;
	  for(j=0;j<total_nodes-i;j++)
	  {
		  if(p->data >q->data)
		  {
		     temp=p->data;
			 p->data=q->data;
			 q->data=temp;
		  }
		  p=q;
		  q=q->next;
	  }
   }
}
/********************* CONCATE-TWO LIST *****************************************/
node *concatenate(node *head1)
{
    node *head2=NULL;
	int n,conti;
	
	head2=create();
	node *p;
	if(head1==NULL)
		return(head2);
	if(head2==NULL)
		return(head1);
	p=head1;
	while(p->next!=NULL)
		p=p->next;
	p->next=head2;
	return(head1);
}
/********************* SEARCH NODE *****************************************/
int search(node *head,int x)
{
   int i=1;
   node * p;
   p =head;
   while(p!=NULL)
   {
	   if(p->data==x)
	   {
	     return(i); 
	   }
	   i++;
	   p=p->next;
   }
   return(-1);
}
/********************* END-OF-FUNCTION-DEFINATION *****************************************/
void main()
{
	node *HEAD=NULL;
	int number,u,ch,conti;
	 
	do{
	printf("\n\t+---------------------------------------------------------------+");
	printf(" \n\t+\t\tMENU \t\t\t\t\t\t+\n\t+\t\t1.CREATE A SLL\t\t\t\t\t+\n\t+\t\t2.DISPLAY THE SLL\t\t\t\t+\n\t+\t\t");
	printf("3.INSERTION\t\t\t\t\t+\n\t+\t\t4.SORT THE SLL\t\t\t\t\t+\n\t+\t\t5.DELETION\t\t\t\t\t+\n\t+\t\t6.SEARCHING\t\t\t\t\t");
	printf("+\n\t+\t\t7.CONCATENATION\t\t\t\t\t+\n\t+\t\t8.exit\t\t\t\t\t\t+\n\t+\t\t(CHOOSE YOUR OPTION) : ");
	scanf("%d",&ch);
	printf("\t+---------------------------------------------------------------+");
	switch(ch)
	{
	    case 1:{     HEAD=create();    //CREATE CALL
	 				 break;
			   } 
		case 2:{    HEAD=print(HEAD);   //PRINTING LIST
					 break;
		       }
		case 3:{    int ch1,value,loc;
			        printf("\n\t+---------------------------------------------------------------+");
		            printf("\n\t+\t\tINSERTION MENU: \t\t\t\t+\n\t+\t\t1. INSERT AT BEGINNING\t\t\t\t+\n\t+\t\t");
					printf("2.INSERT IN BETWEEN(LOC)\t\t\t+\n\t+\t\t3.INSERT AT END\t\t\t\t\t+\n\t+\t\t4.BACK\t\t\t\t\t\t");
					printf("+\n\t+\t\t(CHOOSE YOUR OPTION) :");
		            scanf("%d",&ch1);
					printf("\t+---------------------------------------------------------------+");
					if(ch1 !=4)
		            { printf("\nENTER THE DATA FOR NEW NODE:");
		              scanf("%d",&value);
					}
		         	switch(ch1)
		         	{
		         	   case 1: 	{ 
		         	   	          HEAD=insert_beg(HEAD,value);
		         	   	          break;
						}
						case 2:{  printf("\nENTER THE LOCATION(1-SIZE):");
								  scanf("%d",&loc);
						          HEAD=insert(HEAD,value,loc);
						          break;
						       }
						case 3:{  HEAD=insert_end(HEAD,value);
						          break;
						       }
						case 4: break; 
					}
					if(ch1 !=4)
					{
					   printf("\n");
                        HEAD=print(HEAD);		//PRINTING NEW LIST			
					}
					break;
		      } 
        case 4:{    sort(HEAD);                //SORT CALL
        			printf("\n");
	                HEAD=print(HEAD); 
			        break;
		       }
		case 5:{    int ch2,loc,delval;
			        printf("\n\t+---------------------------------------------------------------+");
		            printf("\n\t+\t\tDELETION MENU: \t\t\t\t\t+\n\t+\t\t1. DELETE AT BEGINNING\t\t\t\t+\n\t+\t\t2.DELETE IN BETWEEN(LOC)");
					printf("\t\t\t+\n\t+\t\t3.DELETE AT END\t\t\t\t\t+\n\t+\t\t4.BACK\t\t\t\t\t\t+\n\t+\t\t(CHOOSE YOUR OPTION):");
		            scanf("%d",&ch2);
					printf("\t+---------------------------------------------------------------+");
		            switch(ch2)
		            {  case 1:{   //delval=HEAD->data;
					              HEAD=delete_node(HEAD,1);
								  break;
					          }
					   case 2:{   printf("\nEnter the loc of node which you want to delete:");
					    		  scanf("%d",&loc);
					              HEAD=delete_node(HEAD,loc);
								  break;
						      }
					   case 3:{   HEAD=delete_end(HEAD);
						          break;
					          }
					   case 4:    break;
					}
					if(ch2 !=4)
					{
					   printf("\n");
					   HEAD=print(HEAD);          //PRINTING MODIFIED LIST
					}
			        break;
		       } 
	  
	   case 6:{    int sval;
	               printf("\nenter data to be searched: ");
	               scanf("%d",&sval);
				   u=search(HEAD,sval);                //SEARCH CALL
				   printf("\n");
	               if(u==-1)
	               { printf("not found\n");
	               }
	               else
	                  printf("found at position %d",u);
		           break;
	          }	
       case 7:{    HEAD=concatenate(HEAD);            // CONCATENATION CALL
	               printf("\n");
	               HEAD=print(HEAD);
		           break;
	          }
	   case 8:  exit(0);		  	   	
	   default: printf("INVALID CHOICE !!!!!!!!");
   }
   
   printf("\ndo you want to continue(press 1 to continue else other integer) : ");
   scanf("%d",&conti);
   }while(conti==1);
   free(HEAD);
   getch();
}

	 
