#include"sport.h"
#include<iostream>
#include<string.h>

using namespace std;
sport::sport()
{
 msp=0;
 total=0;
 average=0.0;
}
sport::sport(int m,char *str,int t,int s):student(m,str,t)
{
  msp=s;
 total= s+t;
 average=(float)total/600;
 percent=average*100;
}

void sport::display()
{   
  student::display();
  cout<<"sports marks are::"<<msp<<endl;
  cout<<"total is::"<<total<<endl;
  cout<<"average is::"<<average<<endl;
  cout<<"percentage is::"<<percent<<endl;
  
}