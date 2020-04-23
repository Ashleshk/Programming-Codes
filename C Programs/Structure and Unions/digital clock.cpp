#include<stdio.h>
#include<conio.h>
typedef struct time
{
   int hr;
   int min;
   int sec;

}sa;
void display(sa t1)
{
   while(!kbhit())
	 {  for(int i=0;i<24;i++)
	   {
		   for(int j=0;j<61;j++)

		   {
			   if(j==60)
			   {
			      i=i+1;
			   }
			   for(int k=0;k<61;k++)
			   {    if(k==60){j=j+1;}
					printf("\n\n the current time is:....%d:%d:%d",t1.hr+i,t1.min+j,t1.sec+k);
			   }
		   }
	   }
   }
}

void gettime()
{
   sa t1,t2;
   
   

   printf("\nEnter hour:");
   scanf("%d",&t1.hr);
   printf("\nEnter present min:");
   scanf("%d",&t1.min);
   printf("\nEnter sec:");
   scanf("%d",&t1.sec);
   
   
   display(t1);
}
int main()
{  
    gettime();
	
} 