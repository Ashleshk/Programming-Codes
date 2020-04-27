/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
STACK USING LINKED LIST: Write a program in c to implement stack using:
1.array                                                                2.linked list (in this code)
************************************************************************************************************/
#include<stdio.h>                                      //HEADER FILES
#include<conio.h>
#include<stdlib.h>
 
typedef struct stack                                 // STACK NODE
{
  int data;
  struct stack *next;
}stack;

stack s,*top,*p;                                     //GLOBAL VARIABLE
int size=5;
/************************************** HOUSE-KEEPING-STUFF **************************************************/
void init(stack *s)
{
  s->next=NULL;
  printf("\ninitialization successful..");
}
int empty(stack*s)
{
  if(s->next==NULL)
     return(1);
return(0);
}
/**************************************  PUSH-OPERATION **************************************************/
stack* push(stack *s, int x)
{    p=(stack*)malloc(sizeof(stack));	
	 p->data=x;	
     p->next=top;
	 top=p;
     return(top);
}
/************************************** POP-OPERATION **************************************************/
stack* pop(stack *top)
{
  int x;
  if(top ==NULL)
  {	printf("\nUNDEFLOW !!.. CANNOT POP MORE...");}
  else
  {   
	   p=top;
	   top=top->next;
	   free(p);
	   printf("\nPOP SUCCESSFUL....");
  }
  return(top);
}
/**************************************  PRINT-THE-STACK **************************************************/
stack* printstack(stack *top)
{    
	 p=top;
     printf("\n\nCONTENTS OF THE  STACK:");
	 printf("TOP-->");
	 while(p !=NULL)
	 {
	   printf("(%d)-->",p->data);
	   p=p->next;
	 }
	 printf("NULL");
	 return(top);
}
/************************************** PUSH-DATA-IN-NEW-STACKV**************************************************/
void pushstack()
{  
	int c=1,value;
	if(top==NULL)
	{
	    top=(stack*)malloc(sizeof(stack));
	    printf("\nENTER THE VALUE:");
	    scanf("%d",&top->data);
        top->next=NULL;
	}
	while(c==1) 
	{      p=(stack*)malloc(sizeof(stack));
	       p->next=NULL;
		   printf("\nENTER THE VALUE:");
		   scanf("%d",&p->data);
		   p->next=top;
		   top=p;
	        
	       printf("\nDO YOU WANT TO ADD(press 1) OR STOP(any other key):");
		   scanf("%d",&c);
	} 
	printstack(top);
}
/**************************************  MAIN FUNCTION**************************************************/
void main()
{
	 int choice,ch;
	 
	 do{
		 printf("\n\t+---------------------------------------+");
	    printf("\n\t*\tMENU\t\t\t\t*\n\t*\t1.INITIALIZE STACK\t\t*\n\t*\t2.GETSTACK\t\t\t*\n\t*\t3.PRINTSTACK\t\t\t*\n\t*\t4.PUSH\t\t\t\t*\n\t*\t5.POP\t\t\t\t*\n\t*\t6.EXIT\t\t\t\t*\n\t*\tENTER YOUR CHOICE:");
	 scanf("%d",&choice);
	 printf("\t+---------------------------------------+");
	 switch(choice)
	 { 
	  case 1:{   init(&s); 
	             top= printstack(top);
				 break;
	         }
	  case 2:{
			     pushstack( );
			     break;
			 }
	  case 3:{
	             top=printstack(top);
			     break;
	         }
	  case 4:{   
		         int val,c=1;
		         do{
		              if(c==1)
					  {
		                 printf("\nenter the new data:");
			             scanf("%d",&val);
			             push(top,val);
			             top= printstack(top);
					  }
			          else
				         break;
			          printf("\nDO YOU WANT TO ADD(1) OR STOP(any other key):");
		              scanf("%d",&c);
		           }while(c==1);
			     break;
		     }
	  case 5:{   int c=0;
		         do{
					 printf("\nAre you sure you want to POP");
					 printf("\n(press 1 for yes, press other for no):");
				      scanf("%d",&c);
				     if(c==1)
					    top= pop(top);
				     else
					     break;
			         printf("\nDO YOU WANT TO pop(1) OR STOP(any other key):");
		             scanf("%d",&c);
		            }while(c==1);
				 break;
			}
	  case 6:{ exit(0);}
	 default:printf("\nenter the valid choice(1-6):");
	 }
	  printf("\ndo you want to continue(press 1 to continue else other integer) : ");
   scanf("%d",&ch);
	 }while(ch==1);
}
 