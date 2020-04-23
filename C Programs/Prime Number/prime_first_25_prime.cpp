#include<stdio.h>
#include<process.h>
int main()
{
   int i ,j ,count=0 ;
   printf("\nthe prime numbers are:\t 2\n");
   for(i=2;i<=1000;i++)
   {
      for(j=2;j<=i-1;j++)
	  {
	     if(i%j==0)
		 {   
			break;
         }
	  }
	if(i==j)
	  {
	    printf("%d\n",i);
		count++;
	  }
	 if(count==25)
	 {
	    exit(0);
	 }
      
   }
}