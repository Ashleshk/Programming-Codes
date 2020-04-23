#include<stdio.h>
void main()
{
   FILE *ptr;
   char ch ;
   int c=0;
   ptr=fopen("D:\\xyz.txt","r");
   if(ptr==NULL)
   {
      printf("not found");
   }
   while((ch=fgetc(ptr))!=EOF)
   {
      if(ch>='a'&&ch<='z')
	  {
	     c++;
	  }
   }
   printf("the number of character  are..%d\n\n",c);

   fclose(ptr);


}