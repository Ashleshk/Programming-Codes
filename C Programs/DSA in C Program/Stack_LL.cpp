#include<iostream>
#include<conio.h>
using namespace std;
#define MAX 10
class node
{public:
    int data;
	node * next;
	node(int x)
	{	data=x;
	    next=NULL;
	}
};
class stack
{
     
	node* top;
public:
	stack()
	{
	   top=NULL;
	}
	int empty()
	{
	   if(top==NULL)
			return 1;
	   return 0;
	}
	 
	void push(int x)
	{
		node *p;
		p= new node(x);
		p->next=top;
		top=p;
	}
	node* pop()
	{  node* p;
		p=top;
	  if(!empty())
	  {

		  top=top->next;
		  return p;
	  }
	  return NULL;
	}
	 

};
int main()
{
	int n,x;
	stack s;
	cout<<"enter no of elements in stack:";
	cin>>n;
	for(int i=0;i<n;i++)
	{
	  cout <<"Enter element "<<i+1<<" : ";
	  cin>>x;
	  s.push(x);
	}
	cout <<"Stack is";
	while(!s.empty())
	{
		cout<<s.pop()->data<<"<-";
	}
	
	 


    getch();
	return 0;
	
}