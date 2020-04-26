#include<iostream>
using namespace std;
void add(int n1,int n2)
{
	cout<<"\nINTEGER SUM::"<<n1+n2<<endl;
}
void add(float n1,float n2)
{
	cout<<"\nFLOAT SUM::"<<n1+n2<<endl;
}
void add(double n1,double n2)
{
	cout<<"\nDOUBLE SUM::"<<n1+n2<<endl;
}
void main()
{
   int n1=20,n2=30;
   float fn1=3.4f,fn2=12.3f;
   double dn1=6.7,dn2=5.4;
   add(n1,n2);
   add(fn1,fn2);
   add(dn1,dn2);
}