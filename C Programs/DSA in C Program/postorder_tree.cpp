
#include<iostream>
#include<conio.h>
using namespace std;
 
#define MAX 10
class node
{
public :
	int data;
	node* left,*right;
	node(int x)
	{
	    data= x;
		left=right =NULL;
	}
};
class stacknode
{
public :
	int flag;
	node*addr;
	stacknode()
	{
	  flag=-1;
	  addr=NULL;
	}
};
class stack
{
    stacknode data[MAX];
	int top;
public:
	stack()
	{
	   top=-1;
	}
	int empty()
	{
	   if(top ==-1)
			return 1;
	   return 0;
	}
	int full()
	{
	   if(top ==MAX-1)
			return 1;
	   return 0;
	}
	void push(stacknode x)
	{
	   if(!full())
	   {
				top++;
				data[top]=x;
	   }
	   else
	   {
			cout<<"Stack OVERFLOW"<<endl;
	   }
	}
		stacknode pop()
	{
		stacknode x;
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
		return x;
	}


};

class Tree
{
	node* root;
public:
	Tree()
	{
	  root =NULL;
	  
	}
	void create()
	{
	   root = create_rec(); 
	 
	}
	void show()
	{ 
		 postorder( );
	}
	node * create_rec();
	 
	void postorder();
};
node* Tree:: create_rec()
{
     int x;
	 cout<<"\nenter data 0r -1 to exit:";
	 cin>>x;
	 if(x==-1)
	  {   return NULL;
  	  }
		node *p = new node(x);
		cout<<"Enter Left of Root:"<<x;
		p->left=create_rec();
		cout<<"Enter right of:"<<x;
		p->right=create_rec();
		return p;
}
void Tree::postorder()
{
     node *T = root;
	 stacknode st;
	 stack S;
	 while(T!=NULL)
	 {	
		 st.addr=T;
		 st.flag=0;
		 S.push(st);
		 T=T->left;
		 
	 }
	 while(!S.empty())
	 {
		 st=S.pop();
		 T=st.addr;
		 if(st.flag==1)
		 {
			 cout<<T->data<<" ";
		 }
		 else
		 {
			 st.flag=1;
			 S.push(st);
			 T=T->right;
			 while(T!=NULL)
			 {
				st.addr=T;
				 st.flag=0;
				 S.push(st);
				 T=T->left;
			 }
		 }

	 }
}
int main()
{
	Tree T;
	T.create();
	T.show();
	getch();
   return 0;
}