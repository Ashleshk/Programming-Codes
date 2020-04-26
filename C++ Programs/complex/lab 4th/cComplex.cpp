#include<iostream>
using namespace std;
class cComplex
{
private:
	int mreal,mimg;
	static int mcount;
public:
	cComplex();
	cComplex(int,int);
	void display();
	int getreal()const;
	void setreal(int);
	static void show_count();
	cComplex add(cComplex c,cComplex d)
	{   cComplex j;
		j.mreal=d.mreal+c.mreal;
		j.mimg=c.mimg+d.mimg;
	  return j;
	}
};
int cComplex::mcount;

cComplex::cComplex()
{
   mcount++;
   mreal=0;
   this->mimg=0;
   cout<<"DEFAULT CONSTRUCTOR CALLED"<<endl;
}
cComplex::cComplex(int r,int i)
{
 mcount++;
 mreal=r;mimg=i;
 cout<<"PARAMETRISED CONSTRUCTOR CALLED"<<endl;
}
void cComplex::show_count()
{
  cout<<mcount<<"\t complex objects are created";
}
void cComplex::display()
{
   if(mimg<0)
	   cout<<"complex number:"<<mreal<<"i"<<mimg<<endl;
   else
	   cout<<"complex number:"<<mreal<<"+i"<<mimg<<endl;
}
int cComplex::getreal()const
{
  return mreal;
}
void cComplex::setreal(int real)
{
	this->mreal=real;
}
void main()
{
	cComplex c1,c2(5,6),c4(-4,-5);
	 cComplex c3(7,10);
	c1.display();
	c2.display();
	c3.display();
	c4.display();
	cComplex *ptr;
	ptr=new cComplex;
	ptr->display();
	cout<<"REAL PART::"<< c2.getreal()<<endl;
	cout<<"REAL PART::"<< c3.getreal()<<endl;
	c1.setreal(7);
	c1.display();
	cout<<"\n\n\n";
	cComplex c5,c6;
	c6=c5.add(c3,c2);
	
	c.display();
	
	cComplex::show_count();
	delete ptr;
}  