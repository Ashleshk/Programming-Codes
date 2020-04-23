#include<stdio.h>
void armstg(int x);
int main()
{
   int a  ;
   printf("\nEnter any number:");
   scanf("%d",&a);
    armstg(a);
   
   return(0);
}
void armstg(int x)
{
  int t, r,s;
  t=x;
  s=0;
  while(x>0)
  {
     r=x%10;
	 x=x/10;
	 s=s+(r*r*r);
  }
  if(s==t)
   {
     printf("The number entered is armstrong number\n");

   }
   else
   {
     printf("not an armstrong number....");
   }

}