
/*
 * In any language program mostly syntax error occurs due to unbalancing delimiter such
 * as (),{},[]. Write C++ program using stack to check whether given expression is well
 *  parenthesized or not.
 *
 *
 */
/*#include<iostream>
#include<string.h>
const int MAX =20;

using namespace std;
class stack
{
private:
	char c;
	int top;
	char st[MAX];
	char expe[MAX];
public:
	stack()
    {
		top = -1;

	}
	void getexp();
	void scan();   // to find whether any parenthesis is present or not
	void push(char );
	char pop();
   // void display();
 	void check();

};
void stack::getexp()
{
    cout<<"Enter the expression"<<endl;
    cin.getline(expe , 20);
}

void stack::scan()
{

	int l = strlen(expe);
   	for(int i =0 ; i<l;i++)
   	 {
   		if( expe[i]=='('|| expe[i]=='{'|| expe[i]=='[')
   		  push(expe[i]);
   		  if(expe[i]==')')
   		   {
   		     if(st[top]=='(')
   		      pop();
   		   }
   		 else if(expe[i]=='}')
   		   {
   		     if(st[top]=='{')
   		      pop();
   		   }
   		   else if(expe[i]==']')
   		   {
   		     if(st[top]=='[')
   		      pop();
   		   }
   	    }
   	if(top == -1)
    	cout<<" The expression "<<expe<<" is well parenthesized"<<endl;
    else
    	cout<<" The expression "<<expe<<" is not well parenthesized"<<endl;
 }
void stack::push(char c)
{

	if(top == MAX -1)
	{
		cout<<"Stack is full"<<endl;
		return ;
	}
	top++;
	st[top]=c;
}

char stack::pop()
{

	 if(top == -1)
	 {
		 cout<<"stack is empty"<<endl;

	 }
	char dchar = st[top];
	top --;
	return dchar;
}
int main()
{
  stack s;
  s.getexp();
  s.scan();
}
*/
