 
#include<iostream>
#include<fstream>
#include<iomanip>
#include<cstdlib>
#include<string.h>
using namespace std;
class college
{
	char name[20];
	char address[30];
	char id[10];
	char university[40];
	char dateOfEstablishment[12];
	long contactNo;
public:
	void inputdata();
	void displaydata();
};
void college::inputdata()
{
   cout<<"Enter college information."<<endl;
   cin.get();
   cout<<"Enter college id"<<endl;
   cin.getline(id,10);
   cout<<"Enter the name of college"<<endl;
   cin.getline(name,20);
   cout<<"Enter address of college"<<endl;
   cin.getline(address,30);
   cout<<"Enter name of university"<<endl;
   cin.getline(university,40);
   cout<<"Enter the date of establishment"<<endl ;
   cin.getline(dateOfEstablishment,12);
   cout<<"Enter the contact no of college"<<endl;
   cin>>contactNo;
}
void college::displaydata()
{
   cout<<"*********COLLEGE INFORMATION ************	"<<endl;
   cout<<"Id: "<<id<<endl;
   cout<<"Name:"<<name<<endl;
   cout<<"Address:"<<address<<endl;
   cout<<"Name of university:"<<university<<endl;
   cout<<"Date of Establishment:"<<dateOfEstablishment<<endl;
   cout<<"Contact No:"<<contactNo<<endl;
}
class BasicInfo
{
public:
  char id[10];
  char name[20];
  char address[30];
  char dateOfBirth[12];
  int age;
  long contactNo;

  void getdata();
  void putdata();
};
void BasicInfo::getdata()
{
	   cin.get();
	   cout<<"Enter id"<<endl;
	   cin.getline(id,10);
	   cout<<"Enter the name:"<<endl;
	   cin.getline(name,20);
	   cout<<"Enter address :"<<endl;
	   cin.getline(address,30);
	   cout<<"Enter date of birth"<<endl;
	   cin.getline(dateOfBirth,12);
	   cout<<"Enter the contact no:"<<endl;
	   cin>>contactNo;
}
void BasicInfo::putdata()
{

	 cout<<"Id: "<<id<<endl;
	 cout<<"Name:"<<name<<endl;
	 cout<<"Address:"<<address<<endl;
	 cout<<"Date of Birth:"<<dateOfBirth<<endl;
	 cout<<"Contact No:"<<contactNo<<endl;
}
class student:public BasicInfo
{
   char branch[15];
   char div[5];
   int rollNo;
public:
   void getdata1();
   void putdata1();


};
void student::getdata1()
{
   getdata();
   cin.get();
   cout<<"Enter Branch "<<endl;
   cin.getline(branch,15);
   cout<<"Enter div :"<<endl;
   cin.getline(div,5);
   cout<<"Enter Roll No "<<endl;
   cin>>rollNo;
}
void student::putdata1()
{
	cout<<"*********** STUDENT INFORMATION **************"<<endl;
	putdata();
	cout<<"Branch:"<<branch<<endl;
	cout<<"Div:"<<div<<endl;
	cout<<"Roll No:"<<rollNo<<endl;
	cout<<"----------------------------------------------------"<<endl;
}
class staff:public BasicInfo
{

   char department[15];
   int experience;
   long salary;
public:
   void getdata2();
   void putdata2();


};
void staff::getdata2()
{
	getdata();
	cin.get();
	cout<<"Enter department"<<endl;
	cin.getline(department,15);
	cout<<"Enter experience in years"<<endl;
	cin>>experience;
	cout<<"Enter salary"<<endl;
	cin>>salary;
}
void staff::putdata2()
{
	cout<<"*********** STAFF INFORMATION **************"<<endl;
	putdata();
	cout<<"Department:"<<department<<endl;
	cout<<"Experience:"<<experience<<endl;
	cout<<"Salary:"<<salary<<endl;
	cout<<"----------------------------------------------------"<<endl;
}
void collegedata()
{
	college obj1;
	ofstream ofile;
	ofile.open("collegeinfo.txt",ios::out|ios::app);
		obj1.inputdata();
	ofile.write(reinterpret_cast<char *>(&obj1),sizeof(obj1));

		ofile.close();
}
void displaycollegedata()
{
	college obj2;
	ifstream ifile;
		ifile.seekg(0);
		ifile.open("collegeinfo.txt",ios::in);


		while(!ifile.eof())
		{
		   ifile.read(reinterpret_cast<char *>(&obj2),sizeof(obj2));
		   obj2.displaydata();

		}
		ifile.close();
}
void updateCollegeData()
{

}
void studentdata()
{
	student s1;
	   char ch;
		ofstream ofile;
		ofile.open("studentinfo.dat",ios::out|ios::app|ios::binary);
		 do
			{

				s1.getdata1();
				ofile.write(reinterpret_cast<char *>(&s1),sizeof(s1));
				cout<<"Do you want to add information of another student?(y/n)"<<endl;
				cin>>ch;
			}while(ch == 'Y'||ch=='y');
			ofile.close();
}
void displaystudentdata()
{
	student s2;
		ifstream ifile;
			ifile.seekg(0);
			ifile.open("studentinfo.dat",ios::in);

			//cout<<setw(10)<<"NAME"<<setw(20)<<"TELEPHONE NO"<<endl;
			while(!ifile.eof())
			{
			   s2.putdata1();
			   ifile.read(reinterpret_cast<char *>(&s2),sizeof(s2));
			}
			ifile.close();
}
void searchStudentByName()
{
	char nam[20];
	  student s3;
	  cin.get();
	  cout<<"Enter the name whose information is to be searched."<<endl;
	  cin.getline(nam,20);
	  ifstream ifile;
	  ifile.seekg(0);
	  ifile.open("studentinfo.dat",ios::in);
	  while(!ifile.eof())
	  {
		  ifile.read(reinterpret_cast<char *>(&s3),sizeof(s3));
		  int var= strcmp(s3.name,nam);
		  if(var == 0)
		  	   {
		  		   cout<<"Data of person:"<<endl;
		  		   s3.putdata1();
		  		   break;
		  	   }
	  }
}
void searchStudentById()
{
	   char Id[10];
	  student s4;
	  cout<<"Enter the ID whose info is to be searched."<<endl;
	  cin.getline(Id,10);
	   ifstream ifile;
	   ifile.seekg(0);
	   ifile.open("studentinfo.dat",ios::in);
	   while(!ifile.eof())
	   {
		   ifile.read(reinterpret_cast<char *>(&s4),sizeof(s4));
		   if(s4.id == Id)
		   {
			   cout<<"Data of person:"<<endl;
			   s4.putdata1();
			   break;
		   }
	   }
}
void updateStudentInfo()
{

}
void staffdata()
{

	staff x1;
	   char ch;
		ofstream ofile;
		ofile.open("staffinfo.dat",ios::out|ios::app|ios::binary);
		 do
			{

				x1.getdata2();
				ofile.write(reinterpret_cast<char *>(&x1),sizeof(x1));
				cout<<"Do you want to add information of another staff?(y/n)"<<endl;
				cin>>ch;
			}while(ch == 'Y'||ch=='y');
	ofile.close();
}
void displaystaffdata()
{
	     staff x1;
		 ifstream ifile;
			ifile.seekg(0);
			ifile.open("staffinfo.dat",ios::in);

			//cout<<setw(10)<<"NAME"<<setw(20)<<"TELEPHONE NO"<<endl;
			while(!ifile.eof())
			{
			   x1.putdata2();
			   ifile.read(reinterpret_cast<char *>(&x1),sizeof(x1));
			}
			ifile.close();
}
void searchStaffByName()
{
	char nam[20];
	  staff x3;
	  cin.get();
	  cout<<"Enter the name whose inforamtion is to be searched."<<endl;
	  cin.getline(nam,20);
	  ifstream ifile;
	  ifile.seekg(0);
	  ifile.open("staffinfo.dat",ios::in);
	  while(!ifile.eof())
	  {
		  ifile.read(reinterpret_cast<char *>(&x3),sizeof(x3));
		  int var= strcmp(x3.name,nam);
		  if(var == 0)
		  	   {
		  		   cout<<"Information of Staff Member:"<<endl;
		  		   x3.putdata2();
		  		   break;
		  	   }
	  }
}
void searchStafftById()
{
	char Id[10];
	    staff x4;
	   cout<<"Enter the ID whose info is to be searched."<<endl;
	   cin.getline(Id,10);
	   ifstream ifile;
	   ifile.seekg(0);
	   ifile.open("staffinfo.dat",ios::in);
	   while(!ifile.eof())
	   {
		   ifile.read(reinterpret_cast<char *>(&x4),sizeof(x4));
		   if(x4.id == Id)
		   {
			   cout<<" Information of Staff Member:"<<endl;
			   x4.putdata2();
			   break;
		   }
	   }
}
void updateStaffInfo()
{

}
int main()
{

   cout<<"*********** COLLEGE MANAGEMENT SYSTEM *************"<<endl;
   int choice;
   char ch;
   do
   {
	   cout<<"\n1:College Information"<<endl<<"\n2:Student Section"<<endl<<"\n3:Staff Section"<<endl<<"\n4:exit"<<endl;
	   cout<<"\nEnter your choice"<<endl;
	   cin>>choice;
	     switch(choice)
	     {
	     case 1:  cout<<"********** COLLEGE DATABASE ********"<<endl;
	              int choice1;
	     	      char ch1;
	     	              do
	     	              {
	     	            	  cout<<"\n1:Add College Information"<<endl<<"\n2:Display College Information"<<endl<<"\n3:Update the College Information"<<endl<<"\n4:exit"<<endl;
	     	                  cout<<"\nEnter your choice"<<endl;
	     	                  cin>>choice1;
	     	                  switch(choice1)
	     	                  {
	     	                  case 1: collegedata();
	     	                          break;
	     	                  case 2: displaycollegedata();
	     	                          break;
	     	                  case 3: updateCollegeData();
	     	                          break;
	     	                  case 4:
	     	                	   //exit(1);
	     	                	   break;
	     	                  default:
	     	                	  cout<<"You have entered wrong choice:"<<endl;
	     	                  }
	     	              cout<<"Do you want to continue?(Y/N)"<<endl;
	     	              cin>>ch1;
	     	              }while(ch1=='y' || ch1=='Y');
	     	    break;

	     case 2:  cout<<"********* STUDENT DATABASE ************"<<endl;
	              int choice2;
	              char ch2;
	              do
	              {
	            	  cout<<"\n1:Add Student Information"<<endl<<"\n2:Display Student Information"<<endl<<"\n3:Search By Name"<<endl<<"\n4:Search By Id"<<endl<<"\n5:Update the student information"<<endl<<"\n6:exit"<<endl;
	                  cout<<"\nEnter your choice"<<endl;
	                  cin>>choice2;
	                  switch(choice2)
	                  {
	                  case 1: studentdata();
	                	      break;
	                  case 2: displaystudentdata();
	                	      break;
	                  case 3: searchStudentByName();
	                          break;
	                  case 4: searchStudentById();
	                          break;
	                  case 5: updateStudentInfo();
	                          break;
	                  case 6: //exit(1);
	                	     break;
	                  default:
	                	  cout<<"You have entered wrong choice."<<endl;
	                  }
	                  cout<<"Do you want to continue?(Y/N)"<<endl;
	                 	     cin>>ch2;
	              }while(ch2=='y' || ch2=='Y');
	             break;
	     case 3:   cout<<"********* STAFF DATABASE ************"<<endl;
	    	      int choice3;
	    		  char ch3;
	    		    do
	    		      {
	    		    	  cout<<"\n1:Add Staff Information"<<endl<<"\n2:Display Staff Information"<<endl<<"\n3:Search By Name"<<endl<<"\n4:Search By Id"<<endl<<"\n5:Update the staff information"<<endl<<"\n6:exit"<<endl;
	    		          cout<<"\nEnter your choice"<<endl;
	    		          cin>>choice3;
	    		          switch(choice3)
	    		            {
	    		                case 1: staffdata();
	    		              	        break;
	    		         	    case 2: displaystaffdata();
	    		         	           break;
	    		         	    case 3: searchStaffByName();
	    		         	            break;
	    		         	    case 4: searchStafftById();
	    		         	            break;
	    		         	    case 5: updateStaffInfo();
	    		         	            break;
	    		         	    case 6:// exit(1);
	    		         	            break;
	    		         	    default:
	    		         	      cout<<"You have entered wrong choice."<<endl;
	    		            }
	    		        cout<<"Do you want to continue?(Y/N)"<<endl;
	    		  	     cin>>ch3;
	    		      }while(ch3=='y' || ch3=='Y');
	              break;
	     case 4:
	    	     exit(1);
	    	     break;
	     default :
	    	   cout<<"You have entered wrong choice"<<endl;
	     }
	     cout<<"Do you want to continue?(Y/N)"<<endl;
	     cin>>ch;
   }while(ch=='y'||ch=='Y');



  return 0;
}

