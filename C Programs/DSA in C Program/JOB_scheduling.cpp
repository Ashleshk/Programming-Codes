#include<iostream>
#include<conio.h>
using namespace std;
struct Job
{
    int jno;
	 int jtime;
};
#include<iostream>
#include<conio.h>
using namespace std;
#define MAX 10
class queue
{
    struct Job data[MAX];
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
	void enqueue(Job x)
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
	Job dequeue()
	{
		Job x;
		if(empty())
		{cout<<"queue empty";x.jtime=-1;x.jno=-1;
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
  struct Job J;
  queue q;
  int x,n,tq;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the jno and Jtime::";
	cin>>J.jno>>J.jtime;
	q.enqueue(J);
  }
  cin>>tq;
  while(!q.empty())
  {
	  J=q.dequeue();
	  J.jtime-=tq;
	  if(J.jtime>0)
	  {
		  q.enqueue(J);
	  }
	  else
		  cout<<"JOB no-"<<J.jno<<"is done\n";
  }
  getch();
  return 0;
}