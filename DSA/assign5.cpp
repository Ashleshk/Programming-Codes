/*
 * binary.cpp
 *
 *  Created on: Aug 18, 2017
 *      Author: pict
 */
/*
 * Write C++ program for storing binary number using doubly linked lists. Write functions
   To compute 1‘s and 2‘s complement
   Add two binary numbers
 */
/*#include<iostream>
#include<stdlib.h>
using namespace std;
class node
{
  public:
   int bits;
   node *prev=NULL;
   node *next=NULL;
};
class Binary
{
  // int num;
	node *head;

public:
	Binary()
		{
			head= NULL;
		}
	void getNumber();
	void setBinary(int );
	void createDoublyLinkedlist( int );
	void displayBinary();
	void ComputeOnesComplement();
	void computeTwosComplement(Binary &b1);
	void addBinaryNo();
};
void Binary::getNumber()
{
	   int num;
	   cout<<"Enter the number:"<<endl;
	   cin>>num;
      setBinary(num);
}
void Binary :: setBinary(int num)
{
	int bit;

      while( num >=1)
      {
    	  bit = num % 2;
    	  createDoublyLinkedlist(bit);
    	  num = num / 2;

      }
}
void Binary:: createDoublyLinkedlist( int bit)
 {
	node *temp;
    temp = new node;
	temp->bits=bit;
	temp->next=NULL;
	temp->prev=NULL;
		if(head == NULL)
		{
		  head=temp;
		}
		else
		{
			head->prev=temp;
			temp->next=head;
			head=temp;

		}

	}

void Binary::displayBinary()
{
  node *s;
  if(head==NULL)
		  {
	        return;
		  }
  else
  {
  s=head;
  while(s!=NULL)
  {
	   cout<<s->bits<<" ";
		s=s->next;
  }
  cout<<endl;
  }
}
void Binary::ComputeOnesComplement()
{

   node *temp;;
   temp=head;
   while(temp!=NULL)
   {
       if(temp->bits == 0)
    	   temp->bits=1;
       else
    	   temp->bits=0;
       temp = temp->next;
   }

}

void Binary::computeTwosComplement( Binary &b)
{
	int carry;
   node *temp;
   temp=b.head;

    while(temp != NULL)
    {
    	temp=temp->next;
    }
    while(temp != NULL)
     {

        if(temp->bits == 0)
         {
           createDoublyLinkedlist(1);
           carry=0;
         }
        else
         {
        	createDoublyLinkedlist(0);
    	    carry =1;
         if(carry == 0)
           {
         	  break;
           }
          else
          temp =temp->prev;
        }

     }
}
void Binary::addBinaryNo()
{

}
int main()
{
 // int num;
  Binary b,b2;
  int choice;
  char ch;
  do
  {
  cout<<"\n1:Enter Number\n2:display into Binary\n3:To calculate 1's complement\n4:To calculate 2's complement\n5:To add two binary numbers\n6:exit"<<endl;
  cout<<"Enter your choice"<<endl;
  cin>>choice;
  switch(choice)
   {
    case 1: b.getNumber();
          break;
    case 2:cout<<"Decimal to Binary:"<<endl;
    	   b.displayBinary();
           break;
    case 3: cout<<"1's complement :"<<endl;
          b.ComputeOnesComplement();
          b.displayBinary();
          break;
    case 4: cout<<"2's complement:"<<endl;
	      b2.computeTwosComplement(b);
	      b2.displayBinary();
	      break;
    case 5: cout<<"Addition of two binary numbers:"<<endl;
          break;
    case 6: exit(0);
          break;
   }
  cout<<"Do you want to continue?(y/n)"<<endl;
  cin>>ch;
  }while(ch =='y'|| ch=='Y');
  return 0;
}
*/


