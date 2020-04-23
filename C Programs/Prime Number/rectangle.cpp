#include<stdio.h>
int main()
{
   int i ,j,a ,b ;
   printf("Enter the sides of rectangle:");
   scanf("%d%d",&a,&b);
   printf("%c",(char)218);
   for(i=0;i<=a;i++)
   {
	   printf("%c",(char)196);

   }
   printf("%c\n",(char)191);
   for(i=0;i<=b;i++)
   {
     printf("%c",(char)179); 
	 for(j=0;j<=a;j++)
	 {
	    printf(" ");

	 }
	 printf("%c\n",(char)179 );
   }
   printf("%c",(char)192);
   for(i=0;i<=a;i++)
   {
      printf("%c",(char)196);
   }
   printf("%c",(char)217);

}