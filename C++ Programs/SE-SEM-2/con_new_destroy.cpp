#include<iostream>
using namespace std;

class test
{
	int *a,size,top,ele;
	public:
		test()
		{
			cout<<"enter size: ";
			cin>>size;
			a=new int[size];
			top=0;
		}
		~test()
		{
			delete a;
	
			a=0;
			
		}
		
		
		void read()
		{
			cout<<"enter the element you want to insert in stack:";
			cin>>ele;
		}
		
		
		void display()
		{
			if(top==-1)
			{
				cout<<"stack is empty!!";
			}
			else
			{
			
			for(int i=top-1;i>=0;i--)
			{
				cout<<"-->"<<a[i]<<"\n";
			}
		    }
		}
		
		
		void push()
		{
			int x;
			x=isfull();
			if(x!=0)
			{
			read();
			
			a[top]=ele;
			top++;
            }		
		}
		
		int isfull()
		{
			if (top==size-1)
			{
				cout<<top;
				cout<<"overflow!!!";
				return 0;
			}
		    return 1;	
		}
		
		void pop()
		{
			int x;
			x=isempty();
			if(x!=0)
			{
			cout<<"poped element is: "<<a[top];
			top--;
		    }
		 
		}
		
		int isempty()
		{
			if(top==-1)
			{
				cout<<"underflow!!!!";
				return 0;
			}
		    return 1;	
		}
	
};


int main()
{
	test t;
	char ans;
	int choice;
	do{
	
	cout<<"\t\t******MENU********\n\t\t1.push\n\t\t2.pop\n\t\t3.display\n\t\t4.exit";
	cout<<"\n\t\tenter your choice: ";
	cin>>choice;
	switch(choice)
	{
		case 1: 
		        t.push();
		        break;
		case 2: 
		        t.pop();
				break;
		case 3: t.display();
		        break;
		case 4: return 0;
		default:cout<<"wrong choice!!!";				        
	}
	cout<<"\n do you want to continue.....(y/n)";
	cin>>ans;
    }while(ans=='y');
    return 0;
}
