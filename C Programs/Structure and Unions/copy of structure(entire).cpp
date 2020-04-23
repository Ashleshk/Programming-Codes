#include<stdio.h>
typedef struct savac
{
  char name[609];
  float bal;

}sa;
int main()
{
   sa s2,s1={"sudhir_rahate",50005.5};
   s2=s1;
   /*printf("\n\nEnter name:: ");
   flushall();
   gets(s2.name);
   printf("\nEnter balance::");
   scanf("%f",&s2.bal);*/
   printf("\ninformation:\n\n");
   puts(s2.name);
   printf("%g\n",s2.bal);
}