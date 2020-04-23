 #include<stdio.h>
#include<stdlib.h>

float *ptr;
float value=0.0f;	 
int limit,prob[15];	 
int i,j;		 
float sum=0;
 
void bubble_sort(int *ptr,int s)
{
	int i,j;
	int temp;
	for(i=1;i<s;i++)
	{
	  for(j=0;j<s-i;j++)
	  {
		if(*(ptr+j)<*(ptr+j+1))
		 {
		  temp=*(ptr+j);
		  *(ptr+j)=*(ptr+j+1);
		  *(ptr+j+1)=temp;
		 }
	  }
	}
}
void fill_row()
{
	int **arr = (int **)malloc(limit * sizeof(int *));
    for (i=0; i<limit; i++)
         arr[i] = (int *)malloc(limit * sizeof(int));

	for(i=0;i<limit;i++)
	{
		for(j=0;j<limit;j++)
		{
			if(i==0)
			{
		      arr[i][j]=prob[j];
			}
			else if(i>0)
			{   if(j==limit-1-i)
				{
					arr[i][j]=arr[i-1][j]+arr[i-1][j+1];
					continue;
				}
				if(j>limit-1-i)
				{arr[i][j]=99;
				}
				else
				arr[i][j]=arr[i-1][j];
			}
			 
				
		}

	}
	for (i = 0; i <  limit; i++)
	{
      for (j = 0; j < limit; j++)
	  { printf("%d ", arr[i][j]);
	  }
	   printf("\n");
	}


}
int main()
{

    // prob ip array

	 printf("Enter limit of the array: ");
	scanf("%d",&limit);

	 ptr=(float*)malloc(limit*sizeof(float));

	 i=0;
	while(i<limit && sum<=1)
	{
		printf("\nEnter element %02d: ",i+1);
		scanf("%f",(ptr+i));
		
		sum+=*(ptr+i);
		printf("Sum: %0.3f",sum);
		if(sum>1)
		{
			printf("\nThis probability is not possible.\nEnter new probability");
			sum=sum-*(ptr+i);
			i--;
		}
		
		i++;
	}
	if(sum==1)
	{
		
		printf("\nSum of all probabilites are %0.2f \n stopping further inputs",sum);
	}

	printf("\nEntered array elements are:\n");
	for(i=0;i<limit;i++)
	{
		printf("%0.4f\n",*(ptr+i));
		value=*(ptr+i);
		prob[i]=value*1000;
	}
  
	for(i=0;i<limit;i++)
	{
		printf("%d\n",prob[i]);
	}

	bubble_sort(prob,limit); 
	fill_row();







	printf("\n\n");
	for(i=0;i<limit;i++)
	{
		printf("%d\n",prob[i]);
	}
	
	
	scanf("%d",i);
	free(ptr);	 
	
	return 0;
}
