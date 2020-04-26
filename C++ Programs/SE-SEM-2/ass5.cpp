#include <iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
class engineer
{
	protected:
			string sr_no_e,mobile_e, name_e,address_e,profession_e,email_e,age_e;
		public:
			void get_e()
			{
				cout<<"enter the sr no";
				getline(cin,sr_no_e);
				cout<<"enter the name";
				getline(cin,name_e);
				cout<<"enter the address";
				getline(cin,address_e);
				cout<<"enter the profesion";
				getline(cin,profession_e);
				cout<<"mobile no";
				getline(cin,mobile_e);
				cout<<"email";
				getline(cin,email_e);
				cout<<"age";
				getline(cin,age_e);
			}
		
};
class doctor
{
	protected:
			string sr_no_d,mobile_d, name_d,address_d,profession_d,email_d,age_d;
		public:
			void get_d()
			{
					cout<<"enter the sr no";
				getline(cin,sr_no_d);
				cout<<"enter the name";
				getline(cin,name_d);
					cout<<"enter the address";
				getline(cin,address_d);
						cout<<"enter the profesion";
				getline(cin,profession_d);
					cout<<"mobile no";
				getline(cin,mobile_d);
					cout<<"email";
				getline(cin,email_d);
				cout<<"age";
				getline(cin,age_d);
			}
		
};
class student
{
	protected:
		string sr_no_s,mobile_s, name_s,address_s,profession_s,email_s,age_s;
		public:
			void get_s()
			{	cout<<"enter the sr no";
				getline(cin,sr_no_s);
				cout<<"enter the name";
				getline(cin,name_s);
					cout<<"enter the address";
				getline(cin,address_s);
						cout<<"enter the profesion";
				getline(cin,profession_s);
					cout<<"mobile no";
				getline(cin,mobile_s);
					cout<<"email";
				getline(cin,email_s);
				cout<<"age";
				getline(cin,age_s);
			}

};
class labour
{
	protected:
		string sr_no_l,mobile_l, name_l,address_l,profession_l,email_l,age_l;
		public:
			void get_l()
			{
					cout<<"enter the sr no";
				getline(cin,sr_no_l);
				cout<<"enter the name";
				getline(cin,name_l);
					cout<<"enter the address";
				getline(cin,address_l);
						cout<<"enter the profesion";
				getline(cin,profession_l);
					cout<<"mobile no";
				getline(cin,mobile_l);
					cout<<"email";
				getline(cin,email_l);
				cout<<"age";
				getline(cin,age_l);
			}
		
};
class database:public engineer,public doctor,public student,public labour
{
	public:
		void display()
		{
			cout<<"sr_no"<<" \t"<<"name"<<"     \t"<<"address"<<"     \t"<<"profession"<<"     \t"<<"mobile"<<"     \t"<<"email"<<"\n";
			cout<<sr_no_e<<" \t"<<name_e<<"   \t"<<address_e<<"   \t"<<profession_e<<"   \t"<<mobile_e<<"   \t"<<email_e<<"\n";
			cout<<sr_no_d<<" \t"<<name_d<<"   \t"<<address_d<<"   \t"<<profession_d<<"   \t"<<mobile_d<<"   \t"<<email_d<<"\n";
			cout<<sr_no_s<<" \t"<<name_s<<"   \t"<<address_s<<"   \t"<<profession_s<<"   \t"<<mobile_s<<"   \t"<<email_s<<"\n";
			cout<<sr_no_l<<" \t"<<name_l<<"   \t"<<address_l<<"   \t"<<profession_l<<"   \t"<<mobile_l<<"   \t"<<email_l<<"\n";
		}
};

int main() 
{
	database D;
	D.get_e();
	D.get_d();
	D.get_s();
	D.get_l();
	D.display();
}
