#include<stdio.h>
typedef struct date
{
   int day;
   int month;
   int yr;

}sa;
int main()
{  sa s1,s2;
   printf("\nEnter todays day:");
   scanf("%d",&s1.day);
   printf("\nEnter present month:");
   scanf("%d",&s1.month);
   printf("\nEnter year:");
   scanf("%d",&s1.yr);
   s2=s1;
   printf("\ntoday date is ....%d-%d-%d:\n\n",s2.day,s2.month,s2.yr);

   printf("\ntommoroow date is ....%d-%d-%d:\n\n",s2.day+1,s2.month,s2.yr);
   
}