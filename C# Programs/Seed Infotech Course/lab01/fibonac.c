#include<stdio.h>
void main()
{
    int first=0, i,n,second=1,a;
	printf("enter the number of numbers you want to see :");
	scanf("%d",&n);
	printf("%d\t%d ",first,second);
	for(  i=0;i<n-2;i++)
	{
	   
	   a=first+second;
	   printf("\t%d",a);
	  first= second;
	    second=a;
	   
	
	}
	printf("\n\n");
}