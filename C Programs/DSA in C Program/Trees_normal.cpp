#include<iostream>
#include<conio.h>
using namespace std;
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
	     preorder(root);   ///any one of this
		 cout<<" "<<endl;
		 inorder(root);
		 cout<<" "<<endl;
		 postorder(root);
	}
	node * create_rec();
	void  preorder(node *T);   ///any one of this
	void inorder(node *T);
	void postorder(node *);
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
void Tree::preorder(node *T)
{
     if(T!=NULL)
	 {
	     cout<<T->data<<" ";
		 preorder(T->left);
		 preorder(T->right);
	 }
}
void Tree::inorder(node *T)
{
     if(T!=NULL)
	 {
	     
		 inorder(T->left);
		 cout<<T->data<<" ";
		 inorder(T->right);
	 }
}void Tree::postorder(node *T)
{
     if(T!=NULL)
	 {
	     
		 postorder(T->left);
		 postorder(T->right);
		 cout<<T->data<<" ";
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