#include<stdio.h>
#define grea(x,y,z)   x>y?x>z?x:z:y>z?y:z
                         
void main()
{
    int x,y,z;
	int m;
	printf("Enter three number:");
	scanf("%d%d%d",&x,&y,&z);
	m=grea(x,y,z);
	printf("%d is greatest",m);
}