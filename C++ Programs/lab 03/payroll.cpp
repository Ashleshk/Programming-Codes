#include"h.h"

void main()
{
    payroll e1;
	cout<<"<<<<<first employee>>>>>";
	e1.display();
	cout<<"\n\n\n";
	payroll e2(101,"ashlesh",500.0,9.8);
	cout<<"<<<<<second employee>>>>>";
	e2.display();
	cout<<"\n\n\n";
	payroll e3;
	e3.getid();
	e3.getname();
	e3.getbsal();
	e3.getmed();
	e3.cal();
	cout<<"<<<<<<<<<third employee>>>>>>>>>";
	e3.displaynew();

}