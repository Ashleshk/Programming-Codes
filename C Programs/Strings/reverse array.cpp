#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main()
{
   int i,j,k;
   int flag=0;
   char p[20];
   char temp;
  
   
   printf("\nEnter string  :");
   gets(p);
   j=strlen(p);
   for(i=0,k=j-1;i<j/2;)
   {
	   temp=p[i];
	   p[i]=p[k];
	   p[k]=temp;
	   i++;
	   k--;


   }
  puts(p);


}