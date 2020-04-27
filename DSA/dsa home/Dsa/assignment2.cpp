/*---------------------------------ASHLESH KHAJBAGE, ROLL-N0-2508-----------------------------------------*/
/************************************************************************************************************
write a program in c implements sorting methods-
1.bubble
2.selection
3.insertion
************************************************************************************************************/

#include<stdio.h>
#include<stdlib.h>
void bubble(int *,int);                                             //function prototypes
void selection(int *,int);
void insertion(int *,int);
int main()
{
  int count=0;                                                      //size of array
  int choice=0,ch=0;                                                //variables used to store user choice
  int check=0;                                                      //used to check status 
  int i=0;                                                          //loop variable

  printf("Enter the size of the list: ");
  scanf("%d",&count);
  int list[30];
  printf("Enter the elements of the list: ");
  for(i=0;i<count;i++)                                              //filling in the array
  { 
     scanf("%d",&list[i]);
  }
  
 printf("\narray entered: ");                                       //prints the list  
 for(i=0;i<count;i++)
   printf("%d\t",list[i]);
 printf("\n");

do{                                                                 //Creates Menu for the user
printf("Menu:\n\n");
printf("1.Bubble sort\n2.Selection Sort\n3.Inserton sort\n4.Exit\nYour choice: ");
scanf("%d",&choice);

switch(choice)
{
  case 1:   bubble(list,count);                                     //performs bubble sort
            break;                                                        
          

  case 2:  selection(list,count);                                   //performs selection sort
           break;
  
  case 3: insertion(list,count);                                    //performs insertion sort
          break;

  case 4: return 0;

  default: printf("Invalid option\nRetry: ");
           break;
}
 printf("\nDo you want to continue(press 1 to continue any other number to exit): ");
 scanf("%d",&ch);
} while(ch==1);
return 0;
}
/*******************************************BUBBLE-SORT********************************************/ 
void bubble(int *a,int n)
{
 int i,j,k;
 int c,m;
 static int count=0;


 for(i=0;i<n;i++)
   {   k=i;
	   printf("pass %d:\n",k+1);m=1;
     for (j=0;j<n-i-1;j++)
      {
        if (a[j] > a[j+1])
          {
            c=a[j];
            a[j]=a[j+1];
            a[j+1]=c;
			
			printf("iteration %d:",m ); m++;
			for(int l=0;l<n;l++)
			{   
				
				printf("%d\t",a[l]);
				count++;
			}
			printf("\n");
          }
		  
      }
   }

  printf("\nSorted list in ascending order:\n");
  for ( i = 0 ; i < n ; i++ )
    printf("%d\t",a[i]);
  if(count==0)
	{
				printf("\nthis is best case searching");
	}
	else if(count<n-2)
	{    printf("\nthis is average case searching");
	}
	else 
		printf("\nthis is worst case");
   
}
/*******************************************SELECTION-SORT********************************************/ 
void selection(int *list,int n)
{

 int i=0;
 int j,min;
 int k,z,m;
 static int count=0;


 for(j=0;j<n-1;j++)
  {  z=i;
	 printf("pass %d:\n",z+1);m=1;
     min=list[j];
     k=j;
     for(i=j+1;i<n;i++)
      {

       if(list[i]<min)
       {
         min=list[i];
         k=i;
		 printf("iteration %d:",m ); m++;
			for(int l=0;l<n;l++)
			{   
				
				printf("%d\t",list[l]);
				count++;
			}
			printf("\n");
       }

     }

   list[k]=list[j];
   list[j]=min;
   
}

printf("Sorted list is:");

for(i=0;i<n;i++)
{
 printf("%d\t",list[i]);
}
 if(count==0)
	{
	    printf("\nthis is best case searching");
	}
	else if(count<n-2)
	{    printf("\nthis is average case searching");
	}
	else 
		printf("\nthis is worst case");


printf("\n");

}
/*******************************************INSERTION-SORT********************************************/ 
 void insertion(int *list,int n)
{
	int temp,k;
	int i=0,j=0,m;
	static int count=0;

	for(i=1;i<n;i++)
    {    k=i;
		printf("pass %d:\n",k+1);m=1;
		temp=list[i];
		j=i-1;
		 while((j>=0)&&(list[j]>temp))
		  {
			list[j+1]=list[j];
			j--;
			printf("iteration %d:",m ); m++;
			for(int l=0;l<n;l++)
			{   
				
				printf("%d\t",list[l]);
				count++;
			}
			printf("\n");
		  }
	list[j+1]=temp;
	}

  printf("Sorted list is: ");
   for(i=0;i<n;i++)
     {
     	printf("%d\t",list[i]);
  	 }
    if(count==0)
	{
				printf("\nthis is best case searching");
	}
	else if(count<n-2)
	{    printf("\nthis is average case searching");
	}
	else 
		printf("\nthis is worst case");

	printf("\n");
}
 /*******************************************END-OF-THE-PROGRAM********************************************/ 