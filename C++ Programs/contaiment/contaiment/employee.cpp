#include<iostream>
#include"employee.h"
using namespace std;
cemployee::cemployee()
{
   mempid=0;
   mbasicsal=0;
   cout<<"\nemployee default ctor called\n";
}
cemployee::cemployee(int id,int sal,const char *nm,int d,int m,int y):mname(nm),mdoj(d,m,y)
{
  mempid=id;
  mbasicsal=sal;
  cout<<"employee parameterised ctor called"<<"\n";
}
void cemployee::display()
{
  cout<<"id::"<<mempid<<endl;
  cout<<"baiscsal::"<<mbasicsal<<endl;
  mname.display();
  mdoj.display();

}