#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
class node
{public:
   int data;
   node *next;

   node(int x)
   {
      data=x;
	  next = NULL;
   }
};
class SLL
{
	 node *head;
public:
	void create();
	void show();
	void create_();
	void addatBeg(int x);
	void addatEnd(int x);
	void insert_pos(int x,int pos);
	void insert_ele_after(int key, int ele);
	int count();
	void delete_beg();
	void delete_end();
	void delete_pos(int pos);
	void delete_ele_after(int key, int ele);
	void showrev();
	void show_rSLL(node *p);
	void sort();void swap(node *a,node*b);
	 
};
void SLL::create()
{
  int n,x;
  node *p;
  cout<<"Enter no. of nodes:";
  cin>>n;
  p=head;
  cout<<"Enter data for the first node:";
  cin>>x;
  head=new node(x);
  p=head;
  for(int i=1;i<n;i++)
  {
	  cout<<"Enter data for next node:";
	  cin>>x;
	  p->next=new node(x);
	  p=p->next;
  }
}
void SLL::show()
{  node *p;
  cout<<"THE SLL TILL NOW IS :::->"<<endl;
  p=head;
  while(p!= NULL)
  {
     cout<<p->data<<"->";
	 p=p->next;
  }
}
void SLL::create_()
{   node *p;
	char st[15];
	int x;
	head=NULL;
	 
	cout<<"\nEnter data:";
	cin.getline(st,13);
	if(strcmp(st,"STOP"))
	{
	  return;
	}
	
	 x=atoi(st);
	 
	head=new node(x);
	p=head;
	while(p!=NULL)
	{
	  cin.getline(st,13);
	  if(strcmp(st,"STOP"))
	  {
		  return;
	     
	  }
	  x=atoi(st);
	  p->next=new node(x);
	  p=p->next;
	}
	 
}
void SLL:: addatBeg(int x)
{
  node *p,*q;
  q=new node(x);
  q->next=head;
  head=q;
}
void SLL::addatEnd(int x)
{
	node *p,*q;
	q=new node(x);
	if(head==NULL)
	{
	  head=q;
	}
	else
	{
	  p=head;
	  while(p->next !=NULL)
	  {
	    p=p->next;

	  }
	  p->next=q;
	}
}
int SLL:: count()
{
   int c=0;
   node *p;
   p=head;
   while(p->next!=NULL)
   {
      p=p->next;c++;
   }
   return c;
}
void SLL::insert_pos(int x,int pos)
{
	 node *p,*q;
	 int c=count();
	 if(pos<1||pos>c+1)
	 {
	   return ; 
	 }
	 p=head;
	 q=new node(x);
	 if(pos==1)
	 {
		 addatBeg(x);
		  
	  }
     for(int i=1;i<pos-1;i++)
	 {
	   p=p->next;
	 }
	 q->next=p->next;
	 p->next=q;
}
void SLL:: insert_ele_after(int key, int ele)
{
    node *p;
	 int c=count();
	  p=head;
	  for(int i=1;i<=c;i++)
	  {
	     if(p->data==key)
		 {
			 insert_pos(ele,i+1);
		 }
		 p=p->next;
	  }
	 
}
void SLL:: delete_ele_after(int key, int ele)
{
    node *p;
	 int c=count();
	  p=head;
	  for(int i=1;i<=c;i++)
	  {
	     if(p->data==key)
		 {
			 delete_pos(i+1);
		 }
		 p=p->next;
	  }
	 
}
void SLL::delete_beg()
{   node *p;
   if(head==NULL)
   {return;}
   p=head;
   head=head->next;
   delete p;
}
void SLL::delete_end()
{
	node *p,*q;
	if(head==NULL)
	{return;}
	p=head;
	int c =count();
	if(c==1)
	{
	  head=NULL;
	  delete p;
	}
	else
	{
	  p=head;
	  while(p->next !=NULL)
	  {
	     q=p;
		 p=p->next;

	  }
	  q->next=NULL;
	  delete p;
	}
}
void SLL::delete_pos(int pos)
{
	 node *q,*p;
	 if(head ==NULL)
	 { return;}
	 int c=count();
	 if(head->next==NULL)
	 {
	   delete head;
	   head=NULL;
	   return;
	 }
	 p=head;
	 if(pos==1)
	 {
	   head = head ->next;
	   delete p;
	   return;
	 }
	 if(pos>c)
	 { return;}
	 p=head;
	 for(int i=1;i<pos-1;i++)
	 {
		p=p->next;
	 }
	 q=p->next;
	 p->next=q->next;
	 delete q;
 
}
void SLL::showrev()
{
  show_rSLL(head);
}
void SLL::show_rSLL(node *p)
{  
  if(p!=NULL)
  {
     show_rSLL(p->next);
	 cout<<p->data<<"->";
  }
}
void SLL::sort()
{
  node *p;
  node *q=NULL;int i,swapped;
  p=head;
	  if(head ==NULL)
	  {
	    return;
	  }
	  do
	  { swapped=0;
		  p = head; 
  
			while (p->next != q) 
			{ 
				if (p->data > p->next->data) 
				{  
					swap(p, p->next); 
					swapped = 1; 
				} 
				p = p->next; 
			} 
			q = p; 
		} 
		while (swapped);       

}
void SLL::swap(node *a,node*b) 
{ 
    int temp = a->data; 
    a->data = b->data; 
    b->data = temp; 
}
int  main()
{
   SLL obj;
   int ch,choice;
   int value,pos;
   
  do
 {
	 cout<<"\n1:create SLL \
		   \n2:display SLL  \
		   \n3:Addatbeg\
		   \n4:AddatEnd \
		   \n5:insert_pos \
		   \n6:insert_ele\
		   \n7:deleteatbeg\
		   \n8:deleteatend \
		   \n9:delete_pos \
		   \n10:delete_element \
		   \n11:show_reverse\
		   \n12:sort" <<endl;
	 cout<<"Enter your choice"<<endl;
	 cin>>choice;
	   switch(choice)
	   {
	   case 1: obj.create();
		   cout<<"\n";
			   obj.show();
			   break;
	   case 2: obj.show();break;
	   case 3: {cout<<"Enter value for BEg:" ;
			    cin>>value;
				obj.addatBeg(value);cout<<"\n";obj.show();break;
			   }
	   case 4: {cout<<"Enter value for END:" ;
			    cin>>value;
				obj.addatEnd(value);cout<<"\n";obj.show();break;
			   }	   
	   case 5:{cout<<"Enter value for insert:" ;
			    cin>>value;
				cout<<"Enter pos :";
				cin>>pos;
				obj.insert_pos(pos,value);cout<<"\n";obj.show();
			   break;
			  }
	   case 6:{cout<<"Enter value for insert:" ;
			    cin>>value;
				cout<<"Enter key :";
				cin>>pos;
				obj.insert_ele_after(pos,value);cout<<"\n";obj.show();
			   break;
			  }
	   case 7:
		   {obj.delete_beg();
			   cout<<"\n";
			   obj.show();
		   break;
		   
		   }
	   case 8:{
			    obj.delete_end();
			   cout<<"\n";
			   obj.show();break;
			  }
	   case 9:{
			  cout<<"Enter pos :";
				cin>>pos;
				obj.delete_pos(pos);
			   cout<<"\n";
			   obj.show();break;
			  }
	   case 10:
		   {
		    
				cout<<"Enter key :";
				cin>>pos;
				obj.delete_ele_after(pos,30);
			   cout<<"\n";
			   obj.show();break;
		   }
	   case 11:{  
			 
			   cout<<"\n";
			   obj.showrev();
	          break;
			   }
	   case 12: obj.sort();obj.show();break;
	   case 13: return 0 ;
	   default:
		     cout<<"Wrong choice!"<<endl;
	   }
	    
 }while(1);
 getch();
   return 0;
}