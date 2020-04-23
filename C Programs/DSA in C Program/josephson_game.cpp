#include<iostream>
#include<conio.h>
using namespace std;
 
#include<iostream>
#include<conio.h>
using namespace std;
#define MAX 10
class queue
{
    int  data[MAX];
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
		   if(empty())
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
		{cout<<"queue empty";x=-1;
			return x;}
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
   
  queue q;
  int x,dx ,n,l;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the no::";
	 cin>>x;
	q.enqueue(x);
  }
  cin>>l; 
  while(!q.empty())
  {   
	  
	   for(int i=1;i<l;i++)
	   {
		   x=q.dequeue();
		   q.enqueue(x);
	   }
	   dx=q.dequeue();
	    
  }
  cout<<dx;
  getch();
  return 0;
}