#include<iostream>
#include<conio.h>
using namespace std;
class node
{
public :
	int data;
	node* left,*right;
	int lbit,rbit;
	int child;
	node(int x,int ch)
	{
	    data= x;
		left=right =NULL;
		child=ch;
		lbit=rbit=0;
	}
};
class Tree
{
	node * root;
public:
	Tree()
	{
	   root=new node(-1,-1);
	   root->lbit=0;
	   root->rbit=1;
	   root->left=root->right;

	}
	void create()
	{
	   create_(root , 0);  
	}
	void create_(node *father,int ch)
	{    int x;
		cout<<"\nenter dsata:";
	  cin>>x;
	  if(x==-1){return ;;}
	   node *T= new node(x,ch);
	   if(ch==0)
	   {
		   T->left=father->left;
		   T->right=father;
		   father->left=T;
		   father->lbit=1;
	   }
	   if(ch==1)
	   {
	     T->left=father;
		 T->right=father->right;
		 father->right=T;
		 father->rbit=1;
	   }
	   cout<<"\nEnter left of x "<<x;
	    create_(T,0);
		cout<<"\nEnter right of x: "<<x;
		 create_(T,1);
	}
	void preorder()
	{
		node * T=root->left;
		while(T!=NULL)
		{
		   cout<<T->data<<" "; 
		   T=pre_succ(T);
		}
	}
	node* pre_succ(node *T)
	{
		if(T->lbit==1)
		{
		   return T->left;
		}
		while(T->rbit==0)
		{
			T=T->right;
		}
		return T->right;
	}

	///////////////////////////////////////////////////////////////////////
	void inorder()
	{
		node * T=root->left;
		while(T->lbit==1)
		{
		   T=T->left;
		}
		while(T!=NULL)
		{
		   cout<<T->data<<" ";
		   T=in_succ(T);
		}
	}
	node* in_succ(node *T)
	{
		if(T->rbit==0)
		{
		   return T->right;
		}
		T=T->right;

		while(T->lbit==1)
		{
			T=T->left;
		}
		return T;
	}
	///////////////////////////////////////////////////////////////////////
	void postorder()
	{
	     node* T= root ->left;
		 while(T->lbit==1||T->rbit==1)
		 {
		     if(T->lbit==1)
			 {
			    T=T->left;
			 }
			 else if(T->rbit ==1)
			 {
				 T=T->right;
			 }

		 }
		 while(T!=root)
		 {
		   cout<<T->data<<" ";
		   T=post_succ(T);
		 }
	}
	node* post_succ(node *T)
	{
		if(T->child==1)
		{
		   while(T->lbit==1)
		   {
		      T=T->left;
		   }
		   return T->left;
		}
		while(T->rbit==1)
		{
			T=T->right;
		}
		T=T->right;
		if(T->rbit==0)
		{
		  return T;
		}

		T=T->right;

		while(T->lbit || T->rbit)
		{
			if(T->lbit==1)
				T=T->left;
			else
				T=T->right;
		}
	  return T;
	}
}  ;
 int main()
{
	Tree T;
	T.create();
	T.preorder();
	cout<<endl;
	T.inorder();
	cout<<endl;
	T.postorder();
	getch();
 return 0;
}