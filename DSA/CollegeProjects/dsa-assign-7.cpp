
/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
QUEUE USING ARRAY: Write a program in c to implement queue using:
1.array(in this code)                                                                2.linked list 
************************************************************************************************************/
#include<stdio.h>
#include<stdlib.h>
 
#define MAX 15
int n ,i=0,val,ch;
int que[MAX];
int fnt=-1,rer=-1;
/************************************** DISPLAY **************************************************/
 void display()
{
	int i;
    if (fnt == - 1)
        printf("\nQueue is empty  ");
    else
    {
        printf("\nQueue is : \n");
		printf("FRONT-->|");
        for (i = fnt; i <= rer; i++)
            printf("|  %d   |", que[i]);
         
		printf("|<--REAR \n");
    }
}  
/************************************** ENQUEUE-(INSERT-AT-END) **************************************************/
void insert(int val)
{    
	do{
          printf("\nEnter the elements to be entered : ");
	      scanf("%d",&val);
	  
	      if(rer < MAX-1)
	      {  
		      if(fnt==-1)
			     fnt=0;
	          rer=rer+1;
	          que[rer]=val;
	      }
	      else
	      {
	          printf("\nOVERLOAD !! ... cannot insert new element");
		      return;
	      }
	      display();
	      printf("\npress 1 to insert or other to end inserting  : ");
          scanf("%d",&n);  
     }while(n==1);
}
/************************************** DEQUEUE-(DELETE-AT-FRONT) **************************************************/
void Delete()
{  
	do{
 	      if(fnt >=rer || fnt==-1)
	      {
	           printf("\nQUEUE UNDERFLOW !!..STACK EMPTY");
	           return;
	      }
	      else
	      {
	           printf("\n the value deleted form queue is %d ...",que[fnt]);
		       fnt=fnt+1;
	      } 
	      printf("\npress 1 to delete 1 more or other to stop : ");
	      scanf("%d",&n);
      }while(n==1);
}
/************************************** MAIN-FUNCTION **************************************************/
void main()
{
   do
   { printf("\n\t+---------------------------------------+");
	 printf("\n\t*\tMENU\t\t\t\t*\
			 \n\t*\t1.INSERT\t\t\t*\
			\n\t*\t2.DELETE\t\t\t*\
			\n\t*\t3.DISPLAY\t\t\t*\
			\n\t*\t4.EXIT\t\t\t\t*\
			\n\t*\t CHOOSE YOUR OPTION :");
	 scanf("%d",&ch);
	 printf("\t+---------------------------------------+\n");
	 switch(ch)
	 {
	  case 1:   insert(val);
		        break;
	  case 2:   Delete();
	 	        break;
	  case 3:   display();
		        break;
	  case 4:   break;
	 default: printf("\nINVALID INPUT !!");
	 }
    
   printf("\n\ndo you want to continue press 1 for yes or other for no : ");
   scanf("%d",&n);
  }while(n==1);
}