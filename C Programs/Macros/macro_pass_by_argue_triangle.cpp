#include<stdio.h>
#include<math.h>
#define p(a,b,c)  a+b+c
#define l(d,u)  d*u*0.5
void main()
{    int x, y, z,h;
    printf("\nEnter sides of the triangle:");
   scanf("%d%d%d%d", &x,&y,&z,&h);
   printf("\nthe area is :%f",l(x,h));
   printf("\nthe perimeter is:%d",p(x,y,z));
 
}
