#include<iostream>
class test
{
private:
	int a,b;
	static int mcount;
public:
	test();
	test(int,int);
	void display();
	void operator -();
	void operator ++();
	void operator ++(int);
};