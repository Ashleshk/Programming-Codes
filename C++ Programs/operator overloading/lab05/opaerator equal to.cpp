#include<iostream>
#include<string.h>
using namespace std;
class cstring
{
private:
	int mlen;
	char *mbuff;
public:
	cstring()
	{
	   
	 mlen=0;
	 mbuff=new char;
		 mbuff='\0';
	}

	void display(void)
	{
	cout<<"\n\nstring is "<<mbuff<<endl;
	}
	/*cstring(char ch,int len)
	{
	   mlen=len;
	   mbuff=new char[mlen+1];
	   memset(mbuff,ch,mlen);
	   mbuff[mlen]='\0';
	}*/
	cstring(const char *buff)

	{
	  mlen=strlen(buff);
	  mbuff=new char[mlen+1];
	  strcpy(mbuff,buff);
	  
	
	}
	cstring& operator=(const cstring &);
};
cstring& cstring::operator=(const cstring &s)
{
	   
	       mlen=strlen(s.mbuff);
		   delete [] mbuff;
		   mbuff=new char [mlen+1];
		   strcpy(mbuff,s.mbuff);
		   return (*this);
	   
	   
	}
void main()
{
	
	
	cstring s1("cooper");
	cstring s2;
	s1.display();
	 s2 = s1;
	s2.display();
	
}  