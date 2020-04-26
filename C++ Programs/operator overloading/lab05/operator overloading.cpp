#include<iostream>
#include"cComplex.h"

void main()
{
	cComplex c1;
	cComplex c2(4,5),c3;
	c3=c1 + c2;
	c3.display();
}