#include<stdio.h>
void main(int argc ,char *argv[])
{
   FILE *ptr;
   char arr[30] ;
   printf("\n\nEnter the string::");
   gets(arr);
   puts(arr);
   ptr=fopen(argv[1],"a");
   if(ptr==NULL)
   {
      printf("not found");
   }
   fputs(arr,ptr);
   fclose(ptr);
   printf("DATA SAVED SUCCESSFULLY\n\n\n");

	//ptr=fopen("D:\\xyz.txt","r");
	//fgets(arr,30,ptr);
	//printf("data available in file::%s\n\n",arr);
	//fclose(ptr);
}