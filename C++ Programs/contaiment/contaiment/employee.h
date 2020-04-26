#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include"cdate.h"
#include"cstring.h"
class cemployee
{
protected:
	int mempid;
	int mbasicsal;
	cString mname;
	cDate mdoj;
public:
	cemployee();
	cemployee(int,int,const char*,int,int,int);
	void display();
};
#endif