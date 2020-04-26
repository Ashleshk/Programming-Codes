#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
using namespace std;
void mostFreq3(int *a, int n, int b[3]) {
int i,j,t,k[30],temp;
    
  for(i=1;i<=n;i++) 
 
  for(j=0;j<n-i;j++) 
  { 
    if(a[j]>a[j+1]) 
    { 
      t=a[j+1]; 
      a[j+1]=a[j]; 
      a[j]=t; 
    } 
  }
  for(i=0,j=n-1;i<n/2;i++,j--)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
  for(int i=0,j=0;i<n,j<3;i++,j++)
  { 
     if(a[i]>a[i-1])
	 { b[j]=a[i];j++;}
      
  }
   
    
}
int main()
{
	int n;
	int a[100];
	int b[3];
	int i=0;

	cin >> n;
	for(i=0;i<n;i++){
		cin >> a[i];
	}

	mostFreq3(a,n,b);
        for(i=0; i<3; i++)
            cout << b[i] << " ";

	getch();
}