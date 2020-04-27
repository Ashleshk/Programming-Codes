/*
 * assign8.cpp
 *
 *  Created on: Sep 22, 2017
 *      Author: pict
 */
/*
 *  Implement C++ program for expression conversion as infix to postfix and its evaluation
 *  using stack based on given conditions:  Operands and operator, both must be single
 *  character, Input Postfix expression must be in a desired format, Only '+', '-', '*' and '/'
 *  operators are expected.
 *
 */
#include<iostream>
#include<string.h>
const int MAX = 20;
using namespace std;
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
   void setexp();
   void checkexp();
   void push(char);
   char pop();
   int priority(char);
   void displaypostfix();
};
void IntoPost::setexp()
{
  cout<<"Enter the infix experation"<<endl;
  cin.getline(infixexp,20);
}
void IntoPost::checkexp()
{
   int l = strlen(infixexp);
   for(int i=0;i<l;i++)
   {
     switch(infixexp[i])
     {
     case '(': push(infixexp[i]);
               break;
     case ')':  while('(')
                 {
    	            postfixexp[] = pop();
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
    	       {
    	    	   if(priority(infixexp[i])>=priority(symbol))
    	    		   push(infixexp[i]);
    	    	   else
    	    		   postfixexp[] = pop();
    	       }
    	       break;
    default:
    	      postfixexp[] = infixexp[i];
    	      break;
         }
   }
}
void IntoPost::displaypostfix()
{
	int l = strlen(infixexp);
   for(int j=0;j<l;j++)
   {
	   cout<<"Postfix experation : "<<postfixexp[j];
    }
}
void IntoPost::push(char c)
{
  if(top == MAX -1)
  {
	  cout<<"Stack is full"<<endl;
  }
 top++;
 st[top] = c;
}
char IntoPost::pop()
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
int IntoPost::priority(char symbol)
{
   if(symbol == '$')
	    return 3;
   else if(symbol == '*' || symbol == '/')
	    return 2;
   else if(symbol == '+' || symbol == '-')
	    return 1;

}
int main()
{
   IntoPost i;
   i.setexp();
   i.checkexp();
   i.displaypostfix();

}
