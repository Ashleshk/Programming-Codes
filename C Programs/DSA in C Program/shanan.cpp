#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<math.h>
 
float prob[10];
int code[10][10];
int counter[10];
void shannon(int first, int last, float pb[])
{
     
	float g1=0,g2=0,diff1=0,diff2=0;
	int i,d,k,j;
	if((first+1)==last ||first==last || first>last)
	{
		if(first==last|| first>last)
			return;
	 
		code[last][++(counter[last])]=0;
		code[first][++(counter[first])]=1;
		return;
	}
	else
	{
		for(i=first;i<=last-1;i++)
			g1=g1+prob[i];
			g2=g2+prob[last];
			diff1=g1-g2;
			if(diff1< 0)
				diff1=diff1*-1;
				j=2;
				while(j!=last-first+1)
				{
					k=last-j;
					g1=g2=0;
					for(i=first;i<=k;i++)
						g1=g1+prob[i];
					for(i=last;i>k;i--)
						g2=g2+prob[i];
					
					diff2=g1-g2;
						
					if(diff2< 0)
						diff2=diff2*-1;
					if(diff2>=diff1)
						break;
					diff1=diff2;
					j++;
				}
				k++;
				for(i=first;i<=k;i++)
					code[i][++(counter[i])]=1;
				for(i=k+1;i<=last;i++)
					code[i][++(counter[i])]=0;
	shannon(first,k,pb);
	shannon(k+1,last,pb);
	}
}
int main()
{
	int n,i,j;
	float x,tpro,total=0,lavg=0,entropy=0;
 	
	printf("Enter How Many Symbols Do You Want To Enter\t: ");
	scanf("%d",&n);
 
	printf("Enter Probabilities -->");
	for(i=0;i<n;i++)
	{
		scanf("%f",&x);
		prob[i]=x;
		total += prob[i];
		if(total>1)
		{
			printf("\t\tThis probability is not possible.Enter new probability");
			total=total-prob[i];
			i--;
		}
	}
	prob[i]=1-total;
	for(j=1;j<=n-1;j++)
	{
		for(i=0;i< n-1;i++)
		{
			if((prob[i])>(prob[i+1]))
			{
				tpro=prob[i];
			 	prob[i]=prob[i+1];
			    prob[i+1]=tpro;
			}
		}
	}
	for(i=0;i<=n-1;i++)
	{
		counter[i]=-1;
	}
  	
 	shannon(0,n-1,prob);
 	
	printf("---------------------------------------------------------------");
	printf("\n\t|\tSymbol\t|\tProbability\t|\tCode\t|\t");
	for(i=n-1;i>=0;i--)
	{
		printf("\n\t|\t%d\t|\t%f\t|\t",i+1,prob[i]);
		for(j=0;j<=counter[i];j++)
			printf("%d",code[i][j]);
	}
	printf("\n---------------------------------------------------------------");
	
    // code word length
	for(i=0;i<n;i++)
	{
		lavg=lavg + ((counter[i]+1)*prob[i]);
	}
	printf("\nCode length average: %f",lavg); 
	
	//entropy
	for(i=0;i<n;i++)
	{
	   entropy=entropy+((prob[i]*(log(prob[i])))*-1);
	   entropy=entropy/(log(2.0));
	}
	printf("\nEntropy: %f",entropy);
	
	getch();
	return 0;
}
 


