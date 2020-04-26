#include<iostream>
#include"employee.h"
using namespace std;
void main()
{
   cemployee e1,e2(101,2000,"ashlesh",9,1,1998);
   //e1.display();
   e2.display();
   cout<<"\nsize of employee object is::"<<sizeof(e1)<<endl;

}