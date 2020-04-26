//==========================================================================//
//Developed by:ASHLESH U. KHAJBAGE,SE-05,ROLL NO-2508
//PURPOSE :program to sort the numbers in array using separate function for read ,display ,sort and swap
//date:27/12/17
//evaluated by : prof. zakeer ahmed                             version:1.0
//==========================================================================//

#include<iostream>                               //header file declaration
#include<conio.h>
using namespace std;
void read_data(int a[],int n)                    //function defination
{
    for(int i=0;i<n;i++)
	{
	   cin>>a[i];
	}
}
void display_data(int a[],int n)
{
    for(int i=0;i<n;i++)
	{
	   cout<<a[i]<<" ";
	}
}
void sort(int a[],int n)                           //sorting function
{  
	
    for (int i = 0 ; i < ( n - 1 ); i++)
    {
       for (int j = 0 ; j < n - i - 1; j++)
       {
          if (a [j] > a [j+1]) /* For decreasing order use < */
          {
             swap(a[j],a[j+1]);
          }
       }
    }
}
void swap(int a, int b)
{   int temp;
	temp = a;
    a = b;
    b = temp;
}
int main()                                                 //main function
{
	int arr[10],n;
	cout<<"Enter size of an array:";
	cin>>n;
	read_data(arr,n);                               //reading array
	 
	display_data(arr,n);                                      //displaying array
	 
	sort(arr,n);
	cout<<"Array after sorting is:"<<endl;

	display_data(arr,n);                             //displaying array
	getch();
	return 0;
}
/***********************end of program****************************************/