#include"student.h"
#include<iostream>

class sport:public student
{
private:
	int msp;
	int total;
	float average,percent;
public:
	sport();
	sport(int,char *,int,int);
	void display();
};
