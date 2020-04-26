
#include<iostream>
using namespace std;
namespace space2
{
     namespace space3
	 {
	     int inum;
		 void fun()
		 {
		    cout<<"space3:fun"<<endl;
		 }
	 }
	 int inum;
	 class a
	 {
	 public:
		 void show()
		 {
		   cout<<"in space2:show of a"<<endl;
		 }
	 };
	 void fun()
	 {
	   cout<<"fun for space 2"<<endl<<endl;
	 }
}