#include<stdio.h>
void main()
{   char c;
    static int i;int k;
	k=0;
   do
   {   
	    i=0;
	   
       for(;i<=k+10  ;i++)
      {
         printf("%c=%d\n",i,i);
      }
	    k=i;
	  printf("do you want next 10 charecter:");
	  scanf("%c",&c);
	   scanf("%c",&c);
   }while(i<=255);
}