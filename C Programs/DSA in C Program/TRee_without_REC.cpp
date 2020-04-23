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

class Stack
{
    node*data[MAX];
	int top;
public:
	Stack()
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
	void push(node * x)
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
	node* pop()
	{
		node * x;
		if(!empty())
		{
		  x = data[top];
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
	     preorder();   ///any one of this
		 cout<<" "<<endl;
		 inorder( );
		  
	}
	node * create_rec();
	void  preorder();   ///any one of this
	void inorder();
	 
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
void Tree::preorder()
{
	node *T=root;
	Stack s;
	while(T!=NULL)
	{
		cout<<T->data<<" ";
		s.push(T);
		T=T->left;
	 
	}
	while(!s.empty())
	{
		T=s.pop();
		T=T->right;
		while(T!=NULL)
		{
			cout<<T->data<<" ";
			s.push(T);
			T=T->left;
		}
	}
}
void Tree::inorder( )
{
   node *T=root;
   Stack s;

   while(T!=NULL)
   {
       s.push(T);
	   T=T->left;
   }
   while(!s.empty())
   {
   T=s.pop();
   cout<<T->data<<" ";
   T=T->right;
   while(T!=NULL)
   {
	s.push(T);
    T=T->left;
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