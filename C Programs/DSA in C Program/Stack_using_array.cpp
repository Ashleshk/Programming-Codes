#include<iostream>
#include<conio.h>
//using namespace std;
//#define MAX 10
//class stack
//{
//    int data[MAX];
//	int top;
//public:
//	stack()
//	{
//	   top=-1;
//	}
//	int empty()
//	{
//	   if(top ==-1)
//			return 1;
//	   return 0;
//	}
//	int full()
//	{
//	   if(top ==MAX-1)
//			return 1;
//	   return 0;
//	}
//	void push(int x)
//	{
//	   if(!full())
//	   {
//				top++;
//				data[top]=x;
//	   }
//	   else
//	   {
//			cout<<"Stack OVERFLOW"<<endl;
//	   }
//	}
	int pop()
	{
		int x;
		if(!empty())
		{
		  x=data[top];
		  top--;
		  return x;
		}
		else
		{
		 cout<<"Stack UNDERFLOW...."<<endl;
		}
		return 0;
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
	 cout<<s.pop()<<"<-";
	}
	
	 


    getch();
	return 0;
	
}