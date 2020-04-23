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
	int empty()
	{
	   if(rear ==-1)
			return 1;
	   return 0;
	}
	int full()
	{
	   if(rear ==MAX-1)
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
				rear++;
				data[rear]=x;
	   }
	    
	}
	int dequeue()
	{
		int x;
		if(empty())
		{return 0;}
		if(front==rear)
		{
			x=data[front];
			front=rear=-1;
		}
		else
		{
		  x=data[front];
		  front++;
		  return x;
		}
		 
		return 0;
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