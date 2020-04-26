#include"cstring.h"
#include<iostream>
#include<string.h>
using namespace std;
cString::cString()
{
mlen=0;
mbuff=new char;
mbuff='\0';
}
cString::cString(const char* str)
{
  cout<<"parametrised ctor called"<<"\n";
  mlen=strlen(str);
  mbuff= new char[mlen+1];
  strcpy(mbuff,str);
}

void cString::display()
{
   cout<<"string is::"<<mbuff<<endl;

}