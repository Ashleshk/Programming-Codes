#include<iostream>
using namespace std;
void main()
{
   char *str;
   str=new char[100];
   cin>>str;
   cout<<str;
   delete [] str;


}