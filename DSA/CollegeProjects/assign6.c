#include<stdio.h>

struct stud 
{
	int r_no;
	char name[10];
	float per;	
}s[15],t;

void input(struct stud [10],int);
void show(struct stud [15],int);
void bubble(struct stud [15],int);
int main(void)
{
	int i,j,k,n;
	printf("\n enter number of students \n");
	scanf("%d",&n);
	
	input(s,n);	
	show(s,n);
	bubble(s,n);
	return 0;
}


void input(struct stud s[15],int n)
{
		int i=0; char ch;
	while(i<n)
	{	

		printf("\nenter name\n");
		scanf("\n");
		gets(s[i].name);
	
	   	printf("\nenter roll number\n");
		scanf("%d",&s[i].r_no);
		
		printf("\nenter percentage marks\n");
		scanf("%f",&s[i].per);
		
		i++;
	}
}

void show(struct stud s[15],int n)
{
	int i=0,j=0;
	for(i=0;i<n;i++)
	{
		printf("\n\t%s\t%d\t%0.2f\n",s[i].name,s[i].r_no,s[i].per); 
	}
}

void bubble(struct stud s[15],int n)
{ 
				printf("\nSORTING STARTED\n");
int i=0,j=0,k=0; int flag,count;
	for(i=0;i<n;i++)
	{     flag=0; count=0;
		for(j=0;j<n-i-1;j++)
		{	
			if(s[j].r_no>s[j+1].r_no)
			{
				t=s[j]; s[j]=s[j+1]; s[j+1]=t; flag=1; count++;
				
			}			
		}

			printf("\nPASS =%d\t swappings=%d\t",i,count); show(s,n);
			if(flag==0) {break;}
	}
}
