#include<stdio.h>
void main()
{
     int a,r,sum=0;
	 printf("Enter the number :");
	 scanf("%d",&a);
	 while(a>0)
	 {
	 r=a%10;
	 a=a/10;
	 sum=sum+r;
}
	 printf("sum is : %d\n\n",sum );
}