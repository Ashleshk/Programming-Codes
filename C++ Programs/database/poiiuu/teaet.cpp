#include <iostream>
#include<fstream>
using namespace std;
class employee
{
	protected:
	 string name_e;
	 string age_e;
	 string prof_e;
	 string contact_e;
	 string email_e;
	 string address_e;
	 
	 
	 public:
	 	int getdata_e()
	 	{
	        cout<<"\nEnter name :";
			getline(cin,name_e);
			cout<<"age :";
			getline(cin,age_e);
			cout<<"profession: employee\n";prof_e="employee";
			cout<<"contact:";
			getline(cin,contact_e);
			cout<<"email id :";
			getline(cin,email_e);
			cout<<"address:";
			getline(cin,address_e);		
	    }
};
class student
{
	protected:
	 string name_s;
	 string age_s;
	 string prof_s;
	 string contact_s;
	 string email_s;
	 string address_s;
	 
	 
	 public:
	 	int getdata_s()
	 	{
	        cout<<"\nEnter name :";
			getline(cin,name_s);
			cout<<"age :";
			getline(cin,age_s);
			cout<<"profession: student\n";prof_s="student";
			cout<<"contact:";
			getline(cin,contact_s);
			cout<<"email id :";
			getline(cin,email_s);
			cout<<"address:";
			getline(cin,address_s);		
	    }
};
class docter
{
	protected:
	 string name_d;
	 string age_d;
	 string prof_d;
	 string contact_d;
	 string email_d;
	 string address_d;
	public:
	 	int getdata_d()
	 	{
	        cout<<"\nEnter name :";
			getline(cin,name_d);
			cout<<"age :";
			getline(cin,age_d);
			cout<<"profession: docter\n";prof_d="docter";
			cout<<"contact:";
			getline(cin,contact_d);
			cout<<"email id :";
			getline(cin,email_d);
			cout<<"address:";
			getline(cin,address_d);		
	    }
};
class labour
{
	protected:
	 string name_l;
	 string age_l;
	 string prof_l;
	 string contact_l;
	 string email_l;
	 string address_l;
	 
	 
	 public:
	 	int getdata_l()
	 	{
	        cout<<"\nEnter name :";
			getline(cin,name_l);
			cout<<"age :";
			getline(cin,age_l);
			cout<<"profession: labour\n";prof_l="labour";
			cout<<"contact:";
			getline(cin,contact_l);
			cout<<"email id :";
			getline(cin,email_l);
			cout<<"address:";
			getline(cin,address_l);		
	    }
};
class Database:public student,public docter,public employee,public labour
{
	public:
		   
			void display()
		{
			cout<<"sr_no"<<"\t"<<"name"<<"\t"<<"address"<<"     \t"<<"profession"<<"     \t"<<"mobile"<<"     \t"<<"email"<<"\n";
			cout<<age_e<<"\t"<<name_e<<"\t"<<address_e<<"   \t"<<prof_e<<"   \t"<<contact_e<<"   \t"<<email_e<<"\n";
			cout<<age_d<<"\t"<<name_d<<"\t"<<address_d<<"   \t"<<prof_d<<"   \t"<<contact_d<<"   \t"<<email_d<<"\n";
			cout<<age_s<<"\t"<<name_s<<"\t"<<address_s<<"   \t"<<prof_s<<"   \t"<<contact_s<<"   \t"<<email_s<<"\n";
			cout<<age_l<<"\t"<<name_l<<"\t"<<address_l<<"   \t"<<prof_l<<"   \t"<<contact_l<<"   \t"<<email_l<<"\n";
		}
			
			
		
};
int main() {
	 
	Database D;
	D.getdata_s();
//	ofstream file;
// 
//    //open file in write mode
//    file.open("D:\\2508\\ashlesh.txt",ios::out);
//    if(!file)
//    {
//      cout<<"Error in creating file.."<<endl;
//      return 0;
//    }
//    cout<<"\nFile created successfully."<<endl;
// 
//    //write into file
//    s.getData();    //read from user
//    file.write((char*)&s,sizeof(s));    //write into file
// 
//    file.close();   //close the file
//    cout<<"\nFile saved and closed succesfully."<<endl;
// 
//    //re open file in input mode and read data
//    //open file1
//    ifstream file1;
//    //again open file in read mode
//    file1.open("aaa.txt",ios::in);
//    if(!file1){
//        cout<<"Error in opening file..";
//        return 0;
//    }
//    //read data from file
//    file1.read((char*)&s,sizeof(s));
// 
//    //display data on monitor
//    s.showData();
//    //close the file
//    file1.close();
//     
//    return 0;
//}
	D.display();
	return 0;
}
