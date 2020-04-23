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
		   root=insert(root ,x);
	  }
	}
	node* insert(node* T , int x); 
	void show()
	{
	   preorder(root);
	}
	void preorder(node* T);
};
void BSTree::preorder(node *T)
{
     if(T!=NULL)
	 {
	     cout<<T->data<<" ";
		 preorder(T->left);
		 preorder(T->right);
	 }
}
 node* BSTree::insert(node* T , int x)
 {
    if(T==NULL)
	{
	  return new node(x);
	}
	if(x<T->data)
	{	T->left=insert(T->left,x);}
	if(x>T->data)
	{	T->right=insert(T->right,x);}

	return T;
 }

int main()
{
	BSTree T;
	T.create();
	T.show();
	getch();
   return 0;
}