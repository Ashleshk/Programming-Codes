#include <iostream>
using namespace std;
void read(int &a ,int &b)
{
	cout <<"Enter values for a and b\n";
	cin >>a>>b;
    cout <<"\nValue of a="<<a<<"\nValue of b="<<b<<endl;
}
int add(int &a,int &b)
{
    return a+b;
		
}
int sub(int &a,int &b)
{
    return a-b;
		
}int mul(int &a,int &b)
{
    return a*b;
		
}int div(int &a,int &b)
{
    return a/b;
		
}
int main()  
{
	int a,b,c,d,e,p;
	float f;
//	cout <<"Enter values for a and b\n";
//	cin >>a>>b;
//	cout <<"\nValue of a="<<a<<"\nValue of b="<<b<<endl;
	read(a,b);
	cout <<"\nEnter the choice for the operation to be performed:-\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n\n";
	cin >>p;
	
	if(p==1)
	{   c=add(a,b);
		cout <<"\n\nAddition of "<<a<<" and "<<b<<" is "<<c<<endl;
	}
	else if(p==2)
	{
		d=sub(a,b);
		cout <<"\nSubtraction of "<<a<<" and "<<b<<" is "<<d<<endl;
	}
	else if(p==3)
	{
		e=mul(a,b);
		cout <<"\nMultiplication of "<<a<<" and "<<b<<" is "<<e<<endl;
	}
	else if(p==4)
	{
		f=div(a,b);
		cout <<"\nDivision of "<<a<<" and "<<b<<" is "<<f<<endl;
	}
	else
	{
		cout <<"Invalid Choice";
	}
	return (0);
}
