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
  int count;
   char opr;
   char c;
   char symbol;
public:
   IntoPost()
    {
	   top = -1;
          count = 0;
           for(int i=0;i<MAX; i++)
            postfixexp[i] = 0;
	}
   void setexp();
   void checkexp();
   void push(char);
   char pop();
   int priority(char);
   void target(char);
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
     
     
     if(infixexp[i] == '(')
      push(infixexp[i]);
        
    else if(infixexp[i] == ')')
        {
         while(st[top] != '(')
                 {
    	           opr = pop();
    	           target(opr);
    	           count++;
    	          
    	         }
    	          pop();
        }
            
     else if(infixexp[i] == '$'|| infixexp[i] == '*'||infixexp[i] == '/'||infixexp[i] == '+'||infixexp[i] == '-')
          {
    	       if(top == -1)
    	       {
    	    	   push(infixexp[i]);
    	    	  
    	       }
    	       else
    	       {
    	    	   if(priority(infixexp[i])> priority(st[top]))
    	    	   {
    	    	   	
    	    	     	   push(infixexp[i]);  
    	    	   }
    	    		  
    	    	   else
    	    	    {
    	    	       if(priority(infixexp[i])== priority(st[top]))
    	    	         {
    	    	                 opr = pop();
    	    	      	         target(opr);
    	    	     	         count++; 
    	    	   		 push(infixexp[i]);  
    	    	         }
    	    	       else
    	    	         {  
    	    		   opr = pop();
    	    	      	   target(opr);
    	    	     	   count++;
    	    	     	 }   
    	            }		  
    	       }
    	 }
    else 
     { 	     
    	      target(infixexp[i]);
    	      count++; 
     }
     
   }
   if(top != -1)
   {
    while(top != -1)
    {
       opr = pop();
       target(opr);
       count++;
    }
   
   }
}
void IntoPost :: target(char ch)
{
   postfixexp[count]=ch;
}
void IntoPost::displaypostfix()
{
int l = strlen(infixexp); 
     cout<<"Postfix experation :";	
   for( int j = 0 ; j <count; j++ )
   {
	   cout<<postfixexp[j];
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
	   else
	   return 0; 

}
int main()
{
   IntoPost i;
   i.setexp();
   i.checkexp();
   i.displaypostfix();

}
