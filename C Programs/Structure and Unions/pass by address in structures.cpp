#include<stdio.h>
typedef struct savac
{
  char name[20];
  float bal;
  float wbal;

}sa;
void accept(sa a)
{
   printf("\n\nVALUE RECOVERED %f",a.bal);
}
void trans(sa *a)
{
   float cbal;
   printf("vslue of balnce is %g",a->bal);

}
int main()
{  sa c;
   sa s1;
  // p=&s1;
   printf("\n\nEnter name:: ");
   flushall();
   gets(s1.name);
   printf("\nEnter balance::");
   scanf("%f",&s1.bal);
     printf("\nEnter withdrwal balance::");
   scanf("%f",&s1.wbal);
   printf("\ninformation:\n\n");
   puts(s1.name);
   printf("%g\n",s1.bal);
    printf("%g\n",s1.wbal);
   accept(s1);
    trans(&s1);
}