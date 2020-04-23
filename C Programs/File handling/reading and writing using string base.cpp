#include<stdio.h>
void main()
{
   FILE *ptr;
   char arr[30] ;
   printf("\n\nEnter the string::");
   gets(arr);
   puts(arr);
   ptr=fopen("D:\\xyz.txt","w");
   if(ptr==NULL)
   {
      printf("not found");
   }
   fputs(arr,ptr);
   fclose(ptr);
   printf("DATA SAVED SUCCESSFULLY\n\n\n");

   ptr=fopen("D:\\xyz.txt","r");
   fgets(arr,30,ptr);
   printf("data available in file::%s\n\n",arr);
   fclose(ptr);
}