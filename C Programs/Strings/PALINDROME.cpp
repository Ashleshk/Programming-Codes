#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main()
{
   int i,j,k;
   int flag=0;
   char p[20];
   char t[20];
  
   
   printf("\nEnter string  :");
   gets(p);
   j=strlen(p);
   for(i=0,k=j-1;i<j;i++,k--)
   {
     if(p[i]==p[k])
	 {
	    continue;
	 }
	 else{
		 flag=1;
	    break;
	 }
   }
   if(flag==0)
   {
     printf("\n\nTHE ENTERED STIRNG IS PALINDROME....");
   }
   else
   {
     printf("\n\nNOT AN PALINDROME...\n\n");
   }

}