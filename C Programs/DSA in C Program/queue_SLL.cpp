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
class queue
{
     
	node *front;
	node *rear;
public:
	queue()
	{
	   front=rear=NULL;
	}
	int empty()
	{
	   if(rear ==NULL)
			return 1;
	   return 0;
	}
 
	void enqueue(int x)
	{
	    node *p;
		p= new node(x);
		   if(empty())
		   {
		     front=rear=p;
		   }
		   else
		   {
		     
		rear->next=p;
			rear=rear->next;
		   }

	    
	}
	int dequeue()
	{	node *p;
		int x=0;
		if(empty())
		{return 0;}
		if(front==rear)
		{
			x=rear->data;
			front=rear=NULL;
		}
		else
		{
			x=front->data;
		  front=front->next;
		   
		}
		 
		return x;
	}


};
int main()
{
	int n,x;
	queue q;
	cout<<"enter no of elements in queue:";
	cin>>n;
	for(int i=0;i<n;i++)
	{
	  cout <<"Enter element "<<i+1<<" : ";
	  cin>>x;
	  q.enqueue(x);
	}
	cout <<"quuee is";
	cout<<"front";
	while(!q.empty())
	{
		cout<<q.dequeue()<<"->";
	}
	cout<<"rear";
	 


    getch();
	return 0;
	
}