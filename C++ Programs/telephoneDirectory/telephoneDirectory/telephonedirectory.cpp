/*Write a menu driven program that will create a data file
containing the list of telephone
numbers in the following form
John 23456
Ahmed 9876
........... .........
Use a class object to store each set of data, access the file created
and implement the following
tasks
I.Determine the telephone number of specified person
II.Determine the name if telephone number is known
III.Update the telephone number, whenever there is a change.
 */
#include<iostream>
#include<string.h>
#include<iomanip>
#include<fstream>
using namespace std;
class TeleDir
{
public:
	 char name[20];
	 long contactNo;
public:
	 TeleDir()
      {
		 contactNo = 0;
      }
	 void getdata()
	 {
          cin.get();
		  cout<<"Enter name:"<<endl;
		  cin.getline(name,20);
		  cout<<"Enter Telephone no:"<<endl;
		  cin>>contactNo;
	 }
	 void showdata()
	 {
		 cout<<setw(10)<<name<<setw(20)<<contactNo<<endl;
	 }
	 long getTelephoneNo()
	 {
		 return contactNo;
	 }

};

void createfile()
{
	TeleDir obj1;
	char ch;
	ofstream ofile;
	ofile.open("telephoneDirectory.dat",ios::out|ios::app|ios::binary);
	do
	{
		cout<<"Enter the data"<<endl;
		obj1.getdata();
		ofile.write(reinterpret_cast<char *>(&obj1),sizeof(obj1));
		cout<<"Do you want to add any more?(y/n)"<<endl;
		cin>>ch;
	}while(ch == 'Y'||ch=='y');
	ofile.close();
}
void display()
{
	TeleDir obj2;
	ifstream ifile;
	ifile.seekg(0);
	ifile.open("telephoneDirectory.dat",ios::in);

	cout<<setw(10)<<"NAME"<<setw(20)<<"TELEPHONE NO"<<endl;
	while(!ifile.eof())
	{
	   obj2.showdata();
	   ifile.read(reinterpret_cast<char *>(&obj2),sizeof(obj2));
	}
	ifile.close();
}
void searchByName()
{
  char nam[20];
  TeleDir obj3;
  cin.get();
  cout<<"Enter the name whose no is to be searched."<<endl;
  cin.getline(nam,20);
  ifstream ifile;
  ifile.seekg(0);
  ifile.open("telephoneDirectory.dat",ios::in);
  while(!ifile.eof())
  {
	  ifile.read(reinterpret_cast<char *>(&obj3),sizeof(obj3));
	  int var= strcmp(obj3.name,nam);
	  if(var == 0)
	  	   {
	  		   cout<<"Data of person:"<<endl;
	  		   obj3.showdata();
	  		   break;
	  	   }
  }
}
void searchByNo()
{
   long conNo;
   TeleDir obj4;
   cout<<"Enter the telephone no whose name is to be searched."<<endl;
   cin>>conNo;
   ifstream ifile;
   ifile.seekg(0);
   ifile.open("telephoneDirectory.dat",ios::in);
   while(!ifile.eof())
   {
	   ifile.read(reinterpret_cast<char *>(&obj4),sizeof(obj4));
	   if(obj4.getTelephoneNo() == conNo)
	   {
		   cout<<"Data of person:"<<endl;
		   obj4.showdata();
		   break;
	   }
   }
}
void update()  // is not working
{

	 char nam[20];
	  TeleDir obj3;
	  cin.get();
	  cout<<"Enter the name whose no is to be updated."<<endl;
	  cin.getline(nam,20);
	  ifstream ifile;
	  ifile.seekg(0);
	  ifile.open("telephoneDirectory.dat",ios::in);
	  while(!ifile.eof())
	  {
		  ifile.read(reinterpret_cast<char *>(&obj3),sizeof(obj3));
		  int var= strcmp(obj3.name,nam);
		  if(var == 0)
		  	   {
		  	     // ifile.seekg(0,ios::cur);
		  	      cin.get();
		  		   cout<<"Enter the  new data"<<endl;
		  		   obj3.getdata();
		  		   ofstream ofile;
                   ofile.seekp(ifile.tellg()-sizeof(obj3));
                  ofile.write(reinterpret_cast<char *>(&obj3),sizeof(obj3));
                  break;
		  	   }

		  ifile.read(reinterpret_cast<char *>(&obj3),sizeof(obj3));
	  }
	  ifile.close();
}
int main()
{
	char ch;
	int choice;

   do
   {
	   cout<<"\n1: To add data\n2:To display data in file\n3:To search by name\n4:To search by telephone no\n5:To update telephone no"<<endl;
       cin>>choice;
	   switch(choice)
	   {
	   case 1: createfile();
	           break;
	   case 2: display();
	           break;
	   case 3: searchByName();
	           break;
	   case 4: searchByNo();
			   break;
	//   case 5:update();
	          break;
	   default:
		      break;
      }
	   cout<<"Do you want to continue (y/n)?"<<endl;
	   cin>>ch;
   }while(ch == 'y'||ch == 'Y');
   return 0;
}
