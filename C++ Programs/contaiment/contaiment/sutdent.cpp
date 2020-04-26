#include"student.h"
#include<iostream>
#include<string.h>
#include"cstring.h"
using namespace std;
student::student()
{
 roll=1;
 mlen=0;
name=new char;
name='\0';
t=0;
}
student::student(int i,const char* str,int m)
{
  roll=i;
  mlen=strlen(str);
  name= new char[mlen+1];
  strcpy(name,str);
  t=m;
}

void student::display()
{   cout<<"rol numer ::"<<roll<<endl;
   cout<<"name is::"<<name<<endl;
   cout<<"total marks of 5 subject is::"<<t<<endl;

}