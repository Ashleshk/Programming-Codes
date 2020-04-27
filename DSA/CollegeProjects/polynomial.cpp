/********* **************ASHLESH KHAJABGE,ROLLNO-2508*********************************/
/*PROBLEM STATEMENT:
 POLYNOMIAL:  write a c program  for polynomial creation ,display, addition and multiplication
 (using array/linked list)
****************************************** ****************************************/
#include<stdio.h>                                //HEADER FILES
#include<stdlib.h>
#include<conio.h>
typedef struct pnode
{
   int pow;
   int coeff;
   struct pnode *next;
}pnode;

pnode *HEAD,*HEAD1,*HEAD2;
int n,i;
/******************* CREATE-THE-POLY **********************************/
pnode *create(int n){
    pnode *head,*p;
	head=(pnode*)malloc(sizeof(pnode));
	p=head;
	head->next=NULL;
	printf("\nEnter power and coeff :");
	scanf("%d %d",&p->pow,&p->coeff);
	for(i=1;i<n;i++)               //creating node for subsequent terms
	{
		p->next=(pnode*)malloc(sizeof(pnode));
		p=p->next;
		p->next=NULL;
        printf("Enter power and coeff :");
        scanf("%d %d",&p->pow,&p->coeff);
    }
    return(head);
}
/******************* DISPLAY **********************************/
void display(pnode *p)
{
   printf("\n POLYNOMIAL:\t");
   while(p!=NULL)
   {    
    
      if(1)
      {  if(p->next != NULL)
         {   printf("%dx^%d  +  ",p->coeff,p->pow);
	         p=p->next;
         }
         else
         {
             printf("%dx^%d  ",p->coeff,p->pow);
	         p=p->next;
         }
      }
   } 
}
/******************* ADDITION **********************************/
pnode *addpoly(pnode *p1,pnode * p2)
{
   pnode *p3,*r3;
   p3=NULL;

   while(p1!=NULL && p2 !=NULL)
   {
      if(p3==NULL)
	  {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
	  }
	  else
	  {  r3->next=(pnode*)malloc(sizeof(pnode));
	     r3=r3->next;
   	     r3->next=NULL;
      }
	  if(p1->pow<p2->pow)
	  {
		  r3->pow=p2->pow;
		  r3->coeff=p2->coeff;
		  p2=p2->next;
	  }
	  else if(p2->pow<p1->pow)
	  {
		  r3->pow=p1->pow;
		  r3->coeff=p1->coeff;
		  p1=p1->next;
      }
	  else
	  {
		  r3->pow=p1->pow;
		  r3->coeff=p1->coeff+p2->coeff;
		  p1=p1->next;
		  p2=p2->next;
	  }
   }
   while(p1 !=NULL)                 //insert remaining of p1 to p3
   {
     if(p3==NULL)
	 {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
	 }
	 else
	 {  
		 r3->next=(pnode*)malloc(sizeof(pnode));
	     r3=r3->next;
   	     r3->next=NULL;
     }
	 r3->pow=p1->pow;
	 r3->coeff=p1->coeff;
	 p1=p1->next;
   }
   while(p2 !=NULL)                 //insert remaining of p2 to p3
   {
     if(p3==NULL)
	 {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
	 }
	 else
	 {  r3->next=(pnode*)malloc(sizeof(pnode));
	    r3=r3->next;
   	    r3->next=NULL;
     }
	 r3->pow=p2->pow;
	 r3->coeff=p2->coeff;
     p2=p2->next;
   }
   return(p3);
}
/******************* SUBTRACTION **********************************/
pnode *subpoly(pnode *p1,pnode * p2)
{
   pnode *p3,*r3;
   p3=NULL;

   while(p1!=NULL && p2 !=NULL)
   {
      if(p3==NULL)
	  {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
      }
	  else
	  {  
		  r3->next=(pnode*)malloc(sizeof(pnode));
	      r3=r3->next;
   	      r3->next=NULL;
      }
	  if(p1->pow<p2->pow)
	  {
		  r3->pow=p2->pow;
		  r3->coeff=p2->coeff;
		  p2=p2->next;
	  }
	  else if(p2->pow<p1->pow)
	  {
		  r3->pow=p1->pow;
		  r3->coeff=(-1)*p1->coeff;
		  p1=p1->next;
      }
	   else
	  {
		  r3->pow=p1->pow;
		  r3->coeff=p1->coeff-p2->coeff;
		  p1=p1->next;
		  p2=p2->next;
	  }
   }
   while(p1 !=NULL)                 //insert remaining of p1 to p3
   {
      if(p3==NULL)
	  {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
	  }
	  else
	  {  r3->next=(pnode*)malloc(sizeof(pnode));
	     r3=r3->next;
   	     r3->next=NULL;
      }
	  r3->pow=p1->pow;
	  r3->coeff=-1*p1->coeff;
	  p1=p1->next;
   }
   while(p2 !=NULL)                 //insert remaining of p1 o p3
   {
     if(p3==NULL)
	 {
	    p3=r3=(pnode*)malloc(sizeof(pnode));
		r3->next=NULL;
	 }
	  else
	  {  
		 r3->next=(pnode*)malloc(sizeof(pnode));
	     r3=r3->next;
   	     r3->next=NULL;
	  }
	  r3->pow=p2->pow;
	  r3->coeff=p2->coeff;
	  p2=p2->next;
   }
   return(p3);
}
/******************* MULTIPLY **********************************/
pnode * multi_term(pnode *p1, pnode *x)
{
   pnode *N ,*r3;
   N =NULL;
   while(p1!=NULL)
   {
      if(N==NULL)
	  { 
		  r3=N=(pnode*)malloc(sizeof(pnode));
		  r3->next=NULL;
  
	  }
	  else
	  {  
		 r3->next=(pnode*)malloc(sizeof(pnode));
	     r3=r3->next;
   	     r3->next=NULL;
	  }
	  r3->coeff=(p1->coeff)*(x->coeff);
	  r3->pow=p1->pow +x->pow;
	  p1=p1->next;
   }
   return(N);
}
pnode * multiply(pnode *p1,pnode*p2)
{
	 pnode *temp,*r3,*p3;
     r3=p3=NULL;
	 while(p2!=NULL)
	 {   
	    temp=multi_term(p1,p2);
		r3=addpoly(r3,temp);
		p2=p2->next;
	 }
	 display(r3);
	 return(p3);
}
/************************************** MAIN-FUNCTION **************************************************/
void main()
{    
	 int ch;
	 do{
	 printf("\n\t+---------------------------------------+");
	 printf("\n\t*\tMENU\t\t\t\t*\
			 \n\t*\t1.CREATE POLY-1\t\t\t*\
			\n\t*\t2.CREATE POLY-2\t\t\t*\
			\n\t*\t3.DISPLAY\t\t\t*\
			\n\t*\t4.ADDITION\t\t\t*\
			\n\t*\t5.SUBTRACTION\t\t\t*\
			\n\t*\t6.MULTIPLICATION\t\t*\
			\n\t*\t7.EXIT\t\t\t\t*\
			\n\t*\t CHOOSE YOUR OPTION :");
	 scanf("%d",&ch);
	 printf("\t+---------------------------------------+\n");
	 switch(ch)
	 {
	 case 1:{
			    printf("\nEnter the no. of terms:");
	            scanf("%d",&n);
	            HEAD1=create(n);
 	            display(HEAD1);
				break;
			}
	 case 2:{
		        printf("\nEnter the no. of terms:");
	            scanf("%d",&n);
	            HEAD2=create(n);
 	            display(HEAD2);
				break;
			}
	 case 3:{  
		       display(HEAD1);
			   display(HEAD2);
			   break;
			}
	 case 4:{
			   printf("\naddition  is");
	           HEAD=addpoly(HEAD1,HEAD2);
	           display(HEAD);
			   break;
			}
	 case 5:{
			   printf("\nsubtraction (2-1)is");
	           HEAD=subpoly(HEAD1,HEAD2);
	           display(HEAD);
			   printf("\nsubtraction  (1-2)is");
	           HEAD=subpoly(HEAD2,HEAD1);
	           display(HEAD);
			   break;
			}
	 case 6:{
			   printf("\n multiplication  is");
	           HEAD=multiply(HEAD1,HEAD2);
			   break;
			} 
	 case 7:  exit(0);
	 default:
		 printf("INVALID OPTION....");
	 }
	  printf("\ndo you want to continue press 1 for yes or other for no : ");
	  scanf("%d",&ch);
	 }while(ch<7);
    getch();
 }
