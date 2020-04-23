#include<stdio.h>
typedef struct savac
{
  char name[20];
  float bal;

}sa;

int main()
{  FILE *ptr;
   sa s1;
   printf("\n\nEnter name:: ");
   flushall();
   gets(s1.name);
   printf("\nEnter balance::");
   scanf("%f",&s1.bal);
   printf("\ninformation:\n\n");
   puts(s1.name);
   printf("%g\n",s1.bal);
   ptr=fopen("D:\\xyz.txt","a+");
   if(ptr==NULL)
   {
      printf("not found");
   }
   fprintf(ptr,"%s\t%0.2f\n",s1.name,s1.bal);
   fclose(ptr);
   fflush(stdin);
   ptr=fopen("D:\\xyz.txt","r+");
   if(ptr==NULL)
   {
      printf("not found");
   }
 
   while((fscanf(ptr,"%s%f",&s1.name,&s1.bal))!=EOF)
   {
      //printf("\n");
	  printf("%s\t%f\n",s1.name,s1.bal);
   }
   fclose(ptr); 
}