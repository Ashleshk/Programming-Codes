#include<stdio.h>
void main()
{
   FILE *ptr;
   char ch ;
   ptr=fopen("D:\\xyz.txt","r");
   if(ptr==NULL)
   {
      printf("not found");
   }
   while((ch=fgetc(ptr))!=EOF)
   {
      printf("%c",ch);
   }
   fclose(ptr);


}