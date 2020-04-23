#include<iostream>
#include<algorithm>
using namespace std;
int main()
{int ii;
	int data[]={66,35,45,39,21};
	sort(data,data+5);
	for(int i=0;i<5;i++)
		cout<<data[i]<<" ";

	cin>>ii;
	return 0;
}