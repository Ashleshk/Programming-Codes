#include<iostream>
using namespace std;
class cDate
{
private:
	int day,month,year;
	
public:
	cDate()
	{
	  day=0,month=0;year=0;
	}
	cDate(int dd,int mm, int yy)
	{
	  day=dd;month=mm;year=yy;
	}
	void display()
	{
	  cout<<"date is--- "<<day<<"/"<<month<<"/"<<year<<endl;
	}
	
};
void main()
{
	cDate d;
	cDate d2(12,5,17);
	d.display();
	d2.display();
}  