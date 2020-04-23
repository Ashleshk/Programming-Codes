#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
const int MAX = 20;
 
class IntoPost
{
   int top;
   char infixexp[MAX];
   char st[MAX];
   char postfixexp[MAX];
   char c;
   char symbol;
public:
   IntoPost()
    {
	   top = -1;
	}
   void setexp()
   {
		cout<<"Enter the infix experation"<<endl;
		cin.getline(infixexp,20);
		//cout<<"dfsdf"<<infixexp;
	}
   void checkexp();
   void push(char c)
	{
		if(top == MAX -1)
		{
			cout<<"Stack is full"<<endl;
			return;
		}
		top++;
		st[top] = c;
	}
   char pop()
   {
		if(top == -1)
		  {
			  cout<<"Stack is empty"<<endl;
			  return NULL;
		  }
		  char dchar =st[top];
		  top--;
		  return dchar;
   }
   int priority(char);
   void evalutionpostfix();
   void displaypostfix()
	{
		int l = strlen(infixexp);
		for(int j=0;j<l;j++)
		{
			cout<<postfixexp[j];
		}
	}
};
 
void IntoPost::checkexp()
{  int k=0;
   int l = strlen(infixexp);
   //cout<<l;
   for(int i=0;i<l;i++)
   {
     switch(infixexp[i])
     {
     case '(': push(infixexp[i]);
               break;
     case ')':  while('(')
                 { 
    	            postfixexp[k] = pop();
					k++;
					 
    	         }

               break;
     case '$':
     case '*':
     case '/':
     case '+':
     case '-':
    	       if(top == -1)
    	    	   push(infixexp[i]);
    	       else
    	       {   symbol=pop();
    	    	   if(!(priority(infixexp[i])<=priority(symbol)))
    	    		{   push(symbol);
						push(infixexp[i]);
					}
    	    	   else
    	    		{   
						postfixexp[k] =symbol;
						push(infixexp[i]);
						k++;
				   }
    	       }
    	       break;
    default:
    	      postfixexp[k] = infixexp[i];
			  k++;
    	      break;
         }
	 
   }
   while(top!=-1)
   {
      postfixexp[k]=pop();
	  k++;
   }
}
 
int IntoPost::priority(char symbol)
{
   if(symbol == '$')
	    return 4;
   else if(symbol == '*' || symbol == '/')
	    return 3;
   else if(symbol == '-')
		return 2;
   else if(symbol == '+' )
	    return 1;

}
void IntoPost::evalutionpostfix()
{
  
}
int main()
{
   IntoPost i;
   i.setexp();
   i.checkexp();
   i.displaypostfix();
   
   ////         expression               /////
   // evalution
   i.setexp();
   i.checkexp();
   i.displaypostfix();
   i.evalutionpostfix();

   getch();
   return 0;
}

 
