#include<stdio.h>
int main()
{
    int p ,n,r, s ;
	int i=1 ;
	while(i<=3)
	{ 
	    printf("\n");
		printf("\nenter the values for principal  no. of year and rate:");
	  scanf("%d%d%d",&p,&n,&r);
	  s = p*n*r/100 ;
	  printf("\nThe simple interest for the person %d = %d",i,s);
	   i++ ;

	}

}