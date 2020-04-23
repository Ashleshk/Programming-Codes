#include<iostream>
#include<stack>
#include<conio.h>
using namespace std;


int main()
{
	char postfix[]={'5','8','3','4','2','/','*','-','+'},ch;
	stack<int> s;
	for(int i=0;i<9;i++)
	{
	   ch=postfix[i];
	   if(isdigit(ch))
		   s.push(ch-'0');
	   else
	   {
			int op1=  s.top(); s.pop();  
			int  op2=s.top(); s.pop();
			switch(ch)
			{
			case '/':s.push(op2/op1);break;
			case '*':s.push(op2*op1);break;
			case '-':s.push(op2-op1);break;
			case '+':s.push(op2+op1);break;
			}
	   }
	}
	cout<<"\nEvaluation of Postfix Expression is :"<<s.top();
	getch();
	
	return 0;

}