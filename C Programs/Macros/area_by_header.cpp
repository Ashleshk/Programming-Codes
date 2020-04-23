#include"areaperi.h"
#include<stdio.h>
#include<stdlib.h>
void main()
{
  int r, l,b1,a,b,c,ch,h;
  char v;
  do
  {
  printf("1.circle\n2.rectangle\n3.triangle");
  printf("\nchoose your choice:");
  scanf("%d",&ch);
  
   if(ch==1)
   {
     printf("\nEnetr the radius:");
	 scanf("%d",&r);
	 printf("\nthe area is:%f",arcircle(r));
	 printf("\nthe perimeter is :%f",pericircle(r));
   }
   else if(ch==2)
   {
     
     printf("\nEnetr the length and breadth:");
	 scanf("%d%d",&l,&b1);
	 printf("\nthe area is:%d",arrectangle(l,b1));
	 printf("\nthe perimeter is :%d",perirectangle(l,b1));

   }
   else if(ch==3)
   {
     
     printf("\nEnetr the base and height:");
	 scanf("%d%d",&b,&h);
	 printf("\nthe area is:%f",aretriangle(b,h));
	 printf("\nenter the sides:");
	 scanf("%d%d%d",&a,&b,&c);
	 printf("\nthe perimeter is :%d",peritriangle(a,b,c));

   }
   else
   {
    printf("GOODBYEE");
	exit(0);
   }
   
   printf("do you want to conitnue..");
   scanf("%c",&v);
   scanf("%c",&v);
   
  }while(v=='y' && v!='n');
}