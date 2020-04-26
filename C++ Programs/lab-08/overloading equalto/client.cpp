#include<iostream>
using namespace std;
class cComplex
{
private:
	int real,img;
	
public:
	cComplex();
	cComplex(int,int);
	void display();
	
	
	friend ostream& operator<<(ostream&,const cComplex&);

	
};
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
//cComplex operator +(int num,const cComplex &s)
//{
//   cComplex temp;
//   temp.real= num+ s.real;
//   temp.img=num+ s.img;
//   return temp;
//}

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

void main()
{
  cComplex c1,c2;
  cout<<c1;
  cout<<c1<<c2<<endl;
}