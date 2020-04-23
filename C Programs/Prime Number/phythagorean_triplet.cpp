#include<stdio.h>
int main()
{
   int i,j ,l,k;
   for(i=1;i<=100;i++)
   {
     for(j=i+1;j<=100;j++)
	 { 
	    for(k=i+2;k<100;k++)
		{
		  l =(i*i) + (j*j) ;
		if(l==k*k)
		{
		   printf("triplet %d %d %d \n",i,j,k);
		}
		}
		
	 }
   
   }
}