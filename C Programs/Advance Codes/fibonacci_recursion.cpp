#include<stdio.h>
void fibo(int );
void main()
{
   int n ;
   printf("\nEnter the number of digits:");
   scanf("%d",&n);
   printf("01");
   fibo(n);

   
}
void fibo(int x )
{
   static int f=0,s=1,r;
   if(x>0)
   {
     r=f+s;
	 f=s;
	 s=r;
	 printf("%d",r);
	 fibo(x-1);
   }
   printf("\n");

}