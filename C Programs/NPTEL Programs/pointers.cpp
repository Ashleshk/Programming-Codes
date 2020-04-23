#include<iostream>
#include<conio.h>
using namespace std;


int main()
{
	int x1=5,x2=10,x3=15,x4=20,x5=25;
	int *arr[]={&x1,&x2,&x3,&x4,&x5};
	cout<<*arr[*arr[3]-*arr[1]-10];
	getch();
  return 0;
}