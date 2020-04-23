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
		int x=-1;
		if(empty())
		{return 0;}
		if(front==rear)
		{
			x=data[front];
			front=rear=-1;
			return x;
		}
		else
		{
		  x=data[front];
		  front++;
		  return x;
		}
		 
		
	}
	void priority_enqueue(int x)
	{  int i;
	   if(!full())
	   {
		   if(empty())
		   {
		     front=0;rear=0;
			 data[rear]=x;
		   }
		   else
		   { 
			for(i=rear;data[i]<x && i>=front;i--)
			{
			  data[i+1]=data[i];

			}
			data[i+1]=x;
			rear++;
		   }
	   }
	}
	int findmax()
	{    int i=front;
	     int ind=0;
	   int max=data[0];
	   while(i<=rear)
	   {
	      if(data[i]>max)
		  {
		     max=data[i];
			 ind=i;
		  }
		   i++;
	   }
	   //cout<<max;
	   return ind;
	}
	int priority_dequeue()
	{ int ind=0,x;
	    if(empty())
		{return 0;}
		 if(front==rear)
		{
			x=data[front];
			front=rear=-1;
			return x;
		} 
		ind=findmax();
		x=data[ind];
		 for(int i=ind;i<rear;i++)
		 { data[i]=data[i+1];rear--;}
		 
		 
		return x;
		 
	  
	}

};
int main()
{
	int n,x;
	queue q;
	//cout<<"enter no of elements in queue:";
	//cin>>n;
	//for(int i=0;i<n;i++)
	//{
	//  cout <<"Enter element "<<i+1<<" : ";
	//  cin>>x;
	//  q.enqueue(x);
	//}
	//cout <<"quuee is";
	//cout<<"front";
	///*while(!q.empty())
	//{
	//	cout<<q.dequeue()<<"->";
	//}*/
	///*cout<<q.priority_dequeue()<<"->\n";
	//cout<<q.priority_dequeue()<<"->\n";*/
	//while(!q.empty())
	//{
	//	cout<<q.priority_dequeue()<<"->";
	//}
	//cout<<"rear";
	// 

	/////////////////////////////////////// pr_enquee /////////////////////////////////////////////////
	cout<<"enter no of elements in queue:";
	cin>>n;
	for(int i=0;i<n;i++)
	{
	  cout <<"Enter element "<<i+1<<" : ";
	  cin>>x;
	  q.priority_enqueue(x);
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