#include<stdio.h>
#include<stdlib.h>

int** AllocateMem(int,int);
void Accept(int**,int,int);
void Display(int**,int,int);
int CountNonZero(int**,int,int);
void CreateSp(int**,int**,int,int);
int i,j;

void main()
{
	int **mat,**sp,row,col,ch,nonzero;
	do
	{
		printf("\n\n\t\t1. Accept Array\
			      \n\t\t2. Display Array\
				  \n\t\t3. Create And Display Sparse\
				  \n\t\t0. Exit\
				  \n\t Enter Your Chcoie ");
		scanf("%d",&ch);
		
		switch(ch)
		{
		case 1:
			printf("\n\n\t Enter row and Col Size ");
			scanf("%d%d",&row,&col);
			mat=AllocateMem(row,col);
			printf("\n\n\t Enter Value For 1st Array ");
			Accept(mat,row,col);
			
			break;
		case 2:
			printf("\n\n\t 1st Array \n\n ");
			Display(mat,row,col);
			break;
		case 3:
			nonzero=CountNonZero(mat,row,col);
			sp=AllocateMem(nonzero+1,3);
			CreateSp(mat,sp,row,col);
			Display(sp,nonzero+1,3);
			break;
		}
	}while(ch!=0);
	printf("\n\n\n");
}
			
			




int CountNonZero(int **mat,int r,int c)
{
	int cnt=0;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(mat[i][j]!=0)
				cnt++;
		}
	}
	return cnt;
}

void CreateSp(int **ma,int** sp,int r,int c)
{
	int k=1;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(ma[i][j]!=0)
			{
				sp[k][0]=i;
				sp[k][1]=j;
				sp[k][2]=ma[i][j];
				k++;
			}
		}
	}
	sp[0][0]=r;
	sp[0][1]=c;
	sp[0][2]=k-1;
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