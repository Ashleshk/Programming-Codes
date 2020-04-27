/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*problem: write a c program to store data of resiatance (like name,value and tolerance )
1.display the data in descending order of tolerance(bubble sort)
2.display the data for resistance name specified by user
3.display no. of passes and comparision for different test cases(worst,average,best)*/

#include <stdio.h>
#include<string.h>
struct resistance                                                                 //STRUCTURE defination
{
     char name[80];
	 int value;
     float tolerance;
};
int c=0;
int t=0;
void accept(struct resistance list[], int s);                                     //function defination
void display(struct resistance list[], int s);
void bsortDesc(struct resistance list[], int s);
void searchstu(struct resistance list[],int s,char* key);

int main()
{
    struct resistance data[20];                                                    //variable declaration
    int n,choice,ch;
	char key[20];
	
	printf("Number of records you want to enter? : ");
    scanf("%d", &n);
	
	accept(data, n); 
	display(data, n);                                                           //database data input         
    do{                                                                         //Creates Menu for the user
          printf("Menu:\n ");
          printf("1.SORTED DISPLAY\n2.SEARCH A RESISTANCE \n3.COMPARISION AND PASSES\n4.Exit\nYour choice: ");
          scanf("%d",&choice);

          switch(choice)
          {
              case 1:   bsortDesc(data, n);                                     //display data in descending 
                        printf("\ndata after sorting");                         //order
                        display(data, n);                               
                        break;                                                        
              
			  case 2:  printf("\nEnter the name of the resistance:");
		               scanf("%s", key);
		               searchstu(data,n,key);                              
                       break;
			  case 3:  printf("total comparision resulting in swap: %d and total passes:%d",c ,t);
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
/**************************************FUNCTION-DEFINATION********************************************************/
/**************************************ACCEPT DEFINATION**********************************************************/
void accept(struct resistance list[80], int s)
{
    int i;
    for (i = 0; i < s; i++)
    {
        printf("\n\nEnter data for Record #%d", i + 1);
        
        printf("\nEnter name : ");
        scanf("%s", list[i].name);

        printf("Enter value : ");
        scanf("%d",&list[i].value);

        printf("Enter tolerance : ");
        scanf("%f", &list[i].tolerance);
    } 
}
/**************************************DISPLAY DEFINATION**********************************************************/
void display(struct resistance list[80], int s)
{
    int i;
    printf("\n|\tName\t|\tvalue\t|\ttolerance\t|\n");
    for (i = 0; i < s; i++)
    {
        printf("|\t%s\t|\t%d\t|\t%.2f\t\t|\n", list[i].name, list[i].value, list[i].tolerance);
    } 
}
/**************************************SORTING-FOR-DISPLAY DEFINATION**********************************************/
void bsortDesc(struct resistance list[80], int s)
{
    int i,comparision=0,m, j,k,flag=0;
    struct resistance temp;
    for (i = 0; i < s - 1; i++)
    {    k=i;
	    printf("\npass %d:\t",k+1); 
        for (j = 0; j < (s - 1-i); j++)
        {
            if (list[j].tolerance < list[j + 1].tolerance)
            {   comparision++;
                temp = list[j];
                list[j] = list[j + 1];
               list[j + 1] = temp;flag=1;
			}
			printf("current comparision %d",comparision);
			if(flag==1)
			{	printf("\tdata swapped..");flag=0;}
			display(list,s);
		}
    }
	c=comparision;t=k+1;       
	if(comparision==0)
	{
       printf("\nthis is best case searching");
	}
	else if(comparision==2*s)
	{    printf("\nthis is worst case searching");
	}
	else 
		printf("\nthis is average case");
}
/**************************************SEARCHING-DEFINATION********************************************************/
void searchstu(struct resistance list[],int s,char* key)
{
	int i,found=0,pass=1,comparision=0;
	for (i = 0;i < s ;i++)
    {    
		if (strcmp(key, list[i].name) == 0)
	    {   printf("\n|\tName\t|\tvalue\t|\ttolerance\t|\n");
			printf("|\t%s\t|\t%d\t|\t%.2f\t\t|\n", list[i].name, list[i].value, list[i].tolerance);
            found=1;
			break;
		}
	}
}
/**************************************END-OF-THE-PROGRAM********************************************************/