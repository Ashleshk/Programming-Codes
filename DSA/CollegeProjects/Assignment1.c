/* ________________________________  ASHLESH KHAJBAGE, ROLL NO 2508 _____________________________________________*/

/*write a program  in c to implement searching methods-
	1. linear search 
	2. binary search  */
/*---------------------------------------------------------------------------------------------------------------*/
	#include<stdio.h>                                              //header files
	#include<conio.h>
	#include<process.h> 
	void create(int a[],int n);
	void Linear_search(int a[],int  n,int key);                    //function prototype for linear search    
	void Binary_search(int a[],int n,int key);                     //function prototype for  bineary search
	void main()
	{
	int a[30],b[30],i,j,key,n=0,ch ;
    do{  
	   printf("\nMENU FOR SEARCHING \n1.LINEAR SEARCH\n2.BINARY SEARCH\n3.EXIT ");
	   printf("choose your option(1-3):");
	   scanf("%d",&ch); 
	   if(ch !=3)                                                  // retrieving array details until user chooses to exit
	   {
	     printf("Enter the value of size:");
	     scanf("%d", &n);                                          //input size
	     printf("Enter the elements one by one :");
	     for ( i = 0; i < n; i++)                                  //loop for  input elements
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
		case 1 :     
					printf("\nEnter the element to be searched :");
					scanf("%d", &key);
					Linear_search(a, n,key);
					break;
		case 2:    printf("\nEnter the element to be searched :");
					scanf("%d", &key);
					Binary_search(a,n,key);
					break;
		case 3:   exit(0);
		default : break;         
	   }
	   getch();
      
	}while(1);
}
/*------------------------------------function defination-----------------------------------------------------*/ 
/*------------------------------------linear_search defination-----------------------------------------------------*/ 
	void Linear_search(int a[],int  n,int key)
	{   int i,found=0;
	    for (i = 0;i < n ;i++)
	    {
		  if (key==a[i] )
		  { found=1;
			printf("Element is present in the array at position %d",i+1);
            if(i==0)
			{
				printf("\nthis is best case searching");
			}
			else if(i<n )
			{    printf("\nthis is average case searching");
			}
			else 
				printf("\nthis is worst case");
		  }
		}
	    if(found==0)
		{	printf("\nElement is not present in the array\n");
	        printf("\nthis is worst case");
		}
	}
/*------------------------------------binary search defination-----------------------------------------------------*/ 
	void Binary_search(int a[],int n,int key)
	{
	int i,j,temp,c,found=0;
	for(i=1;i<n;i++)
	{
		for(j=0;j<n-i;j++)
		{
			if(a[j]>a[j+1])
			{
			temp = a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	}
	printf("sorted array is \n");
	for (i = 0; i < n; i++)
	{
		printf("%d\t", a[i]);
	}
	printf("\n");
	i = 0;
	j = n - 1;
	c = (i+j)/2;
    while (i <= j) {
		if (a[c] < key)
			i = c + 1;    
		else if (a[c] == key) {
			printf("%d found at location %d.\n", key, c+1);
			if(i==0)
			{
				printf("\nthis is best case searching");
			}
			else if(i<n )
			{    printf("\nthis is average case searching");
			}
			else 
				printf("\nthis is worst case");
			break;
		}
		else
			j = c - 1;
        c = (i + j)/2;
	}
	if (i > j)
	{	printf("Not found! %d is not present in the list.\n", key);
	    printf("this is worst case");
	}
	}
        
  /*------------------------------------end of the program-----------------------------------------------------*/   
	




