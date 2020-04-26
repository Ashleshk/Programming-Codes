/*   *********** PROBLEM DEFINITION ***********
 * Develop a reservation system in c++ with following data.
 * Train no ,Train name,source,destination,journey date,fair,category(sleeper coach,ac1,ac2,ac3)
 * passenger name,passenger age etc. using concept of file handling.
 *
 */
#include<iostream>
#include<string>
#include<iomanip>
#include<fstream>
using namespace std;
class rail
{
	char TrainNo[20];
	char TrainName[30];
	char source[10];
	char destination[10];
	char journeyDate[12];
	int fair;
	char category[12];
	char passengerName[30];
	int passengerAge;
public:
	void inputdata();
	void putdata();
};
void rail::inputdata()
{
	cout<<"Enter Train No:"<<endl; cin.getline(TrainNo,20);
	cout<<"Enter Train Name:"<<endl; cin.getline(TrainName,30);
	cout<<"Enter the source of train:"<<endl; cin.getline(source,10);
	cout<<"Enter the destination of trian:"<<endl; cin.getline(destination,10);
	cout<<"Enter the category of train:"<<endl; cin.getline(category,12);
	cout<<"Enter the fair for train:"<<endl; cin>>fair;
	cin.get();
	cout<<"Enter the passenger Name:"<<endl; cin.getline(passengerName,30);
	cout<<"Enter the passenger Age"<<endl;  cin>>passengerAge;
	cin.get();
	cout<<"Enter journey date:"<<endl;  cin.getline(journeyDate,12);
}
void rail::putdata()
{
    cout<<"  Train No:"<<TrainNo<<endl;
	cout<<"  Train Name:"<<TrainName<<endl;
	cout<<"  source of train:"<<source<<endl;
	cout<<"  destination of trian:"<<destination<<endl;
	cout<<"  category of train:"<<category<<endl;
	cout<<"  fair for train:"<<fair<<endl;
	cout<<"  passenger Name:"<<passengerName<<endl;
	cout<<"  passenger Age"<<passengerAge<<endl;
    cout<<"  Journey date:"<<journeyDate<<endl;
}
int main()
{
	char ch;
	rail obj;
	fstream file;
	file.open("railway.dat",ios::out|ios::app|ios::binary);
	do
	{
	  obj.inputdata();
	 file.write(reinterpret_cast<char*>(&obj),sizeof(obj));
	cout<<"Do you want to continue?"<<endl;
	cin>>ch;
    }while(ch=='y'||ch=='Y');
	file.close();

	file.open("railway.dat",ios::in);
	file.seekg(0);
	file.read(reinterpret_cast<char*>(&obj),sizeof(obj));
	while(!file.eof())
	{
		obj.putdata();
		file.read(reinterpret_cast<char*>(&obj),sizeof(obj));

	} 
    file.close();
	return 0;
}

