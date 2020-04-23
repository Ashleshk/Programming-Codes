#include<iostream>
#include<string.h>
#include<stack>
#include<conio.h>

using namespace std;


void main()
{
	 char str[]="ABCDE";
	 stack<char> s;
	 for(int i=0;i<strlen(str);i++)
		 s.push(str[i]);
	 for(int i=0;i<strlen(str)-1;i++)
	 {
	 s.pop();
	 cout<<s.top();
	 }
	 getch();
}