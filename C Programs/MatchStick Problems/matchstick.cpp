#include<stdio.h>
int main()
{
	int u,c ,s,k ;
	s=21;
	for( ;  ; )
	{
	    printf("\nchoose the matchstick (1or2or3or4):");
		scanf("%d",&u);
		c=5-u;
		printf("\ncomputer choose %d",c);
		k=u+c;
		s=s-k;
		if(s==1)
		{
		  break;
		}
	}
	printf("winner is computer...\n\ngo home\n\n");

return 0 ;
}