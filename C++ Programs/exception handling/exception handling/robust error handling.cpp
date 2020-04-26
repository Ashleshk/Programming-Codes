#include<iostream>
using namespace std;
void main()

{
   int n, d;
   float r;
   try{
      cout<<"enter 2 nos:";
	  cin>>n>>d;
	  if(d==0)
	  {
	     throw"divisions by zero error:";
	  }
	  else
	  {
	    r=(float)n/d;
		cout<<"th result is:"<<r;
	  }
   }
   catch(char*msg)
   {
	   cout<<msg;
   }
}