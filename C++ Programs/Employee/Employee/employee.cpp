 /*
 * **************** PROBLEM DEFINITION **************
 * Write a program to read and write the employee information
 * Employee id,name , designation,salary and contact no using class and read and write function using files.
 */
#include<iostream>
#include<fstream>
using namespace std;
class employee
{
	char name[20];
	int id;
	char designation[20];
	int salary;
	long contactNo;
public:
	void enterdata()
	{
		cout<<"Enter the data for the employee"<<endl;
		cout<<"Enter name:"<<endl;
        cin>>name;
        cout<<"Enter employee id:"<<endl;
        cin>>id;
        cout<<"Enter the contact no of employee."<<endl;
        cin>>contactNo;
        cout<<"Enter designation of employee."<<endl;
        cin>>designation;
        cout<<"Enter salary of employee."<<endl;
        cin>>salary;


	}
	void display()
	{
		cout<<"\nInformation about the employee "<<endl;
		cout<<"name: "<<name<<endl;
		cout<<"Employee id : "<<id<<endl;
		cout<<"Employee contact No: : "<<contactNo<<endl;
		cout<<"Designation of employee: "<<designation<<endl;
		cout<<"Salary : "<<salary<<endl;
	}
};
int main()
{
	int num;
   employee e[10];
   fstream file;
   file.open("employee.txt",ios::out);
   cout<<"Enter number of employee."<<endl;
   cin>>num;
   for(int i=0;i<num;i++)
   {
	   e[i].enterdata();
	   file.write((char *) &e[i],sizeof(e[i]));
   }
   file.close();
   file.open("employee.txt",ios::in);
   file.seekg(0);
   cout<<"********Empolyee Information************"<<endl;
   for(int i=0;i<num;i++)
   {
	   file.read((char *)&e[i],sizeof(e[i]));
	   e[i].display();
   }
   file.close();
return 0;
}

