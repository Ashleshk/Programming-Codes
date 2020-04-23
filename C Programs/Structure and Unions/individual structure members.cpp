#include<stdio.h>
typedef struct savac
{
  char name[20];
  float bal;

}sa;
void accept(float a)
{
   printf("\n\nVALUE RECOVERED %f",a);
}
int main()
{
   sa s1;
   
   printf("\n\nEnter name:: ");
   flushall();
   gets(s1.name);
   printf("\nEnter balance::");
   scanf("%f",&s1.bal);
   printf("\ninformation:\n\n");
   puts(s1.name);
   printf("%g\n",s1.bal);
   accept(s1.bal);
}