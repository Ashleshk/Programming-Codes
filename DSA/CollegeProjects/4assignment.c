
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
	


void without_pointers_to_structures();
void with_pointers_to_structures();
void main()
{
	void without_pointers_to_structures();
void with_pointers_to_structures();
	int choice,ans;
	
	do{
	
	int choice;
	printf("ENTER CHOICE\n1.without_pointers_to_structures\n2.with_pointers_to_structures");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1:
		without_pointers_to_structures();
		
		break;
		case 2:
		 with_pointers_to_structures();
		 break;
		 case 3:
		 exit;
		 break;
		 default:
		 	printf("INVALID CHOICE");
		 	break;
		 	
	}
printf("\nenter 1 to continue\n");
scanf("%d",&ans);
}
while(ans==1);

}

void without_pointers_to_structures()
	{
	
     struct resistance     //structure declaration
{
    int srno;
	char resistor_name[5];
	int value;
	float tolerance;

};


void main()
{
	int p;
		struct resistance a[5];
		void create(struct resistance a[],int);
void display(struct resistance a[],int);
void append(struct resistance a[],int);
 void delete_data(struct resistance a[],int);
 void modify(struct resistance a[],int);
 void bubblesort(struct resistance a[],int);  //function declaration
void search(struct resistance a[],int);  
		int n=5;
		create(a,n);
		 display(a,n);
	printf("enter choice\n1)Append data \n2)Delete data\n3)Modify data\n4)Sort data\n5)Search data");
	scanf("%d",&p);
	switch(p)
	{
		case 1:
		  append(a,n);
		  break;
		 
		case 2:
		 delete_data(a,n);
		 break;
		case 3:
		 modify(a,n);
		 break;
		 
		 case 4:
		 		bubblesort(a,n); 
				 break; 
		 		case 5:
	search(a,n); 
		 
		 break;
		
	}
}
void create(struct resistance a[],int n)

{
	int i;
	
	printf("enter details of resistors in following order\nsrno.,resistor name,value,tolerance");
	for(i=0;i<5;i++)    //creating array
	{
		scanf("%d%s%d%f",&a[i].srno,&a[i].resistor_name,&a[i].value,&a[i].tolerance);
	}
}
void display(struct resistance a[],int n)
{
	int i;
		printf("entered values are");
	printf("\n|srno    |res_name    |value     |tolerance      |\n ");
	for(i=0;i<5;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
}
void append(struct resistance a[],int n)
{
	int i;
		printf("enter details of resistor in following order\nsrno.,resistor name,value,tolerance to append");
		scanf("%d%s%d%f",&a[n].srno,&a[n].resistor_name,&a[n].value,&a[n].tolerance);
			
		printf("entered values are");
	printf("\n|srno|res_name|value |tolerance|\n ");
	for(i=0;i<=n;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
		
}
 void delete_data(struct resistance a[],int n)
 {
 	int i,c;
 	printf("enter srno to be deleted");
 	scanf("%d",&c);
 	for(i=c-1;i<=n;i++)
 	{
 		a[i]=a[i+1];
 		
	 }
	 	printf("\n|srno|res_name|value |tolerance|\n ");
	for(i=1;i<5;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
	 
 	
 }

void modify(struct resistance a[],int n)
{
	int sno,i,m,new_value;
	char new_name[5];
	float new_tolerance;
	printf("enter the srno to modify");
	scanf("%d",&sno);
	printf("enter the field which you want to change\n1)resistance name\n2)value\n3)tolerance");
	scanf("%d",&m);
	switch(m)
	{
		case 1:
			printf("enter the new name\n");
			scanf("%s",&new_name);
			{
			
			strcpy(a[i].resistor_name,new_name);
		}
			printf("\n|srno|res_name|value |tolerance|\n ");
				for(i=0;i<5;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
			
			break;
			case 2:
				printf("enter new value");
				scanf("%d",&new_value);
				a[sno-1].value=new_value;
				printf("\n|srno|res_name|value |tolerance|\n ");
					for(i=0;i<5;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
				break;
				case 3:
					printf("enter new tolerance");
					scanf("%f",&new_tolerance);
					a[sno-1].tolerance=new_tolerance;
					printf("\n|srno|res_name|value |tolerance|\n ");
					
						for(i=0;i<5;i++)    //printing array
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
					break;
	}
	
}
void bubblesort(struct resistance a[],int n)  //function definition
{
	int j,i;
	struct resistance temp;
	for(i=1;i<5;i++)  //bubble sorting
	{
		
		for(j=5;j>0;j--)
		{
			if(a[j].tolerance>a[j-1].tolerance)
			{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				
			}
		}
	}
		printf("\n|srno|res_name|value |tolerance|\n ");
	for(i=0;i<5;i++)  //displaying sorted array in descending order//
	{
	
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);
    }
}
void search(struct resistance a[],int n)   //function definition//
{
	int key,i;
	printf("\nenter srno whose details are to be displayed");
	scanf("%d",&key);
	for(i=0;i<5;i++)    //searching of srno.//
	{
		if(key==a[i].srno)
		{
		printf("%d\t%s\t%d\t%f\n",a[i].srno,a[i].resistor_name,a[i].value,a[i].tolerance);	//printing values corresponding to given srno.//
		}
	}
}
	
	}
void with_pointers_to_structures()
	{
		struct resistance									
{
	int srno;
	int value;
	char resistor_name[20];
	float tolerance;
}*ptr;



int main()
{ 

	int enter,n,i;
	int ans;
	void create_p(struct  resistance *,int);							//function declarations
void display_p(struct  resistance*,int);
void search_p(struct   resistance*,int);
void sort_p(struct   resistance*,int);
void append_p(struct   resistance*,int);
void del_p(struct   resistance*,int);
void modify_p(struct   resistance*,int);
	printf("enter no. of resistors");
	scanf("%d",&n);
	
	ptr=(struct  resistance*)malloc(n*sizeof(struct  resistance));
	
	create_p(ptr,n);
	printf("\nSrNo.	|Resistor_name	|\tValue	|\tTolerance	|\t");
	display_p(ptr,n);

do{
	printf("\nenter\n 1 for searching\n 2 for sorting\n 3 for Appending\n 4 for deleting\n 5 for modifying\n 6 for displaying the final list\n 7 for exit\n");
	scanf("%d",&enter);
	
	switch(enter)											//menu
	{
		case 1: search_p(ptr,n);
				break;
		case 2: sort_p(ptr,n);
				break;
		case 3: append_p(ptr,n);
				n++;
				break;
		case 4: del_p(ptr,n);
				n--;
				break;
		case 5: modify_p(ptr,n);
				break;
		case 6: display_p(ptr,n+1);
				break;

		case 7: exit(0);
		
		default: printf("enter valid choice");
	}

printf("\nenter 1 to continue\n");
scanf("%d",&ans);
}
while(ans==1);


	
}

void create_p(struct  resistance*ptr,int n)
{
	int i;
	printf("enter SR NO., Resistor name, Value, Tolerance\n");
	for( i=0;i<n;i++)
	{
		printf("enter info for resistor %d\n",i+1);
		printf("enter SR No.\n");
		scanf("%d",&(ptr+i)->srno);
			printf("enter Name\n");
		scanf("%s",&(ptr+i)->resistor_name);
		printf("enter Value\n");
		scanf("%d",&(ptr+i)->value);
	
		printf("enter Tolerance\n");
		scanf("%f",&(ptr+i)->tolerance);
		printf("\n----------------------\n");
	}
	
}

void display_p(struct resistance *ptr,int n)						//display function
{
	int i;
	for(i=0;i<n;i++)
	
	{
		printf("\n%d	|\t%s	|\t%d	|\t%f	|\t",(ptr+i)->srno,(ptr+i)->resistor_name,(ptr+i)->value,(ptr+i)->tolerance);
	}
}

void search_p(struct resistance*ptr, int n)						//linearSearching function
{
	int srno1,i;
	printf("\nenter the srno you want to search:");
	scanf("%d",&srno1);
	for(i=0;i<n;i++)
	{
		if((ptr+i)->srno==srno1)
		{
		int pos=i+1;
		printf("\n%d	|\t%s	|\t%d	|\t%f	|\t",(ptr+i)->srno,(ptr+i)->resistor_name,(ptr+i)->value,(ptr+i)->tolerance);
		}
	}
}


void sort_p(struct resistance*ptr,int n)							//bubbleSort
{
	int i,j;
	struct resistance temp;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{	
			if((ptr+j)->tolerance<(ptr+j+1)->tolerance)
			{
				temp=*(ptr+j);
				*(ptr+j)=*(ptr+j+1);
				*(ptr+j+1)=temp;
			}
		}
	}
	
	display_p(ptr,n);
}

void append_p(struct resistance*ptr,int n)								//append function
{
	int i;

	printf("enter next elements");
	for(i=n;i<n+1;i++)
	{
		scanf("%d%s%d%f",&(ptr+i)->srno,&(ptr+i)->resistor_name,&(ptr+i)->value,&(ptr+i)->tolerance);
	}
	display_p(ptr,n+1);
	
}

void del_p(struct resistance *ptr,int n)								//delete function								
{
	int i,k;
	printf("\nenter the SR NO. which you want to delete\n");
	scanf("%d",&k);
	for(i=k-1;i<=n-1;i++)
	{
		*(ptr+i)=*(ptr+i+1);
	}
	display_p(ptr,n-1);
}

void modify_p(struct resistance *ptr,int n)									//modify function
{
	int srno1,key,value1,i;
	float tolerance1;
	printf("enter the serial no which you want to modify\n");
	scanf("%d",&srno1);
	for(i=0;i<n;i++)
	{
		if((ptr+i)->srno==srno1)
		{
			printf("\nwhat do you want to modify?\n 1. Value\n 2. Tolerance\n");
			scanf("%d",&key);
			switch(key)
			{
				case 1: if((ptr+i)->value==value1)
						{
							printf("enter new value");
							scanf("%d",&(ptr+i)->value);
						}
						
				case 2: if((ptr+i)->tolerance==tolerance1)
						{
							printf("enter new tolerance");
							scanf("%f",&(ptr+i)->value);
						}
			}
			
	}
	

	display_p(ptr,n);
	}
}


	}
	

