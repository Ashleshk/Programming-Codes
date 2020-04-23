#include<stdio.h>
void main()
{   
	int i,j,k;
	int a[5]={11,22,33,44,55};
	int b[5]={1,2,3,4,5};
	int c[10];
	k=j=0;
	for( j=0;j<5;j++)
    {  
	      
	        c[k++]=a[j];
            c[k++]=b[j];

	      }
       
	k=0;
	   for(k=0;k<10;k++)
       {
	    printf("%d\t",c[k]);

       }
 
}