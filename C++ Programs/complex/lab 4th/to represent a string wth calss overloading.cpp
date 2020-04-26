#include<iostream>
using namespace std;
class cstring
{
private:
	int mlen;
	char *mbuff;
public:
	cstring()
	{
	   //cout<<"  "<<*mbuff<<endl;
	  cout<<"dfaeault constructor "<<endl;
	}

	void display(void)
	{
	cout<<"string is"<<mbuff;
	}
	cstring(char ch,int len)
	{
	   mlen=len;
	   mbuff=new char[mlen+1];
	   memset(mbuff,ch,mlen);
	   mbuff[mlen]='\0';
	}
	cstring(const char*buff)

	{
	  mlen=strlen(buff);
	  mbuff=new char[mlen+1];
	  strcpy(mbuff,buff);
	  cout<<mbuff;
	
	}
};
void main()
{
	cstring s1;
	cstring s2('s',10);
	cstring s3("seed");
	s3.display();
	cout<<"\n\n";s2.display();
	cout<<"\n\n";s1.display();
}  