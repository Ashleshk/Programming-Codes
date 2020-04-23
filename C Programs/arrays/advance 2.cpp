#include<stdio.h>
void main()
{
  float ar[5];
  float temp;
  int i,j;
  for( i=0;i<5;i++)
  {
    scanf("%f",&ar[i]);
  }
  for( i=0; i<5;i++)
  {  
	if(i%2==0)
	{
     temp=ar[i];
	 ar[i]=ar[i+1];
	 ar[i+1]=temp;
	}
  }

  for(j=0;j<5;j++)
  {
    printf("%g\t",ar[j]);
  }

}