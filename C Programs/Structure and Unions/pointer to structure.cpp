#include<stdio.h>
typedef struct savac
{
  char name[20];
  float bal;

}sa;
int main()
{
   sa s1,*ps;
   ps=&s1;
   printf("\n\nEnter name:: ");
   flushall();
   gets(ps->name);
   printf("\nEnter balance::");
   scanf("%f",&ps->bal);
   printf("\ninformation:\n\n");
   puts(ps->name);
   printf("%g\n",ps->bal);
}