#include<iostream>
using namespace std;
void multiply(int a=1,int b=2,int c=4)
{
    cout<<"mutlplication is::"<<a*b*c<<endl;

}
void main()
{
   int n1=1,n2=2,n3=3;
   multiply(n1,n2,n3);
   multiply(n1,n2);
   multiply(n1);
   multiply();

}