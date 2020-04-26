#include<iostream>
#include"cComplex.h"
using namespace std;

cComplex::cComplex()
{ 
	real=1;
	img=1;
	
}
cComplex::cComplex(int r,int i)
{
 
 real=r;
 img=i;
 
}
cComplex operator+(int num,const cComplex &s)
{
   cComplex temp;
   temp.real= num+ s.real;
   temp.img=num+ s.img;
   return temp;
}

void cComplex::display()
{
  
	   cout<<"addition of real:"<<real<<endl;

	   cout<<"addition of imgianary:"<<img<<endl;
}
 ostream& operator<<(ostream& o,const cComplex& c)
 {
     o<<"addition of real:"<<c.real<<endl;

	   o<<"addition of imgianary:"<<c.img<<endl;
	   return o;
 
 }

