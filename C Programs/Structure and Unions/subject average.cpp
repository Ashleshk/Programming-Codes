#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
	int num ,i,s,j ,avg,sum[10];
  int  **str, temp[10];
  printf("Enter number of students you want to enter::");
  scanf("%d",&num);
  printf("\n\nEnter total subjest of students::");
  flushall();
  scanf("%d",&s);
  str=(int**)malloc(sizeof(int*)*num);
  for(i=0;i<num;i++)
  { 
     
	 str[i]=(int*)malloc(sizeof(int*)*s);
  }
  for(i=0;i<num;i++)
  {  sum[i]=0;
	  for(j=0;j<s;j++)
    {
	  printf("\nEnter subjects marks:");
      scanf("%d",&str[i][j]);
      sum[i]=sum[i]+str[i][j];
    }
  }
	 
  
    for(i=0;i<num;i++)
  {
    
	printf("student %d average marks is %d\n\n",i+1,sum[i]/5);
  }
	for(i=0;i<num;i++)
  {
     free(str[i]);
  }
}