#include<stdio.h>
void main()
{
    int n=100,i,ch=1,j,flag=0;
	//;
	while(ch<=25)
	{
		for(i=2;i<n+2;i++)
		{
		  for(j=2;j<=i;j++)
		  {
		     if(i==j)
			 {  ch++;
			    printf("%d\n",i);
			 }
			 else if(i%j==0)
				 break;
		  }
		}
}
}