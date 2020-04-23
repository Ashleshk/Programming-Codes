#include<stdio.h>
void sum(int *seven,int *sodd)
{
   int i ;
   

   for(i=0;i<=10;i++)
   {
      if(i%2==0)
	  {
	     *seven=*seven+i;
	  }
	  else
	  {
	    *sodd=*sodd+i;
	  }
   
   }
   printf("\n the sum of EVEN number is %d\n", *seven);
   printf("\nthe sum of the ODD number is %d\n\n",*sodd);

}
void main()
{
    int s1,s2;
	s1=0;
	s2=0;
	sum(&s1,&s2);
	

}