#include"h.h"
payroll::payroll()
{ 
     empid=0;
	strcpy(empname,"null");
	 basicsal=0.0;
	 medical=10.0;
	 

}
payroll::payroll(int id,char *em,float bsal,float med)
{
	  empid=id;
	 strcpy(empname,em);
	 basicsal=bsal;
	 medical=med;
}
void payroll::display()
{
	cout<<"welcome...";
	cout<<"\nEMPLOYEE ID::"<<empid;
	cout<<"\nEMPLOYEE NAME::"<<empname;
	cout<<"\nEMPLOYEE SALARY::"<<basicsal;
	cout<<"\nEMEDICAL::"<<medical;
}
void payroll::displaynew()
{
	cout<<"welcome...";
	cout<<"\nEMPLOYEE ID::"<<empid;
	cout<<"\nEMPLOYEE NAME::"<<empname;
	cout<<"\nEMPLOYEE SALARY::"<<basicsal;
	cout<<"\nEMPLOYEE HRA::"<<HRA;
	cout<<"\nEMEDICAL::"<<medical;
	cout<<"\nPF::"<<PF;
	cout<<"\nPF::"<<PT;
	cout<<"\nNET SALARY::"<<net_sal;
	cout<<"\nGROSS SALARY::"<<gross_sal;

}
int payroll::getid(void)
{
	cout<<"enter id:";
	cin>>empid;
	return empid;
}
char* payroll :: getname()
{
	cout<<"enter employee name:";
	cin>>empname;
    return empname;
}
float payroll::getbsal(void)
{
	cout<<"enter base salary:";
	cin>>basicsal;
	return basicsal;
}
float payroll::getmed(void)
{
	cout<<"enter medical :";
	cin>>medical;
	return medical;
}
void payroll::cal()
{   HRA=0.5*basicsal;
    PF=0.12*basicsal;
	PT=200;
	gross_sal= basicsal + HRA + medical;
	net_sal=gross_sal -PT-PF;
	/*cout<<"net salary is="<<net_sal;
	cout<<"gross salary is="<<gross_sal;*/
}