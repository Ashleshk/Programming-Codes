#include<stdio.h>
void main()
{
   int i,j,k,s;
   for(i=1;i<=3;i++)
   {
	   for(j=1;j<=3;j++)
      {
		  for(k=1;k<=3;k++)
          {
			  
			  if((i==j) && (j==k) && (k==i))
			  {
			     continue;
			  }
			  else
			  {
			    s=0;
			    s=i*100+j*10+k;
			    
			  }
          }
		  printf("%d\n",s);
      }
   }

}