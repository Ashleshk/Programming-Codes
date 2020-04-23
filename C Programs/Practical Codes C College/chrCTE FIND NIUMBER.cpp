#include<stdio.h>
#include<string.h>
#include<stdlib.h>
void main()
{
  char str[15],x;
  int i=0,d ;
  int count=0;
  printf("enter the string :");
  gets(str);
  do
  {
   printf("\n1.number of occureince of string...\n2.numebr of blank space in string ...\n3.number of the words...\n4.number of hte vowels in string..");
   printf("\n\nchoose your option");
   scanf("%d", &d);
   switch(d)
   {
   case 1 : {
	   printf("Enter the charater to be searched:");
	        scanf("%d",&x);
			i=0;
			while(str[i] !='\0')
			{
			   if(str[i]==x)
			   {
			      count++;
			   }
			   i++;
			}
			printf("the occurence is %d", count);break;
			}
   case 2 : {
	          i=0;
			while(str[i] !='\0')
			{  
			   if(str[i] =='\0')
			   {
			      count++;
			   }
			   i++;
			}
			printf("the emptyness is %d", count);break;}
   case 3 : { i=0;
			while(str[i] != '\0')
			{
			   if(str[i] ==' ')
			   {
			      count++;
			   }
			   i++;
			}
			printf("the words is %d", count);break;}
   case 4 : { i=0;
			while(str[i] !='\0')
			{
			   if(str[i] =='A'||str[i] =='E'||str[i] =='I'||str[i] =='O'||str[i] =='U'||str[i] =='a'||str[i] =='e'||str[i] =='u'||str[i] =='i'||str[i] =='o')
			   {
			      count++;
			   }
			   i++;
			}
			printf("the vowels is %d", count);break;}

   default : printf("invalid");
	         exit(0);
   }
  }while(d >0);



}