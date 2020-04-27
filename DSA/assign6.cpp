/*
 * Poly.cpp
 *
 *  Created on: Sep 6, 2017
 *      Author: pict
 */
/*
 * Write a C++ program to realize Polynomial equation using circular link list and perform following operation
1)To input &output Polynomials.
2)Evaluates a Polynomial at given value of x
3)Add two Polynomials.
 */
/*#include<iostream>
#include<math.h>
using namespace std;
class node
{
public:
	int coeff=0,exp=0;
	node *next;
	void getdata();
};
void node::getdata()
{

	cout<<"Enter the coefficient"<<endl;
	cin>>coeff;
	cout<<"Enter the exponent "<<endl;
	cin>>exp;
}
class Poly
{
  node *head;
public:
	Poly()
     {
    	head = new node;
    	head->next=head;
    	head->exp = -1;
	 }
	void getPoly();
	void display();
	void evaluate(int x);
	void addPoly(Poly);
	void inserteend(int ,int);
};
void Poly::getPoly()
 {
	node *temp,*s;
	temp=head;


	int i=0;
	int n;
	cout<<"Enter the no of terms"<<endl;
	cin>>n;
	while(i<n)
	{
		  s = new node;
		  s->getdata();
		  temp->next=s;
		  temp=s;
		  if(i == n-1)
		  {
			  s->next=head;
			  break;
		  }
	  i++;
	 }
  cout<<endl;
 }

void Poly::display()
{
   node *temp;

   for(temp=head->next;temp->next != head; temp=temp->next)
   {
	   cout<<temp->coeff<<"x^"<<temp->exp<<" + ";
   }
   cout<<temp->coeff<<"x^"<<temp->exp<<endl;
}
void Poly::evaluate(int x)
{
   int sum=0;
   node *temp;
   for(temp=head->next;temp->next != head; temp=temp->next)
     {
  	  sum += temp->coeff*pow(x,temp->exp);
     }
   sum += temp->coeff*pow(x,temp->exp);
   cout<<"Value of experation is :"<<sum<<endl;

}
void Poly::addPoly(Poly B)
{
   node *ptra = head->next;
   node *ptrb = B.head->next;
  Poly C;
    int sum =0;
    while(ptra->exp != -1 && ptrb->exp != -1)
    {
    	if(ptra->exp == ptrb->exp)
    	{
    		sum = ptra->coeff + ptrb->coeff;

    		C.inserteend(sum ,ptra->exp);
    		ptra = ptra->next;
    		ptrb = ptrb->next;
    	}
    	else if(ptra->exp < ptrb->exp)
    	{
    		C.inserteend(ptrb->coeff,ptrb->exp);
    		ptrb= ptrb->next;
       	}
    	else if(ptra->exp > ptrb->exp)
    	{
    		C.inserteend(ptra->coeff,ptra->exp);
    		ptra= ptra->next;
    	}

    }
    cout<<"The polynomial after addition is :"<<endl;
    C.display();
}
void Poly::inserteend(int c, int e)
{
   node *temp ,*ptrc;
   temp = new node;
   temp->coeff = c;
   temp->exp = e;
   if(head->next == head)
   {
	   head->next = temp;
   }
   else
   	{
   		for(ptrc=head;ptrc->next!=head;ptrc=ptrc->next);
   		ptrc->next=temp;
   	}
   	temp->next=head;
}
int main()
{
 Poly A,B;
 int choice,x;
 char ch;
 do
 {
	 cout<<"\n1:create polynomial \n2:display polynomial\n3:To evaluate value of polynomial for x\n4:Addition of two polynomial."<<endl;
	 cout<<"Enter your choice"<<endl;
	 cin>>choice;
	   switch(choice)
	   {
	   case 1:A.getPoly();
	          break;
	   case 2:A.display();
	          break;
	   case 3:cout<<"Enter the value of x"<<endl;
	          cin>>x;
	          A.evaluate(x);
	          break;
	   case 4:cout<<"Enter the second polynomial:"<<endl;
	          B.getPoly();
	          A.addPoly(B);
	          break;
	   default:
		     cout<<"Wrong choice!"<<endl;
	   }
	   cout<<"do you want to continue"<<endl;
	   cin>>ch;
 }while(ch=='y'||ch=='Y');

 return 0;
}
*/
