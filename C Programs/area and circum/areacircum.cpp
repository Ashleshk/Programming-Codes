
#include"h.h"
void main()
{
   int a , b=0,c=0 ;
   printf("Enter the radius of the circle:");
   scanf("%d",&a);
   
   areaperi(a,b,c);
   printf("The area of circle having radius %d is:%d\n\n",a,b);
   printf("the perimeter is::%d",c);
}
