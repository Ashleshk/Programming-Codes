#include<iostream>
using namespace std;
class cdate
{
private:
	int mday,mmonth,myear;
public:
	cdate()
	{
	   mday=1;
	   mmonth=1;
	   myear=2000;
	}
	cdate(int d,int m,int y)
	{
	   mday=d;
	   mmonth=m;
	   myear=y;
	
	}
};
int main()
{
	cdate d1;
	cdate d2(25,8,2017);
	cout<<"done succesfully"<<"\n";
	return 0;
}  