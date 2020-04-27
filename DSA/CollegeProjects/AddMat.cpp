#include<stdio.h>
#include<stdlib.h>

int** AllocateMem(int,int);
void Accept(int**,int,int);
void Display(int**,int,int);
void Add(int**,int**,int,int);
int i,j;
void main()
{
	int **mat1,**mat2,row,col,ch;
	do
	{
		printf("\n\n\t\t1. Accept Array\
			      \n\t\t2. Display Array\
				  \n\t\t3. Addition\
				  \n\t\t0. Exit\
				  \n\t Enter Your Chcoie ");
		scanf("%d",&ch);
		
		switch(ch)
		{
		case 1:
			printf("\n\n\t Enter row and Col Size ");
			scanf("%d%d",&row,&col);
			mat1=AllocateMem(row,col);
			mat2=AllocateMem(row,col);
			printf("\n\n\t Enter Value For 1st Array ");
			Accept(mat1,row,col);
			printf("\n\n\t Enter Value For 2st Array ");
			Accept(mat2,row,col);
			break;
		case 2:
			printf("\n\n\t 1st Array \n\n ");
			Display(mat1,row,col);
			printf("\n\n\t 2st Array \n\n");
			Display(mat2,row,col);
			break;
		case 3:
			Add(mat1,mat2,row,col);
			break;

		}
	}while(ch!=0);
	printf("\n\n\n");
}




int** AllocateMem(int r,int c)
{
	int **m;
	m=(int**)malloc(sizeof(int*)*r);
	for(i=0;i<r;i++)
		m[i]=(int*)malloc(sizeof(int)*c);
	return m;
}
void Accept(int **a,int r,int c)
{
	for(i=0;i<r;i++)
	{
		printf("\n\n\t Enter %d elements",c);
		for(j=0;j<c;j++)
			scanf("%d",(*(a+i)+j));
	}
}

void Display(int **a,int r,int c)
{
	for(i=0;i<r;i++)
	{
		printf("\n\n\t");
		for(j=0;j<c;j++)
			printf("%d  ",*(*(a+i)+j));
	}
}


void Add(int** a,int** b,int r,int c)
{
	int **res=AllocateMem(r,c);
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			res[i][j]=a[i][j]+b[i][j];
		}
	}
	Display(res,r,c);
}