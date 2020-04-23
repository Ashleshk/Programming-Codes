#include<stdio.h>
typedef struct savac
{
  char name[20];
  float bal;

}sa;
int main()
{
   sa s[50],*p;
  // ps=&s;
   p=s;
   int num;
   printf("\nn\Enter the number of person you want to enter:");
   scanf("%d",&num);
   for(int i=0;i<num;i++)
   {
   printf("\n\nEnter name:: ");
   flushall();
   gets((p+i)->name);
   printf("\nEnter balance::");
   scanf("%f",&(p+i)->bal);
   }
   for(int i=0;i<num;i++)
   {	   
	   printf("\ninformation:\n\n");
      puts((p+i)->name);
      printf("%g\n",(p+i)->bal);
   }
  
}