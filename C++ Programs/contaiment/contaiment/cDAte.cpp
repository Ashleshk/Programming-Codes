#include"cdate.h"
#include<iostream>
using namespace std;
cDate::cDate()
{
   d=1;
   m=1;
   y=2011;

}
cDate::cDate(int dd,int mm,int yy)
{
 d=dd;
 m=mm;
 y=yy;
}
void cDate::display()
{
   cout<<"date is::"<<d<<"/"<<m<<"/"<<y<<endl;
}