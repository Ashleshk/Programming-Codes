#include"test.h"
#include<iostream>
using namespace std;
int test::mcount;
test::test()
{
   a=6;b=0;
}
test::test(int p, int q)
{
   a=p;b=q;

}
void test::operator -()
{
   a=-a;
   b=-b;
}
void test::operator ++()
{
  ++this->a;
  ++this->b;
}
void test::operator ++(int)
{
   a++;b++;
}
void test::display()
{
 cout<<"negation will be"<<a<<" "<<b<<endl;
}