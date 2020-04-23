#include<iostream>
#include<vector>
#include<conio.h>

using namespace std;

void main()
{

	vector<int> myVector;
	int sum (0);
	myVector.push_back(100);
	myVector.push_back(200);
	myVector.push_back(300);
	while(!myVector.empty())
	{
		sum+=myVector.back();
		myVector.pop_back();
	}
	cout<<sum<<","<<myVector.size();
   getch();

}