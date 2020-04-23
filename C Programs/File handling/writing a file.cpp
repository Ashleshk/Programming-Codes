#include<stdio.h>
void main()
{
   FILE *ptr;
   char ch ;
   ptr=fopen("D:\\xyz.txt","w");
   if(ptr==NULL)
   {
      printf("not found");
   }
   while((ch=getchar())!='\n')
   {
     fputc(ch,ptr);
   }
   printf("data saved succesfully...\n\n");
   fclose(ptr);


}