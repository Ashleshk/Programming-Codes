#include<stdio.h>
void amt(float );
void amt(float a)
{
   printf("\n the amount at 3 is:%f",a);
}
void main()
{
   float trans[5];
   for(int i=0;i<=4;i++)
   {
     scanf("%f",&trans[i]);
   }
   amt(trans[3]);
}