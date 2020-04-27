#include<stdio.h>
#include<conio.h>
#include<process.h>
void bubble_sort(int a[],int  n)
{    
	 int i, temp,j; 
	 for (i = 0 ; i < ( n - 1 ); i++)
     {
    for (j = 0 ; j < n - i - 1; j++)
    {
      if (a[j] > a[j+1])
      {
        temp = a[j];
        a[j]   = a[j+1];
        a[j+1] = temp;
	  }
	 printf("\nsorted array is \n");
	  for (i = 0; i < n; i++)                                   //loop for display elements
	      printf("%d\t", a[i]);
     
}
 
void insertion_sort(int a[],int n)
{
	int i,j,temp;
	for(i=1;i<n;i++)
	{
	    temp=a[i];
		for(j=i-1;j>=0 && a[j]>temp;j--)
		{
		  a[j+1]=a[j];
		}
		a[j+1]=temp;
	}
}

void main()
{
 int a[30],b[30],i,j,n=0,ch ;
    do{  
	   printf("\nMENU FOR SORTING \n1.BUBBLE SORTING\n2.SELECTION SORTING\n3.INSERTION SORTING\n4.EXIT ");
	   printf("choose your option(1-4):");
	   scanf("%d",&ch); 
	   if(ch !=4)                                               
	   {
	     printf("Enter the value of size:");
	     scanf("%d", &n);                                          
	     printf("Enter the elements one by one :");
	     for ( i = 0; i < n; i++)                                  
	     {
		    scanf("%d", &a[i]);
	     }
	     printf("Input array is \n");
	     for (i = 0; i < n; i++)                                   //loop for display elements
	     {
		    printf("%d\t", a[i]);
	     }
	   }  
	   switch(ch)                                                  // switch case for linear and binary 
	   {
		case 1 :    bubble_sort(a, n);
			       printf("\nsorted array is \n");
	                
	                break;

		case 2:     selection_sort(a,n);
			        
					break;

		case 3:    insertion_sort(a,n);
			       
					break;
		case 4:   exit(0);
		default : break;         
	   }
	   getch();
      
	}while(1);
}