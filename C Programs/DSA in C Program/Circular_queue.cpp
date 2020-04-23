#include<iostream>
#include<conio.h>
using namespace std;
#define MAX 10
class queue
{
    int data[MAX];
	int front,rear;
public:
	queue()
	{
	   front=rear=-1;
	}
	int full()
	{
	   if(rear==((front-1+MAX)%MAX))
			return 1;
	   return 0;
	}
	int empty()
	{
	   if(rear ==-1)
			return 1;
	   return 0;
	}
	void enqueue(int x)
	{
	   if(!full())
	   {
		   if(!empty())
		   {
		     front=0;
		   }
				rear=(rear+1)%MAX;
				data[rear]=x;
	   }
	   else
	   {
	      cout<<"queue full";
	   }
	    
	}
	int dequeue()
	{
		int x;
		if(empty())
		{cout<<"queue empty";
			return 0;}
		if(front==rear)
		{
			x=data[front];
			front=rear=-1;
		}
		else
		{
		  x=data[front];
		  front=(front+1)%MAX;
		  
		}
		 
		return x;
	}


};
int main()
{
	int n,x;
	queue q;
	cout<<"enter no of elements in C-queue:";
	cin>>n;
	for(int i=0;i<n;i++)
	{
	  cout <<"Enter element "<<i+1<<" : ";
	  cin>>x;
	  q.enqueue(x);
	}
	cout <<"C-quuee is";
	cout<<"front";
	for(int i=0 ;i<15;i++)
			cout<<q.dequeue()<<"->";
	while(!q.empty())
	{
		cout<<q.dequeue()<<"->";
	}
	cout<<"rear";
	 


    getch();
	return 0;
	
}