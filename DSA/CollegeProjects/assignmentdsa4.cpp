/******************************ASHLESH KHAJABGE,ROLLNO-2508*************************************************/
/*PROBLEM STATEMENT:
DATA BASE MANAGEMENT using array of structure with operations:create,display,modify,append,search and sort.
1.without pointers to structure
2.wit pointers to structure
************************************************************************************************************/
#include<stdio.h>                                           
#include<string.h>                                                         //header files
#include<process.h>
#include<stdlib.h>

struct resistor                                                            //STRUCTURE defination
{   int srno;
    char name[80];
	int value;
    float tolerance;
}c1[5];
struct resistor *p; 
struct resistor data[5];
int n;

void accept(struct resistor list[], int s);                                  //function defination
void display(struct resistor list[], int s);
void bsortDesc(struct resistor list[], int s);
void searchstu(struct resistor list[],int s,char* key);
void Modify( int s );
void deletestr(struct resistor list[],int s,int key,int *k);
void Append(struct resistor list[],int s,int *k);
void createptr(int n);
void displayptr(int n);
void modifyptr();
void append(int n,int *k);
void searchptr(int n);
void sortptr(int n);
void deleteptr(int position,int n);
int main()
{
    p=c1;                                
    int n,choice,ch,ch1,r,sw,k,key1,position;                                              //variable declaration
	char key[20];
    printf("\t+---------------------------------------------------------------+");
	printf("\n\t+\tMENU FOR METHOD\t\t\t\t\t\t+\n\t+\t1.WITHOUT-POINTER-TO-STRUCTURE\t\t\t\t+\n\t+\t2.WITH-POINTER-TO-STRUCTURE\t\t\t\t+\n\t+\t3.EXIT\t\t\t\t\t\t\t+\n\t+\tchoose option(1-3):");
	scanf("%d",&ch1);
	 printf("\t+---------------------------------------------------------------+");
	switch(ch1)
	{
	  case 1:{  printf("\nNumber of records you want to enter? : ");
                scanf("%d", &n);
 			    do{                                                          //repeat the menu
                   printf("Menu:\n ");
				   printf("\n\t+-----------------------------------------------+");
                   printf("\n\t+\t1.CREATE\t\t\t\t+\n\t+\t2.DISPLAY\t\t\t\t+\n\t+\t3.SORTED DISPLAY\t\t\t+\n\t+\t4.SEARCH A RESISTOR \t\t\t+\n\t+\t5.MODIFICATION\t\t\t\t+\n\t+\t6.APPEND\t\t\t\t+\n\t+\t7.delete\t\t\t\t+\n\t+\t8.Exit\t\t\t\t\t+\n\t+\tYour choice: ");
                   scanf("%d",&choice);
				   printf("\t+-----------------------------------------------+");
				   switch(choice)
                   {  case 1:   accept(data, n);
				                break;
				      case 2:   display(data, n); 
						        break;
                      case 3:   bsortDesc(data, n);                           //display data in descending 
                                printf("\ndata after sorting");               //order
                                display(data, n);                               
                                break;                                                     
					  case 4:   printf("\nEnter the name of the resistor:");
		                        scanf("%s", key);
		                        searchstu(data,n,key);                              
                                break;
			          case 5:   Modify(n);
			                    printf("\nthe modofied database is:");
			                    display(data,n);
				                break;
			          case 6:   Append(data,n,&k);
						         n=k;
				                break;
					  case 7:  printf("\nEnter the srno of the resistor:");
		                        scanf("%d", &key1);
								deletestr(data,n,key1,&k);n=k;
								break;
					  case 8:   exit(0);                                        //break; will also work

                     default:    printf("Invalid option\nRetry: ");
                                break;
                   }
                   printf("\nDo you want to continue(press 1 to continue any other number to exit): ");
                   scanf("%d",&ch);
                } while(ch==1);
          	    break;
		       }
	  case 2:{   printf("\nEnter the size of the Database: ");
	           scanf("%d",&n);
			   do                                                               //TO REPEAT THE MENU
	           {  printf("\n\t+-----------------------------------------------+");   
                 printf("\n\t+\t1.Create Database\t\t\t+\n\t+\t2.Display Database\t\t\t+\n\t+\t3.Modify Database\t\t\t+\n\t+\t4.append record\t\t\t\t+\n\t+\t5.search a record\t\t\t+\n\t+\t6.Sort the Database\t\t\t+\n\t+\t7.delete\t\t\t\t+\n\t+\t8.exit\t\t\t\t\t+\n\t+\tchoose option:");
	             scanf("%d",&sw);
				 printf("\t+-----------------------------------------------+"); 
                 switch(sw)
	             {
		             case 1:  createptr(n); 
			                  break;
		             case 2:  displayptr(n);
			                  break;
		             case 3:  modifyptr();displayptr(n);
			                  break;
		             case 4:  append(n,&k);
			                  n=k;
			                  break;
		             case 5:  searchptr(n);
			                  break;
		             case 6:  sortptr(n);
			                  break;
					 case 7 : { printf("\nenter the position:");
						         scanf("%d",&position);
							     if(position<=n)
							    {
						           deleteptr(position ,n);
								   n--;
							    }
							    else
							       printf("cannot delete");						 
							   break;
							  }
		             case 8:  break;
		            default:
			            printf("Enter a Valid Number\n");
	             }
				 printf("\nDo you want to continue(press 1 to continue any other number to exit): ");
                   scanf("%d",&ch);
               }while(ch==1);
		   }
      case 3: exit(0); // break;
	}
	
     return 0;
} 
/**********************************FUNCTION-DEFINATION*********************************************/
/********************************create-DATABASE****************************************************/
void accept(struct resistor list[80], int s)
{
	int i;
	for (i = 0; i < s; i++)
    {
        printf("\nEnter data for Record #%d", i + 1);
		
		printf("\nenter the serial number:");
		scanf("%d",&list[i].srno);
        
		printf("Enter name : ");
        scanf("%s", list[i].name);

        printf("Enter value  : ");
        scanf("%d",&list[i].value);

        printf("Enter tolerance  : ");
        scanf("%f", &list[i].tolerance);
    } 
}
/************************************DISPLAY DATABASE*********************************/
void display(struct resistor list[80], int s)
{
	int i;
	printf("\n+-----------------------------------------------------------------------+");
    printf("\n|\tSrno\t|\tName\t|\tvalue \t|\ttolerance \t|\n");
	printf("+-----------------------------------------------------------------------+");
	for (i = 0; i < s; i++)
    {
		printf("\n|\t%d\t|\t%s\t|\t%d\t|\t%.2f\t\t|\n",list[i].srno, list[i].name, list[i].value, list[i].tolerance);
    } 
	printf("+-----------------------------------------------------------------------+");
}
/************************SORTING-in-DATABASE********************************/
void bsortDesc(struct resistor list[80], int s)
{
    int i,comparision=0,m, j,k,flag=0;
    struct resistor temp;
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
			printf("\ncurrent comparision %d",comparision);
			if(flag==1)
			{	printf("\tdata swapped..");flag=0;}
			display(list,s);
		 }
    }
	
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
/**************************SEARCHING-in-DATABASE*****************************************/
void searchstu(struct resistor list[],int s,char* key)
{
	int i,found=0,pass=1 ;
	for (i = 0;i < s ;i++)
    {    
		if (strcmp(key, list[i].name) == 0)

	    {   printf("\n+-----------------------------------------------------------------------+");
			printf("\n|\tSrno\t|\tName\t|\tvalue \t|\ttolerance\t|\n");
			printf("+-----------------------------------------------------------------------+");
			printf("\n|\t%d\t|\t%s\t|\t%d\t|\t%.2f\t\t|\n",list[i].srno,list[i].name, list[i].value, list[i].tolerance);
			printf("+-----------------------------------------------------------------------+");
            found=1;
			break;
		}
	}
}
/**************************DELETING-in-DATABASE*****************************************/
void deletestr(struct resistor list[],int s,int key,int *k)
{
	int i,found=0 ;
	for (i = 0;i < s ;i++)
    {    
		if (key==list[i].srno )
	    {    found=i;break;
		}
	}
	for(i=found;i<s-1;i++)
	{
	  list[i]=list[i+1];
	}
	s-=1;
	display(data,s);*k=s;

}
/*******************************modifiy-in-DATABASE ************************************/
void Modify( int n )
{
	int rno,i,sw;
    printf("\nEnter the value of the resistor whose Data you want to modify :");
	scanf("%d",&rno);
	for(i=0;i<n;i++)
	{
	  if(data[i].value==rno)
	  {
		printf("The resistor record was found at Index #%d",i);
		break;
	  }
	  if(i==n)
		printf("Record Not Found");
	}
	printf("\n\t+-----------------------------------------------+\n");
	printf("\t+\tEnter the Field :\t\t\t+\n\t+\t1.change srno\t\t\t\t+\n\t+\t2.change Name\t\t\t\t+\n\t+\t3.change value\t\t\t\t+\n\t+\t4.change tolerance\t\t\t+\n\t+\t5.exit\t\t\t\t\t+\n\t+\tchoose option:");
	scanf("%d",&sw);
	printf("\n\t+-----------------------------------------------+");
	switch(sw)
		{
	   case 1:printf("\nEnter the new srno:");
			scanf("%d", &data[i].srno);  
			printf("The srno has been updated");
			break;
		case 2:
			printf("\nEnter the new name:");
			scanf("%s", data[i].name);  
			printf("The name has been updated");
			break;
		
		case 3:
			printf("\nEnter the new value:");
			scanf("%d",&data[i].value); 
			printf("The value has been updated\n");
			break;
			
		case 4:
			printf("\nEnter the new tolerance:");
			scanf("%f",&data[i].tolerance);  
			printf("The tolerance has been updated\n");
			break;
			
		case 5: //TO EXIT THE MENU
			break;
			
		default:
			printf("\nEnter a Valid Number\n");
		}
}
/*********************** APPEND in DATABASE *********************************************/
void Append(struct resistor list[],int s,int *k)
{
	if(s>=5)
	{
	   printf("\nNo memory available to add new record\n");
	    return ;
	}
	else
	{   printf("\nEnter Srno  : ");
        scanf("%d",&list[s].srno);
        
		printf("\nEnter name : ");
        scanf("%s", list[s].name);

        printf("Enter value  : ");
        scanf("%d",&list[s].value);

        printf("Enter tolerance : ");
        scanf("%f", &list[s].tolerance); 
	    s=s+1;
		display(data,s);*k=s;
	}
}
/********************* END OF TYPE-1( WITHOUT POINTER-TO-STRUCTURE)   **************************/
/**************************  TYPE-2( WITH  POINTER-TO-STRUCTURE)   *****************************/
/********************************  CREATE DATABASE   *******************************************/
void createptr(int n)
{
    for(int i=0;i<n;i++)
	{   
	    printf("\nEnter data for Record #%d", i + 1);
		
		printf("\nenter the serial number:");
		scanf("%d",&(p+i)->srno);
        
		printf("Enter name : ");
        scanf("%s",&(p+i)->name);

        printf("Enter value  : ");
        scanf("%d",&(p+i)->value);

        printf("Enter tolerance  : ");
        scanf("%f", &(p+i)->tolerance);
	 
	}
}
/*************************** DISPLAY DATABASE  *************************************************/
void displayptr(int n )
{
	int i;
	printf("\n+-----------------------------------------------------------------------+");
     printf("\n|\tSrno\t|\tName\t|\tvalue \t|\ttolerance \t|\n");
	 printf("+-----------------------------------------------------------------------+");
    for(i=0;i<n;i++)
    {
        printf("\n|\t%d\t|\t%s\t|\t%d\t|\t%.2f\t\t|\n",(p+i)->srno,(p+i)->name,(p+i)->value,(p+i)->tolerance);
    }
	printf("+-----------------------------------------------------------------------+");
}
///**************************MODIFY DATABASE*************************************************************/
void modifyptr( )
{
	int rno,i,sw  ;
	printf("\nEnter the serial Number of the resistor whose Data you want to modify:  ");
	scanf("%d",&rno);
	
	for(i=0;i<n;i++)
	{
	   if(rno==(p+i)->srno)
		{
			printf("The resistor record was found at Index #%d",i); 
			break;
		}
	    if(i==n)
		   printf("\nRecord Not Found");
	}	
	 
	 printf("\n\t+-----------------------------------------------+\n");
	printf("\t+\tEnter the Field :\t\t\t+\n\t+\t1.change srno\t\t\t\t+\n\t+\t2.change Name\t\t\t\t+\n\t+\t3.change value\t\t\t\t+\n\t+\t4.change tolerance\t\t\t+\n\t+\t5.exit\t\t\t\t\t+\n\t+\tchoose option:");
	scanf("%d",&sw);
	printf("\n\t+-----------------------------------------------+");
	switch(sw)
		{
	    case 1:
			printf("\nEnter the new srno  :");
			scanf("%d",&(p+i+1)->srno); //s[i].value
			printf("The srno   has been updated\n");
			break;
		case 2:
			printf("\nEnter the new name :");
			scanf("%s", (p+i+1)->name); //s[i].name
			printf("The name has been updated:");
			break;
		
		case 3:
			printf("\nEnter the new value  :");
			scanf("%d",&(p+i+1)->value); //s[i].value
			printf("The value   has been updated\n");
			break;
			
		case 4:
			printf("\nEnter the new tolerance :");
			scanf("%f",&(p+i+1)->tolerance); //s[i].tolerance
			printf("The tolerance  has been updated\n");
			break;

		case 5: //TO EXIT THE MENU
			break;
			
		default:
			printf("\nEnter a Valid Number\n");
		}
	 
}
/************************* APPEND DATABASE *****************************************************/
 void append(int n,int *k)
 {
	if(n>=8)
	{
		printf("There is no memory available to add more records");
	}
	else
	{
		printf("\nEnter the details for %d record\n",n+1);
		printf("Enter Srno  : ");
        scanf("%d",&(p+n)->srno);
        
		printf("\nEnter name : ");
        scanf("%s", &(p+n)->name);

        printf("Enter value  : ");
        scanf("%d",&(p+n)->value);

        printf("Enter tolerance : ");
        scanf("%f", &(p+n)->tolerance);
		 
		*k=++n;
		displayptr(n);
	}
 }
/****************************** SEARCH-IN-DATABASE *********************************************/
void searchptr( int n)
{
	int i,j=1,ch;
	printf("\nEnter the Serial No. of the record to be searched : ");
	scanf("%d",&ch);
	for(i=0;i<n;i++)
	{
		if(ch==(p+i)->srno)
		{
			printf("\nThe Record is found.\n");
			printf("\n+-----------------------------------------------------------------------+");
			printf("\n|\tSrno\t|\tName\t|\tvalue \t|\ttolerance\t|");
			printf("\n+-----------------------------------------------------------------------+");
			printf("\n|\t%d\t|\t%s\t|\t%d\t|\t%.2f\t\t|\n",(p+i)->srno,(p+i)->name,(p+i)->value,(p+i)->tolerance);
			printf("+-----------------------------------------------------------------------+");
			j=0;
		}
	}
	if(j==1)
	{
		printf("\nThe record is not found.\n");
	}
}
/***********************************SORT-IN-DATABASE************************************/
void sortptr(int n) 
{
    int i,j,l=0,k,P,flag=0,comparision=0;
	struct temp
	{
		 int temp1;
		char temp2[3];
		float temp3;
		int temp4;
	}t1[5];
	struct temp *q;
	q=t1;
  
	for(i=1;i<n;i++)
	{    P=i;
	     printf("\npass %d:\t",P+1);
		 for(j=0;j<n-i;j++)
		 {
            if((p+j)->tolerance>(p+j+1)->tolerance)
            {
                (q+j+1)->temp1=(p+j)->srno;
				(p+j)->srno=(p+j+1)->srno;
				(p+j+1)->srno=(q+j+1)->temp1;
				strcpy((q+j+1)->temp2,(p+j)->name);
				strcpy((p+j)->name,(p+j+1)->name);
				strcpy((p+j+1)->name,(q+j+1)->temp2);
				(q+j+1)->temp3=(p+j)->tolerance;
				(p+j)->tolerance=(p+j+1)->tolerance;
				(p+j+1)->tolerance=(q+j+1)->temp3;
				(q+j+1)->temp4=(p+j)->value;
				(p+j)->value=(p+j+1)->value;
				(p+j+1)->value=(q+j+1)->temp4;
				 l++;
			}
			printf("\ncurrent comparision %d",comparision);
			if(flag==1)
			{	printf("\tdata swapped..");flag=0;}
			displayptr(n);
		 }
	}
	printf("\nthe final sorted database is:");
	displayptr(n);
	printf("\n\nTotal No. of swappings that took place=%d\n",l);
	k=(n-1)*(n/2);
	if(l==0)
	{
		printf("\nThis is the best case\n");
	}
	else if (l<k)
	{
		printf("\nThis is the avg case\n");
	}
	else
	{
		 printf("\nThis is the worst case\n");
	}
}
/******** deleting in database***********/    
void deleteptr(int pos  ,int n )
{ 
	 struct resistor *i;int l;
	
	 printf("found=%d",pos );
	 for(l=0;l<n;l++)
	{ 
		if(pos ==((p+l)->srno))
		{    break; 
		}
	} 
	for(i=p+pos ;i<p+n-1 ;i++)
	{
	    
	  *(i )=*(i+1);
	}
}
 
 