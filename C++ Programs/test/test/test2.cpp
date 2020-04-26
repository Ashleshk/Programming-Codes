#include<stdio.h>
#include<conio.h>
void main()
{
	int i,temp,a[5]={12,43,11,10,7};
   for(i=0;i<5;i++)
   {
     for(int j=i+1;j<5;j++)
	 { if(a[i]>a[j])
	    temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	 }
   }
   for(int i=0;i<5;i++)
     printf("%d\t",a[i]);
    getch();
}