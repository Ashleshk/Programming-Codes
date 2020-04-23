#include<stdio.h>
void main()
{
	int a[5]={25,17,15,6,9};
	int i,j,temp,smallest;
	int n=5;
	printf("using selection sort");
	printf("\nbefore sorting:");
	for(i=0;i<n;i++)
	{
	   printf("%d\t",a[i]);
	}
	for(i=0;i<n-1;i++)
	{
	  smallest=i;
	  for(j=i+1;j<n;j++)
	  {
	    if(a[smallest]>a[j])
		{
		  smallest=j;

		}
	  }
	  if(i !=smallest)
	  {
	     temp=a[i];
		 a[i]=a[smallest];
		 a[smallest]=temp;
	  }
	}
	printf("after sorting");
	 for(i=0;i<5;i++)
   {
   
	   printf("%d",a[i]);

   }
}