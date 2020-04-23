#include<stdio.h>
void main()
{
	 int a[10];
	 int b[10];
	 int c[10];
	 printf("\nEnter the elements of array 1");
	 for(int i=0;i<10;i++)
	 {
	   scanf("%d",&a[i]);
	 }
	 printf("\nEnter the elements of array 2");
	 for(int i=0;i<10;i++)
	 {
	   scanf("%d",&b[i]);
	 }
	 printf("\nARRAY 1:");
	 for(int i=0;i<10;i++)
	 {
	   printf("%d\t",a[i]);
	 }
	 printf("\nARRAY 2:");
	 for(int i=0;i<10;i++)
	 {
	   printf("%d\t",b[i]);
	 }
	 for(int i=0;i<10;i++)
	 {
	    c[i]=a[i]*a[i] + b[i]*b[i];
	 }
	 printf("\n");
	 printf("\nthe new array is:..........");
	  printf("\n");
     for(int i=0;i<10;i++)
	 {
	  printf("%d\t",c[i]);
	 }


}
