#include<iostream>
using namespace std;
class cComplex
{
public:
	int real,img;

	cComplex();
	cComplex(int,int);
	void display();
	friend cComplex operator+(int,cComplex&);

	
};