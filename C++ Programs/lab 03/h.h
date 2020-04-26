#include<iostream>
#include<string>
using namespace std;
class payroll
{
private:
	int empid;
	char empname[30];
	float basicsal;
	float HRA;
	float medical;
	float PF,PT;
    float net_sal;
	float gross_sal;
public:
	payroll();
	payroll(int,char*,float,float);
	void displaynew();
	void display();
	int getid();
	char *getname();
	float getbsal();
	float getmed();
	float getnsal();
	float getgsal();
	void cal();
	
};