#include<iostream>
#include<conio.h>
using namespace std;
int main()
{int t;
	try{
	  throw 'a';
	}
	catch(int x ){cout<<"C1"<<x;}
	
	catch(double x ){cout<<"C2"<< x;}
	catch(string x ){cout<<"C3" ;}
	catch(...){cout<<"vskvhk";}
	cin>>t;
	return 0;
}