#include<iostream>
#include<string.h>
using namespace std;
class stack
{
   int arr[1000];
   int top;
public: void push(int x);
		int isFull();
		int isEmpty();
		int pop();
};
int stack::isEmpty()
{
	return top==-1;
}
int stack::isFull()
{
	return top==1000-1;
}
void stack::push(int x)
{
	if(isFull())
			return ;
	
	arr[++top]=x;
}
int stack::pop()
{
	if(isEmpty())
			return -1;
	return arr[top--];
}
int evalPostfix(string s)
{
	stack st;
	for(int i=0;s[i];i++)
	{
		if(isdigit(s[i]))
		{
			st.push(s[i]-'0');

		}
		else
		{
			int val1=st.pop();
			int val2=st.pop();
			switch(s[i])
			{
			case '+': st.push(val2+val1);break;
			case '-': st.push(val2-val1);break;
			case '*': st.push(val2*val1);break;
			case '/': st.push(val2/val1);break;
			}
		}
	}
	return st.pop();
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		cin>>s;
		cout<<evalPostfix(s)<<endl;
	
	}
return 0;
}