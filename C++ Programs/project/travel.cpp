/*
 * travel.cpp
 *
 *  Created on: 04-Oct-2017
 *      Author: ashlesh
 */
  // Travel Management system
#include<iostream>
#include<cstdlib>
#include <ctime>
#include<fstream>
#include<string.h>
using namespace std;

class travel
 {
    public:
		char name[50];
		char sex[5];
		int age;
		char email_id[30];
		char mobileNo[20];
		char state[30];
		char city [20];
		char address[40];
		char handicap;
		float f;
		char from[20];
        char to[20];
		char journeyDate[15];
		char journeyTime[20];
		char ddNo[10];
};
class flight : public travel {

	int d_s,c_b , t_h , c_a ,m_h ;
	int m_d ,j_c , t_b , h_c , m_a ;
	long lc,st, kc, rd, jb, bc, tm ;
	long cc, cd, sm;
	char ppno[20];
	public:
		flight()
		{
			d_s = 4500,c_b = 4500, t_h = c_a = m_h = 3000;
			m_d = j_c = 8000, t_b = 6000, h_c = 2500, m_a = 5000;
			lc=30000,st = kc=15000,rd=22000,jb = 25000,bc = 20000,tm = 21000;
			cc = 50000,cd = 60000,sm = 45000;

		}
		void fdbook();     // fd for domestic flights
		void fdcancel();
		void fdstat();
		void fibook();    // fi for international flights
		void ficancel();
		void fistat();
		float ffare(float);
		void aflight();
}a;

//function to perform operations in flight
void flight::aflight()
 {

     char cho1 = 'f',cho2 = 'f',cho3 = 'f';
     int ch1,ch2,ch3;
     do
      {
             cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
             cout<<"\n\t FLIGHT RESERVATION/CANCELLATION ";
             cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
             cout<<"\n SERVICES \n";

             cout<<"\n\t 1.International \n";
             cout<<"\n\t 2.Domestic     \n";
             cout<<"\n\t 3.Exit \n";
             cout<<"\n Enter Choice : ";
             cin>>ch1;
             switch(ch1)
                {
	          case 1:
                        do
                          {
		          cout<<"\n\n INTERNATIONAL\n";
		          cout<<"\n\t 1.Booking \n";
		          cout<<"\n\t 2.Cancelling\n";
		          cout<<"\n\t 3.Status \n";
                  cout<<"\n\t 4.Exit \n";
		          cout<<"\n Enter choice : ";
		          cin>>ch2;

		          switch(ch2)
		             {

			            case 1:
				           a.fibook();
				           break;
		                case 2:
				          a.ficancel();
				          break;
			            case 3:
				          a.fistat();
				          break;
                        case 4: exit(0);
				          break;
			    default: cout<<"\n Please Enter Correctly";
				 cho1 = 't';
				break;
		}
		}while(cho1 == 't');
		break;
	case 2:
                do
                 {
		   cout<<"\n\n DOMESTIC \n";
		   cout<<"\n\t 1.Booking \n";
		   cout<<"\n\t 2.Cancelling\n";
		   cout<<"\n\t 3.Status\n";
		   cout<<"\n\t 4.EXIT\n";
		   cout<<"\n Enter choice : ";
		   cin>>ch3;

		switch(ch3)
		{
			case 1:
				a.fdbook();
				break;
			case 2:
				a.fdcancel();
				break;
			case 3:
				a.fdstat();
				break;
			case 4: exit(0);
				break;
			default: cout<<"\n Please Enter Correctly";
				 cho2 = 't';
		}
		}while(cho2 == 't');
        break;
    case 3: exit(0);
	    break;
    default: cout<<"\n Please Enter Correctly";
	     cho3 = 't';

    }
    }while(cho3 == 't');
}
void flight::fdbook()
{
	int ch6;
	char cho6 = 'f';

      d:
	cout<<"\n\t\t ---------------------";
	cout<<"\n\t\t FLIGHT BOOKING CENTRE";
	cout<<"\n\t\t ---------------------\n";
	cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	cout<<"\n\t\t Our Services \n";
	cout<<"\n\t 1. Delhi        -   Srinagar \n";
	cout<<"\n\t 2. Chennai      -   Banglore \n";
	cout<<"\n\t 3. Trichy       -   Hyderabad \n";
	cout<<"\n\t 4. Chennai      -   Ahmedabad\n";
	cout<<"\n\t 5. Trichy       -   Buvaneshwar\n";
	cout<<"\n\t 6. Jaipur       -   Chennai \n";
	cout<<"\n\t 7. Mumbai       -   Haryana \n";
	cout<<"\n\t 8. Haryana      -   Chennai \n";
	cout<<"\n\t 9. Mumbai       -   Ahmedabad\n";
	cout<<"\n\t10. Madurai      -   Delhi \n";
	cout<<"\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	cout<<"\n Please make your choice : ";
	cin>>ch6;

	switch(ch6)
	{
		case 1: strcpy(a.from,"Delhi");
			strcpy(a.to,"Srinagar");
			a.f = a.ffare(d_s);
			strcpy(journeyTime,"10:15");
			break;
		case 2: strcpy(a.from,"Chennai");
			strcpy(a.to,"Banglore");
			a.f = a.ffare(c_b);
			strcpy(a.journeyTime,"10:30");
			break;
		case 3: strcpy(a.from,"Trichy");
			strcpy(a.to,"Hyderabad");
			a.f = a.ffare(t_h);
			strcpy(a.journeyTime,"11:00");
			break;
		case 4: strcpy(a.from,"Chennai");
			strcpy(a.to,"Ahmedabad");
			a.f = a.ffare(c_a);
			strcpy(a.journeyTime,"12:00");
			break;
		case 5: strcpy(a.from,"Trichy");
			strcpy(a.to,"Buvaneshwar");
			a.f = a.ffare(t_b);
			strcpy(a.journeyTime,"12:05");
			break;
		case 6: strcpy(a.from,"Jaipur");
			strcpy(a.to,"Chennai");
			strcpy(a.journeyTime,"15:25");
			a.f = a.ffare(j_c);
			break;
		case 7: strcpy(a.from,"Mumbai");
			strcpy(a.to,"Haryana");
			strcpy(a.journeyTime,"16:00");
			a.f = a.ffare(m_h);
			break;
		case 8: strcpy(a.from,"Haryana");
			strcpy(a.to,"Chennai");
			strcpy(a.journeyTime,"17:30");
			a.f = a.ffare(h_c);
			break;
		case 9: strcpy(a.from,"Mumbai");
			strcpy(a.to,"Ahmedabad");
			strcpy(a.journeyTime,"17:55");
			a.f = a.ffare(m_a);
			break;
		case 10:strcpy(a.from,"Madurai");
			strcpy(a.to,"Delhi");
			strcpy(a.journeyTime,"18:25");
			a.f = a.ffare(m_d);
			break;
	default:cout<<"\n please enter correctly ";
		cho6 = 't';

		break;
	}
	if(cho6 == 't')
		goto d;
	cout<<"\n Fare :"<<a.f;
	ofstream file2;
	file2.open("fdom.dat",ios::out|ios::app);
	cout<<"\n Enter Details \n";
	cin.get();
	cout<<"\n Name          : ";
	cin.getline(a.name,50);
	cout<<"\n Sex           : ";
	cin>>a.sex;
	cin.get();
	cout<<"\n Email Id      : ";
	cin.getline(a.email_id,20);
	cout<<"\n Mobile Number : ";
	cin.getline(a.mobileNo,20);
	cout<<"\n Journey Date  : ";
	cin.getline(a.journeyDate,15);
	cout<<"\n address  : ";
	cin.getline(a.address ,30);
	cout<<"\n City          : ";
	cin.getline(a.city ,20);
	file2.write((char*)&a,sizeof(a));
	cout<<"\n PROCESSING...";

	cout<<"\n \a\a";
	cout<<"\n *************";
	cout<<"\n Ticket Booked";
	cout<<"\n *************";


	cout<<"\n\t Name  : "<<a.name<<"\n";
	cout<<"\n\t Age   : "<<a.age<<"\n";
	cout<<"\n\t Sex   : "<<a.sex<<"\n";
	cout<<"\n\t From  : "<<a.from<<"\n";
	cout<<"\n\t To    : "<<a.to<<"\n";
	cout<<"\n\t Date  : "<<a.journeyDate<<"\n";
	cout<<"\n\t Time  : "<<a.journeyTime<<"\n";
	cout<<"\n\t Fare  : "<<a.f<<"\n";
	cout<<"\n Payment to be made through Demand Draft in favour of 'ASHS Travels' payable at Kumbakonam";

	file2.close();
}
//function to cancel a ticket
void flight::fdcancel()
{
	ifstream file3("fdom.dat",ios::in);
	ofstream file4("temp1.dat",ios::out);
	char mno[20];
	char found = 'f';
	char confirm = 'n';

	cout<<"\n Enter your mobile number : ";
	cin>>mno;
	file3.read((char*)&a,sizeof(a));
	if(strcmp(mno,a.mobileNo)==0)
	{
		cout<<"\n Details : ";
		cout<<"\n\t Name          : "<<a.name<<"\n";
		cout<<"\n\t Age           : "<<a.age<<"\n";
		cout<<"\n\t Sex           : "<<a.sex<<"\n";
		cout<<"\n\t From          : "<<a.from<<"\n";
		cout<<"\n\t To            : "<<a.to<<"\n";
		cout<<"\n\t Journey Date  : "<<a.journeyDate<<"\n";
		cout<<"\n\t Mobile Number : "<<a.mobileNo<<"\n";
		cout<<"\n\t State         : "<<a.state<<"\n";
		cout<<"\n\t City          : "<<a.city<<"\n";
		cout<<"\n\t address       : "<<a.address<<"\n";

		found = 't';
		cout<<"\n Do you want to cancel ?(y/n): ";
		cin>>confirm;
		if(confirm == 'n')
		{
			file4.write((char*)&a,sizeof(a));
		}
		cout<<"\n Ticket Cancelled";
	}
	else
	{
		file4.write((char*)&a,sizeof(a));
	}
	if(found == 'f')
	{
		cout<<"\n Ticket not booked ";
	}
	file3.close();
	file4.close();
	remove("fdom.dat");
	rename("temp1.dat","fdom.dat");

}
//function to check the status of a ticket
void flight::fdstat()
{
    char mno[20];
    char found='n';
    ifstream file5("fdom.dat",ios::in);
    cout<<"\n Enter Mobile Number : ";
    cin>>mno;
	file5.read((char*)&a,sizeof(a));
	if(strcmp(a.mobileNo,mno)==0)
	{
	    cout<<"\n\t Name  : "<<a.name<<"\n";
	    cout<<"\n\t Age   : "<<a.age<<"\n";
	    cout<<"\n\t Sex   : "<<a.sex<<"\n";
	    cout<<"\n\t From  : "<<a.from<<"\n";
	    cout<<"\n\t To    : "<<a.to<<"\n";
	    cout<<"\n\t Date  : "<<a.journeyDate<<"\n";
	    cout<<"\n\t Time  : "<<a.journeyTime<<"\n";
	    found='y';
	}

    if(found=='n')
    {
    cout<<"Ticket not booked";
    }

    file5.close();
}
//function  to book a ticket (flight - international)
void flight::fibook()
{
	int ch5;
	cout<<"\n\t\t ---------------------";
	cout<<"\n\t\t FLIGHT BOOKING CENTRE";
	cout<<"\n\t\t ---------------------\n";
	cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	cout<<"\n\t  1. Chennai        - London \n";
	cout<<"\n\t  2. Singapore      - Trichy \n";
	cout<<"\n\t  3. Kuala Lumpur   - Kochin \n";
	cout<<"\n\t  4. Riyadh         - Delhi \n";
	cout<<"\n\t  5. Dubai          - Banglore \n";
	cout<<"\n\t  6. Beijing        - Calcutta \n";
	cout<<"\n\t  7. Tokyo          - Mumbai \n";
	cout<<"\n\t  8. Carribean      - Chennai \n";
	cout<<"\n\t  9. California     - Delhi \n";
	cout<<"\n\t 10. Sydney         - Mumbai \n";
	cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	cout<<"\n\n Please make your choice : ";
	cin>>ch5;

	switch(ch5)
	{
		case 1: cout<<"\n Chennai To London ";
			strcpy(a.from,"Chennai");
			strcpy(a.to,"London");
			strcpy(a.journeyTime,"00:05");
			a.f=a.ffare(lc);
			break;
		case 2: cout<<"\n Trichy to Singapore";
			strcpy(a.from,"Trichy");
			strcpy(a.to,"Singapore");
			strcpy(a.journeyTime,"03:10");
			a.f=a.ffare(st);
			break;
		case 3: cout<<"\n Cochin To Kuala Lumpur ";
			strcpy(a.from,"Cochin");
			strcpy(a.to,"Kuala Lumpur");
			strcpy(a.journeyTime,"05:00");
			a.f=a.ffare(kc);
			break;
		case 4: cout<<"\n Delhi to Riyadh ";
			strcpy(a.from, "Delhi");
			strcpy(a.to,"Riyadh");
			strcpy(a.journeyTime,"06:30");
			a.f=a.ffare(rd);
			break;
		case 5: cout<<"\n Banglore to Dubai ";
			strcpy(a.from,"Banglore");
			strcpy(a.to,"Dubai");
			strcpy(a.journeyTime,"11:20");
			a.f=a.ffare(jb);
			break;
		case 6: cout<<"\n Calcutta to Beijing ";
			strcpy(a.from,"Calcutta");
			strcpy(a.to,"Beijing");
			strcpy(a.journeyTime,"08:50");
			a.f=a.ffare(bc);
			break;
		case 7: cout<<"\n Mumbai to Tokyo ";
			strcpy(a.from,"Mumbai");
			strcpy(a.to,"Tokyo");
			strcpy(a.journeyTime,"10:00");
			a.f=a.ffare(tm);
			break;
		case 8: cout<<"\n Chennai to Carribean";
			strcpy(a.from,"Chennai");
			strcpy(a.to,"Carribean");
			strcpy(a.journeyTime,"10:15");
			a.f =  a.ffare(cc);
			break;
		case 9: cout<<"\n Delhi  To California";
			strcpy(a.from,"Delhi");
			strcpy(a.to,"California");
			strcpy(a.journeyTime,"11:00");
			a.f = a.ffare(cd);
			break;
	       case 10: cout<<"\n Mumbai To Sydney";
			strcpy(a.from,"Mumbai");
			strcpy(a.to,"Sydney");
			strcpy(a.journeyTime,"13:28");
			a.f = a.ffare(sm);
			break;
	       default: cout<<"\n Service not available";

	}
	cout<<"\n Fare :"<<a.f;
	ofstream file6;
	file6.open("fint.dat",ios::out|ios::app);

	cout<<"\n Enter Details \n";
	cin.get();
		cout<<"\n Name          : ";
		cin.getline(a.name,50);
		cout<<"\n Sex           : ";
		cin>>a.sex;
		cin.get();
		cout<<"\n Email Id      : ";
		cin.getline(a.email_id,30);
		cin.get();
		cout<<"\n Mobile Number : ";
		cin.getline(a.mobileNo,20);
		cin.get();
		cout<<"\n Journey Date  : ";
		cin.getline(a.journeyDate,15);
		cin.get();
		cout<<"\n address       : ";
		cin.getline(a.address ,30);
		cin.get();
		cout<<"\n City          : ";
		cin.getline(a.city ,20);
	file6.write((char*)&a,sizeof(a));
	cout<<"\n PROCESSING...";

	cout<<"\n ***************";
	cout<<"\n Ticket Booked";
	cout<<"\n ****************";


	cout<<"\n\t Name  : "<<a.name<<"\n";
	cout<<"\n\t Age   : "<<a.age<<"\n";
	cout<<"\n\t Sex   : "<<a.sex<<"\n";
	cout<<"\n\t From  : "<<a.from<<"\n";
	cout<<"\n\t To    : "<<a.to<<"\n";
	cout<<"\n\t Date  : "<<a.journeyDate<<"\n";
	cout<<"\n\t Time  : "<<a.journeyTime<<"\n";
	cout<<"\n\t Fare  : "<<a.f<<"\n";
	cout<<"\n Payment to be made through Demand Draft in favour of 'ASHS Travels' payable at Kumbakonam";

	file6.close();
}
//function to calculate fare
float flight::ffare(float f_t)
{
	cout<<"\n Enter Details ";
	cout<<"\n Age       :";
	cin>>a.age;
	if(a.age < 6)
	{
	       a.f = f_t/5;
	}
	else if(a.age>5 && a.age<13)
	{
	a.f = f_t/2;
	}
	else if(a.age>12 && a.age <61)
	{
	a.f = f_t;
	}
	else if(a.age>60)
	{
	a.f = f_t - 1000;
	}
	cout<<"\n handicapped (y/n): ";
	cin>>a.handicap;
	if(a.handicap == 'y' || a.handicap == 'Y')
	{
	a.f+= 700;
	}
	return a.f;
}
//function to cancel an international ticket
void flight::ficancel()
{
	ifstream file8("fint.dat",ios::in);
	ofstream file9("temp2.dat",ios::out);
	char mno[11];
	char found = 'f';
	char confirm = 'n';

	cout<<"\n Enter your mobile number : ";
	cin>>mno;
	file8.read((char*)&a,sizeof(a));
	if(strcmp(a.mobileNo,mno)==0)
	{
		cout<<"\n Details : "<<"\n\n";
		cout<<"\n\t Name          : "<<a.name<<"\n";
		cout<<"\n\t Age           : "<<a.age<<"\n";
		cout<<"\n\t Sex           : "<<a.sex<<"\n";
		cout<<"\n\t From          : "<<a.from<<"\n";
		cout<<"\n\t To            : "<<a.to<<"\n";
		cout<<"\n\t Journey Date  : "<<a.journeyDate<<"\n";
		cout<<"\n\t Journey Time  : "<<a.journeyTime<<"\n";
		cout<<"\n\t Mobile Number : "<<a.mobileNo<<"\n";
		cout<<"\n\t State         : "<<a.state<<"\n";
		cout<<"\n\t City          : "<<a.city<<"\n";
		cout<<"\n\t address       : "<<a.address<<"\n";

		found = 't';
		cout<<"\n Are you sure you want to cancel ? (y/n) : ";
		cin>>confirm;
		if(confirm == 'n')
		{       file9.write((char*)&a,sizeof(a));
			cout<<"\n ticket Cancelled";
		}
	}
	else
	{
		file9.write((char*)&a,sizeof(a));
	}
	if (found == 'f')
		cout<<"\n Ticket not booked ";
	file8.close();
	file9.close();
	remove("fint.dat");
	rename("temp2.dat","fint.dat");
}
//function to check status of an international ticket
void flight::fistat()
{

    char mno[11];
    ifstream file10("fint.dat",ios::in);
    cout<<"\n Enter Mobile Number : ";
    cin>>mno;
	file10.read((char*)&a,sizeof(a));
	if(strcmp(a.mobileNo,mno)==0)
	{
	    cout<<"\n\t Name  : "<<a.name<<"\n";
	    cout<<"\n\t Age   : "<<a.age<<"\n";
	    cout<<"\n\t Sex   : "<<a.sex<<"\n";
	    cout<<"\n\t From  : "<<a.from<<"\n";
	    cout<<"\n\t To    : "<<a.to<<"\n";
	    cout<<"\n\t Date  : "<<a.journeyDate<<"\n";
	    cout<<"\n\t Time  : "<<a.journeyTime<<"\n";
	}
	else
	{
		cout<<"\n Ticket Not Booked ";
	}
    file10.close();
}
// class for train reservation
class train : public travel
{
	int tno;
	int cxb ,txc, kxm ,cxd ;
	int rxv ,cxa , mxm ,dxc ,mxb ,txg ;
	public:
		train()
		{
			tno = 0;
			cxb = 500,txc = 265, kxm = 250,cxd = 700;
			rxv = 980,cxa = 700, mxm = 665,dxc = 975,mxb = 825,txg = 775;
		}
		void atrain();
		void tbook();
		void tcancel();
		void tstat();
		float tfare(float);

}b;
//function to perform operations in train
void train :: atrain()
{


        int ch4;
        char cho3 = 'f';
         do {
            cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
            cout<<"\n\t TRAIN TICKET RESERVATION/CANCELLATION ";
            cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
            cout<<"\n SERVICES \n";
            cout<<"\n\t 1.Booking \n";
            cout<<"\n\t 2.Cancelling\n";
            cout<<"\n\t 3.Status\n";
            cout<<"\n\t 4.Exit\n";
            cout<<"\n Enter choice : ";
            cin>>ch4;
              switch(ch4)
                 {
	          case 1:
		         b.tbook();
		         break;
	          case 2:
		         b.tcancel();
		         break;
	          case 3:
		         b.tstat();
		         break;
	          case 4: exit(0);
                         break;
	          default: cout<<"\n Please Enter Correctly";
		         cho3 = 't';
		         break;
	         }
	   }while(cho3 == 't');
}
void train::tbook()
{
    int ch1;
    char siv ='t';
b:
    cout<<"\n\t\t ---------------------";
    cout<<"\n\t\t TRAIN BOOKING CENTRE";
    cout<<"\n\t\t ---------------------\n";
    cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    cout<<"\n\t  1. Chennai        To     Banglore\n";
    cout<<"\n\t  2. Trichy         To     Chennai\n";
    cout<<"\n\t  3. Kumbakonam     To     Mysore\n";
    cout<<"\n\t  4. Chennai        To     Delhi\n";
    cout<<"\n\t  5. Rameshwaram    To     Varanasi\n";
    cout<<"\n\t  6. Coimbatore     To     Ahmedabad\n";
    cout<<"\n\t  7. Manglore       To     Madurai\n";
    cout<<"\n\t  8. Delhi          To     Chennai\n";
    cout<<"\n\t  9. Mumbai         To     Buvaneshwar\n";
    cout<<"\n\t 10. Tanjore         To     Goa\n";
    cout<<"\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout<<"\n Your Choice : ";
    cin>>ch1;
    switch(ch1)
    {
	case 1: strcpy(b.from,"Chennai");
		strcpy(b.to,"Banglore");
		strcpy(b.journeyTime,"10:05");
		b.f= b.tfare(cxb);
		break;
	case 2: strcpy(b.from,"Trichy");
		strcpy(b.to,"Chennai");
		strcpy(b.journeyTime,"10:10");
		b.f = b.tfare(txc);
		break;
	case 3: strcpy(b.from,"Kumbakonam");
		strcpy(b.to,"Mysore");
		strcpy(b.journeyTime,"05:35");
		b.f = b.tfare(kxm);
		break;
	case 4: strcpy(b.from,"Chennai");
		strcpy(to,"Delhi");
		strcpy(b.journeyTime,"12:05");
		b.f = b.tfare(cxd);
		break;
	case 5: strcpy(b.from,"Rameshwaram");
		strcpy(b.to,"Varanasi");
		strcpy(b.journeyTime,"1:30");
		b.f = b.tfare(rxv);
		break;
	case 6: strcpy(b.from,"Coimbatore");
		strcpy(b.to,"Ahmedabad");
		strcpy(b.journeyTime,"1:35");
		b.f = b.tfare(cxa);
		break;
	case 7: strcpy(b.from,"Manglore ");
		strcpy(b.to,"Madurai");
		strcpy(b.journeyTime,"10:05");
		b.f = b.tfare(mxm);
		break;
	case 8: strcpy(b.from,"Delhi");
		strcpy(b.to,"Chennai");
		strcpy(b.journeyTime,"03:05");
		b.f = b.tfare(dxc);
		break;
	case 9: strcpy(b.from,"Mumbai");
		strcpy(b.to,"Buvaneshwar");
		strcpy(b.journeyTime,"15:30");
		b.f = b.tfare(mxb);
		break;
	case 10:strcpy(b.from,"Tanjore");
		strcpy(b.to,"Goa");
		strcpy(b.journeyTime,"12:30");
		b.f = b.tfare(txg);
		break;
	default: cout<<"\n Please enter correctly";
		 siv = 'f';

		break;
    }
    if(siv == 'f')
	goto b;
    cout<<"\n Fare : "<<b.f;
    ofstream file11;
    file11.open("train.dat",ios::out|ios::app);
    cout<<"\n Enter Details \n";
    cin.get();
    	cout<<"\n Name          : ";
    	cin.getline(b.name,50);
    	cout<<"\n Sex           : ";
    	cin>>b.sex;
    	cin.get();
    	cout<<"\n Email Id      : ";
    	cin.getline(b.email_id,30);
    	//cin.get();
    	cout<<"\n Mobile Number : ";
    	cin.getline(b.mobileNo,20);
    	//cin.get();
    	cout<<"\n Journey Date  : ";
    	cin.getline(b.journeyDate,15);
    	//cin.get();
    	cout<<"\n address       : ";
    	cin.getline(b.address ,30);
    	//cin.get();
    	cout<<"\n City          : ";
    	cin.getline(b.city ,20);
	cin.getline(b.city ,20);
    file11.write((char*)&b,sizeof(b));
    cout<<"\n PROCESSING...";

    cout<<"\n";
    cout<<"\n *****************";
    cout<<"\n  Ticket Booked";
    cout<<"\n *****************";

    cout<<"\n\t Name  : "<<b.name<<"\n";
    cout<<"\n\t Age   : "<<b.age<<"\n";
    cout<<"\n\t Sex   : "<<b.sex<<"\n";
    cout<<"\n\t From  : "<<b.from<<"\n";
    cout<<"\n\t To    : "<<b.to<<"\n";
    cout<<"\n\t Date  : "<<b.journeyDate<<"\n";
    cout<<"\n\t Time  : "<<b.journeyTime<<"\n";
    cout<<"\n\t Fare  : "<<b.f<<"\n";
    cout<<"\n\t Payment to be made through Demand Draft in favour of 'ASHS Travels' payable at Kumbakonam";

    file11.close();
}
float train::tfare(float f_t)  //function to calculate fare train
{
	//float fare;
	cout<<"\n Enter Details ";
	cout<<"\n Age       :";
	cin>>b.age;
	if(b.age < 6)
	{
	    b.f = f_t/3;
	}
	else if(b.age>5 && b.age<13)
	{
		b.f = f_t/2;
	}
	else if(b.age>12 && b.age <61)
	{
		b.f = f_t;
	}
	else if(age>60)
	{
		b.f = f_t - 100;
	}
	cout<<"\n handicapped (y/n): ";
	cin>>b.handicap;
	if(b.handicap == 'y' || b.handicap == 'Y')
	{
		b.f-= 100;
	}
	return b.f;
}
void train::tcancel()
{
	ifstream file12("train.dat",ios::in);
	ofstream file13("temp3.dat",ios::out);
	char mno[20];
	char found = 'f';
	char confirm = 'n';

	cout<<"\n Enter your mobile number : ";
	cin>>mno;
	file12.read((char*)&a,sizeof(a));
	if(strcmp(b.mobileNo,mno)==0)
	{
		cout<<"\n Details : ";
		cout<<"\n\t Name          : "<<b.name<<"\n";
		cout<<"\n\t Age           : "<<b.age<<"\n";
		cout<<"\n\t Sex           : "<<b.sex<<"\n";
		cout<<"\n\t From          : "<<b.from<<"\n";
		cout<<"\n\t To            : "<<b.to<<"\n";
		cout<<"\n\t Journey Date  : "<<b.journeyDate<<"\n";
		cout<<"\n\t Journey Time  : "<<b.journeyTime<<"\n";
		cout<<"\n\t Mobile Number : "<<b.mobileNo<<"\n";
		cout<<"\n\t State         : "<<b.state<<"\n";
		cout<<"\n\t City          : "<<b.city<<"\n";
		cout<<"\n\t address       : "<<b.address<<"\n";

		found = 't';
		cout<<"\n Are you sure you want to cancel ? (y/n) : ";
		cin>>confirm;
		if(confirm == 'n')
		{       file13.write((char*)&a,sizeof(a));
		}
		cout<<"\n Ticket cancelled";
	}
	else
	{
		file13.write((char*)&a,sizeof(a));
	}
	if(found == 'f')
	cout<<"\n Ticket not booked ";
	file12.close();
	file13.close();
	remove("train.dat");
	rename("temp3.dat","train.dat");
}
void train::tstat()
{
char mno[20];
ifstream file14("train.dat",ios::in);
char found = 'n';
cout<<"\n Enter Mobile Number : ";
cin>>mno;
file14.read((char*)&a,sizeof(a));
if(strcmp(mobileNo,mno)==0)
{
     cout<<"\n\t Name  : "<<b.name;
     cout<<"\n\t Age   : "<<b.age;
     cout<<"\n\t Sex   : "<<b.sex;
     cout<<"\n\t From  : "<<b.from;
     cout<<"\n\t To    : "<<b.to;
     cout<<"\n\t Date  : "<<b.journeyDate;
     cout<<"\n\t Time  : "<<b.journeyTime;
     found = 't';
}
if(found == 'n')
{
     cout<<"\n Sorry ticket not booked";
}
file14.close();
}
// class for bus reservation
class bus : public travel
{
	int ctb,mtc,ktc,ttk,cth,kktc,ctc,ttt,cbtb,htc;
	public:
		bus()
		{
		    ctb=500,mtc=350,ktc=400,ttk=445;
		    cth=700,kktc=655,ctc=800,ttt=955,cbtb=695,htc=700;
		}
		void bbook();
		void bcancel();
		void bstat();
		void abus();
		float bfare(float);
}c;
void bus::abus()
{

       int ch5;
       char cho5 = 'f';
           do {
                cout<<"\n\t\t -----------------------------------";
                cout<<"\n\t\t BUS TICKET RESERVATION/CANCELLATION";
                cout<<"\n\t\t -----------------------------------";
                cout<<"\n\t 1.Booking   \n";
                cout<<"\n\t 2.Cancelling\n";
                cout<<"\n\t 3.Status    \n";
                cout<<"\n\t 4.Exit      \n";
                cout<<"\n Enter choice : ";
                cin>>ch5;
             switch(ch5)
              {
         	case 1:
		      c.bbook();
		      break;
	        case 2:
		      c.bcancel();
		      break;
	        case 3:
                 	c.bstat();
		      break;
	        case 4: exit(0);
		      break;
	        default: cout<<"\n Please Enter correctly ";
		       cho5 = 't';
		     break;
              }
       }while(cho5 == 't');
}
void bus::bbook()
{
    int ch1;
    char s = 't';
p:
    cout<<"\n\t\t ------------------";
    cout<<"\n\t\t BUS BOOKING CENTRE";
    cout<<"\n\t\t ------------------\n";
    cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    cout<<"\n\t  1. Chennai        To    Banglore \n";
    cout<<"\n\t  2. Madurai        To    Chennai\n";
    cout<<"\n\t  3. Kumbakonam     To    Coimbatore\n";
    cout<<"\n\t  4. Trichy         To    Kanyakumari\n  ";
    cout<<"\n\t  5. Chennai        To    Hyderabad \n";
    cout<<"\n\t  6. Kanyakumari    To    Chennai \n";
    cout<<"\n\t  7. Cochin         To    Chennai \n";
    cout<<"\n\t  8. Tripathi       To    Trichy \n";
    cout<<"\n\t  9. Coimbatore     To    Banglore \n";
    cout<<"\n\t 10. Hydrabad       To    Chennai\n";
    cout<<"\n\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    cout<<"\n Enter your choice : ";
    cin>>ch1;
    switch(ch1)
    {
	case 1: strcpy(c.from,"Chennai");
		strcpy(c.to,"Banglore");
		strcpy(c.journeyTime,"10:25");
		c.f= c.bfare(ctb);
		break;
	case 2: strcpy(c.from,"Madurai");
		strcpy(c.to,"Chennai");
		strcpy(c.journeyTime,"10:25");
		c.f = c.bfare(mtc);
		break;
	case 3: strcpy(c.from,"Kumbakonam");
		strcpy(c.to,"Mysore");
		strcpy(c.journeyTime,"10:25");
		c.f = c.bfare(ktc);
		break;
	case 4: strcpy(c.from,"Trichy");
		strcpy(c.to,"Kanyakumari");
		strcpy(c.journeyTime,"11:30");
		c.f=c.bfare(ttk);
		break;
	case 5: strcpy(c.from,"Chennai");
		strcpy(c.to,"Hydrabad");
		strcpy(c.journeyTime,"12:25");
		c.f= c.bfare(cth);
		break;
	case 6: strcpy(c.from,"Kanyakumari");
		strcpy(c.to,"Chennai");
		strcpy(c.journeyTime,"13:55");
		c.f=c.bfare(kktc);
		break;
	case 7: strcpy(c.from,"Cochin");
		strcpy(c.to,"Chennai");
		strcpy(c.journeyTime,"15:00");
		c.f= c.bfare(ctc);
		break;
	case 8: strcpy(c.from,"Tripathy");
		strcpy(c.to,"Trichy");
		strcpy(c.journeyTime,"18:45");
		c.f= c.bfare(ttt);
		break;
	case 9: strcpy(c.from,"Coimbatore");
		strcpy(c.to,"Banglore");
		strcpy(c.journeyTime,"22:05");
		c.f=c.bfare(cbtb);
		break;
	case 10:strcpy(c.from,"Hydrabad");
		strcpy(c.to,"Chennai");
		strcpy(c.journeyTime,"00:00");
		c.f=c.bfare(htc);
		break;
	default: cout<<"\n Wrong choice";
		 s = 'f';

		 break;
}
    if(s == 'f')
	goto p;

    cout<<"\n Fare : "<<c.f;
    ofstream file15;
    file15.open("bus.dat",ios::out|ios::app);
    cout<<"\n Enter Details";
    cin.get();
	cout<<"\n Name          : ";
	cin.getline(c.name,50);
	cout<<"\n Sex           : ";
	cin>>c.sex;
	cin.get();
	cout<<"\n Email Id      : ";
	cin.getline(c.email_id,30);
	//cin.get();
	cout<<"\n Mobile Number : ";
	cin.getline(c.mobileNo,20);
	//cin.get();
	cout<<"\n Journey Date  : ";
	cin.getline(c.journeyDate,15);
	//cin.get();
	cout<<"\n address       : ";
	cin.getline(c.address ,30);
	//cin.get();
	cout<<"\n City          : ";
	cin.getline(c.city ,20);
    file15.write((char*)&c,sizeof(c));
    cout<<"\n PROCESSING...";

    cout<<"\n ****************";
    cout<<"\n  Ticket Booked";
    cout<<"\n ****************";

    cout<<"\n Name  : "<<c.name<<"\n";
    cout<<"\n Age   : "<<c.age<<"\n";
    cout<<"\n Sex   : "<<c.sex<<"\n";
    cout<<"\n From  : "<<c.from<<"\n";
    cout<<"\n To    : "<<c.to<<"\n";
    cout<<"\n Date  : "<<c.journeyDate<<"\n";
    cout<<"\n Time  : "<<c.journeyTime<<"\n";
    cout<<"\n Fare  : "<<c.f<<"\n";
    cout<<"\n Payment to be made through Demand Draft in favour of 'ASHS Travels' payable at Kumbakonam";

    file15.close();
}
float bus::bfare(float f_t)  //function to calculate fare train
{
	cout<<"\n Enter Details ";
	cout<<"\n Age       :";
	cin>>c.age;
	if(c.age < 6)
	{
	       c.f = f_t/3;
	}
	else if(c.age>5 && c.age<13)
	{
	c.f = f_t/2;
	}
	else if(c.age>12 && c.age <61)
	{
	c.f = f_t;
	}
	else if(c.age>60)

	{
	c.f = f_t - 100;
	}
	cout<<"\n handicapdicapped (y/n): ";
	cin>>c.handicap;
	if(c.handicap == 'y' || c.handicap == 'Y')
	{
	c.f-= 100;
	}
	return c.f;
}
void bus::bcancel()
{
	ifstream file16("bus.dat",ios::in);
	ofstream file17("temp4.dat",ios::out);
	char mno[11];
	char found = 'f';
	char confirm = 'y';

	cout<<"\n Enter your mobile number : ";
	cin>>mno;
	file16.read((char*)&c,sizeof(c));
	if(strcmp(c.mobileNo,mno)==0)
	{
		cout<<"\n Details : ";
		cout<<"\n Name          : "<<c.name<<"\n";
		cout<<"\n Age           : "<<c.age<<"\n";
		cout<<"\n Sex           : "<<c.sex<<"\n";
		cout<<"\n From          : "<<c.from<<"\n";
		cout<<"\n To            : "<<c.to<<"\n";
		cout<<"\n Mobile Number : "<<c.mobileNo<<"\n";
		cout<<"\n State         : "<<c.state<<"\n";
		cout<<"\n City          : "<<c.city<<"\n";
		cout<<"\n address       : "<<c.address<<"\n";
		cout<<"\n\n Are you sure you want to cancel ? (y/n) : ";
		cin>>confirm;
		found = 't';
		if(confirm == 'n')
		{       file17.write((char*)&c,sizeof(c));
		}
		cout<<"\n Please wait processing...";

		cout<<"\n ****************";
		cout<<"\n Ticket Cancelled";
		cout<<"\n ****************";
	}
	else
	{
		file17.write((char*)&c,sizeof(c));
	}
	if(found == 'f')
		cout<<"\n Ticket not booked ";
	file16.close();
	file17.close();
	remove("bus.dat");
	rename("temp4.dat","bus.dat");
}
void bus::bstat()
{
    char mno[11];
    char found = 'n';
    ifstream file18("bus.dat",ios::in);
    cout<<"\n Enter Mobile Number : ";
    cin>>mno;
    file18.read((char*)&c,sizeof(c));
    if(strcmp(c.mobileNo,mno)==0)
    {
	cout<<"\n Name  : "<<c.name<<"\n";
	cout<<"\n Age   : "<<c.age<<"\n";
	cout<<"\n Sex   : "<<c.sex<<"\n";
	cout<<"\n From  : "<<c.from<<"\n";
	cout<<"\n To    : "<<c.to<<"\n";
	cout<<"\n Date  : "<<c.journeyDate<<"\n";
	cout<<"\n Time  : "<<c.journeyTime<<"\n";
	found = 't';
    }
    if(found == 'n')
	cout<<"\n Ticket Not Booked";
    file18.close();
}
void TimeAndDate()
{
	time_t t = time(0);   // get time now

	    struct tm * now = localtime( & t );

	    cout <<"\t\t\t"<<  now->tm_mday << '-'//day

	         << (now->tm_mon +1 )  << '-'//month

	         << (now->tm_year +1900 )<<"\t" <<now->tm_hour//hour

	         <<'-'<<now->tm_min//min

	         <<'-'<< now->tm_sec//sec

	         << endl;


}

int main()
{

   int ch;
   char cho = 'f';
    do
     {

	cout<<"\n\t\t WELCOME TO ASHS TRAVEL AGENCY";
	TimeAndDate();
	cout<<"\n -------------------------------------------------------------------------------------------------\n";

	cout<<"\n\t 1.Flight \n\n";
	cout<<"\n\t 2.Train \n\n";
	cout<<"\n\t 3.Bus \n\n";
    cout<<"\n\t 4.Exit  \n\n";
	cout<<"\n Enter your option :";
	cin>>ch;
           switch(ch)
	{

	case 1: cout<<"\n\t FLIGHT TICKET RESERVATION";
		a.aflight();
		break;
	case 2: cout<<"\n\t TRAIN TICKET RESERVATION";
		b.atrain();
		break;
	case 3: cout<<"\n\t BUS TICKET RESERVATION";
		c.abus();
		break;
        case 4: exit(0);
		break;
	default: cout<<"\n OOPS! service not available";
		 cho = 't';

		 break;
	}
    }while(cho == 't');
}



