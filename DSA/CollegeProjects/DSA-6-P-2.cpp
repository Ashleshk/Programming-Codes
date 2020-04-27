/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
STACK USING ARRAYT: Write a program in c to implement stack using:
1.array(in this code)                                                                2.linked list 
************************************************************************************************************/
#include<stdio.h>                                           //HEADER FILES
#include<conio.h>
#include<stdlib.h>
 
#define MAX 5  
int stack[MAX];
int top;
/************************************** PUSH-DATA-IN-NEW-STACK **************************************************/
void push( )
{   int token;
    char a;
	do
    {
      if(top==MAX-1)
      {
        printf("\n\nOVERFLOW!!..Stack full\n");
        return;
      }
      printf("\nEnter the token to be inserted:");
      scanf("%d",&token);
      top=top+1;
      stack[top]=token;
      printf("do you want to continue insertion Y/N");
      a=getch();
    }
    while(a=='y');
}
/************************************** POP-DATA-FROM-TACK **********************************/
int pop()
{
     int t;
     if(top==0) 
     {
          printf("\n\nStack UNDERFLOW");top=top-1;
          return -1;
     }
     t=stack[top];
     top=top-1;
     return t;
}
/************************************** DISPLAY **************************************************/
void show()
{
     int i;
     printf("\nThe Stack elements are:\n");
      
	 for(i=top;i>=0;i--)
     {    if(i==top)
	      {printf("%d\t<--TOP\n",stack[i]);}
          
		  else 	  
			  printf("%d\n",stack[i]);
     }
	  if(top==-1)
			  printf("-1\t<--top\nEMPTY STACK");
}
/************************************** MAIN-FUNCTION **************************************************/
int main()
{
     char ch,a='y';
     int choice,token;
     top=-1;
     
     do
     {    printf("\n\t+---------------------------------------+");
		  printf("\n\t*\tMENU\t\t\t\t*\n\t*\t1.Insert\t\t\t*");
		  printf("\n\t*\t2.Delete\t\t\t*");
		  printf("\n\t*\t3.exit\t\t\t\t*");
          printf("\n\t*\tEnter your choice : ");
          scanf("%d",&choice);
		  printf("\t+---------------------------------------+");
          switch(choice)
          {
               case 1:{
                          push();
                          show();
                          break;
                      }              
               case 2:{
						  token=pop();
						  printf("\nThe token deleted is %d",token);
                          show();
                          break;
					  }             
               case 3:{   exit(0);
                          break;
                      }
               default:   printf("Wrong choice");
                          break;
          }
          printf("\nDo you want to continue(y/n):");
          ch=getch();
     }
     while(ch=='y'||ch=='Y');
     getch();
}