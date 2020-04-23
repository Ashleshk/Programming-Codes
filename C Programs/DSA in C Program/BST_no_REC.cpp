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
 

class BSTree
{
	node* root;
public:
	BSTree()
	{
	  root =NULL; 
	}
	void create()
	{ int x; 
		while(1)
		{    cout<<"Enter data:";
			cin>>x;
			if(x==-1){return;}
			insert(x);
		}
	}
	void insert(int x); 
	void show()
	{
		preorder(root);
	}
	void preorder(node* T);
	node* findmin()
	{
	   node*T,*p=NULL;
	   T=root;
	   while(T!=NULL)
	   {
		   p=T;
	   T=  T->left;
	   }
	   return p;
	}
	node* findmax()
	{
	   node*T,*p=NULL;
	   T=root;
	   while(T!=NULL)
	   {  p=T;
	   T=  T->right;
	   }
	   return p;
	}
	void Delete(int x)
	{
	    root= Delete_(root,x);
	}
	node* Delete_(node*T, int x);
};
node* BSTree::Delete_( node * T,int x)
{   node * p = NULL;
	if(T!=NULL)
	{
	   return NULL;
	}
	if(x<T->data)
	{
		T->left=Delete_(T->left,x);
		return T;
	}
	if(x>T->data)
	{
		T->right= Delete_(T->right,x);
		return T;
	}
	if(T->left==NULL && T->right==NULL)
	{
	  delete T;
	  return NULL;
	}
	if(T->right==NULL)
	{
	     p=T->left;
	   delete T;
	   return p;
	}
	if(T->left==NULL)
	{
	    p=T->right;
	   delete T;
	   return p;
	}
	p=findmin(T->right);   //  complete ethis
}
void BSTree::preorder(node *T)
{
     if(T!=NULL)
	 {
	     cout<<T->data<<" ";
		 preorder(T->left);
		 preorder(T->right);
	 }
}
void BSTree::insert(int x)
 {
     node* T=root;
	 node *q;
	 q=NULL;
	 if(root==NULL)
	 {
	    root=new node(x);
	 }
	 while(T!=NULL)
	 {
		q = T;
		if(x<T->data)
		{
		  T=T->left;
		}
		else
		{ T=T->right;
		}
	 }
	 if(q!=NULL){
	 if( x < q->data)
	 {
	    q->left=new node(x);
	 }
	 else  
	 {
	    q->right=new node(x);
	 }
	 }
 }

int main()
{
	BSTree T;
	T.create();
	T.show();
	cout<<T.findmin()->data;
	cout<<"\n"<<T.findmax()->data;
	T.Delete(3);
	getch();
   return 0;
}