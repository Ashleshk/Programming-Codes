#include<stdio.h>
void insertion(int *a)
{    int i,j,temp,small;
	int n=5;
	for(i=0;i<n;i++)
	{
	   printf("%d\t",a[i]);
	}
	for(i=0;i<n;i++)
	{ 
	  small=a[i];
	  for(j=i-1;j>=0 && small<a[j];j--)
	  {
	    a[j+1]=a[j];
		
	  }
	  a[j+1]=small;
	  
	
	}
	printf("after sorting\n\n");
	 for(i=0;i<n;i++)
   {
   
	   printf("%d\n",a[i]);

   }
}
void main()
{
	int a[5]={25,17,15,36,9};
	int i,j,temp,small;
	int n=5;
	printf("using insertion sort");
	printf("\nbefore sorting:");
	for(i=0;i<n;i++)
	{
	   printf("%d\t",a[i]);
	}
	insertion(a);
}