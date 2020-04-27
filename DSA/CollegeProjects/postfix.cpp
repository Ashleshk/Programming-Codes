/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
POST-FIX: write a program in c to evaluation of postfix expression (input will be postfix expression)
************************************************************************************************************/
#include<stdio.h>
#include<ctype.h>
#include<conio.h>
#define MAX 20
 
typedef struct stack
{
    int data[MAX];
    int top;
}stack;
/************************************** EVALUTION-FUNCTION **************************************************/ 
int evaluate(char x,int op1,int op2)
{
    if(x=='+')
        return(op1+op2);
    if(x=='-')
        return(op1-op2);
    if(x=='*')
        return(op1*op2);
    if(x=='/')
        return(op1/op2);
    if(x=='%')
        return(op1%op2);
}
/**************************************  HOUSE-KEEPING **************************************************/ 
void init(stack *s)
{
    s->top=-1;
}
int empty(stack *s)
{
    if(s->top==-1)
        return(1);
    
    return(0);
}
int full(stack *s)
{
    if(s->top==MAX-1)
        return(1);
    
    return(0);
}
/************************************** PUSH-FUNCTION **************************************************/ 
void push(stack *s,int x)
{
    s->top=s->top+1;
    s->data[s->top]=x;
}
/**************************************  POP-FUNCTION **************************************************/ 
int pop(stack *s)
{
    int x;
    x=s->data[s->top];
    s->top=s->top-1;
    
    return(x);
}
/**************************************  MAIN FUNCTION **************************************************/
void main()
 {  
	  
    stack s;
    char x;
    int op1,op2,val; 
	init(&s);
	
	printf("Enter the expression(eg: 59+3*)\nSingle digit operand and operators only:");
    
    while((x=getchar())!='\n')
    {
        if(isdigit(x))
            push(&s,x-48);        //x-48 for removing the effect of ASCII
        else
        {
            op2=pop(&s);
            op1=pop(&s);
            val=evaluate(x,op1,op2);
            push(&s,val);
        }
    }
    
    val=pop(&s);
    printf("\nValue of expression=%d",val);
    getch();
}
 
