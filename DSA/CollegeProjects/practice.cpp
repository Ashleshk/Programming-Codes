#include<stdio.h>

struct student
{
	char name[10];
	int roll;
	int percent;
};

struct student s[5];
struct student *p;


void create(int n)
{
	int i;
	for(i=0;i<n;i++)
	{
	printf("\n\nEnter the Name/Roll Number/Percentage of #%d student\n",i+1);
	scanf("%s \t %d \t %d",&(p+i)->name,&(p+i)->roll,&(p+i)->percent);  //s[i].name,&s[i].roll,&s[i].percent
	}
}

void display(int n)
{
	int i;
	printf("INDEX \t\t\t NAME \t\t\t ROLL \t\t\t PERCENT\n");
	for(i=0;i<n;i++)
	{
		printf("%d \t\t\t %s \t\t\t %d \t\t\t %d \n",i,(p+i)->name,(p+i)->roll,(p+i)->percent); //s[i].name,s[i].roll,s[i].percent
	}
}

void modify(int n)
{
	int rno,i,sw;
	
	printf("Enter the Roll Number of the student whose Data you want to modify \n");
	scanf("%d",&rno);
	
	for(i=0;i<n;i++)
	{
	if(s[i].roll==rno)
		{
			printf("The student record was found at Index #%d",i);
			break;
		}
	if(i==n)
		printf("Record Not Found");
	}	
	
	printf("Enter the Field which you want to change\n Enter 1 to change Name\n Enter 2 to change Roll Number\n Enter 3 to change Percentage\n");
	scanf("%d",&sw);
	switch(sw)
		{
		case 1:
			printf("Enter the new name\n");
			scanf("%s",&(p+i)->name); //s[i].name
			printf("The name has been updated\n");
			break;
		
		case 2:
			printf("Enter the new Roll Number\n");
			scanf("%d",&(p+i)->roll); //s[i].roll
			printf("The Roll Number has been updated\n");
			break;
			
		case 3:
			printf("Enter the new Percentage\n");
			scanf("%f",&(p+i)->percent); //s[i].percent
			printf("The Percentage has been updated\n");
			break;
			
		case 4: //TO EXIT THE MENU
			break;
			
		default:
			printf("Enter a Valid Number\n");
		}
}

void append(int n)
{
	if(n>=5)
	{
	printf("No memory available to add new record\n");
	return ;
	}
	else
	{
	printf("Enter the data of student NAME/ROLL NUMBER/PERCENTAGE\n");
	scanf("%s %d %f\n",*(p+n)->name,&(p+n)->roll,&(p+n)->percent); //s[n].name,s[n].roll,s[n].percent
	p++; //n=n+1
	}
}

void search(int n)
{
	int i,rno;
	printf("Enter the Roll Number \n");
	scanf("%d",&rno);
	
	for(i=0;i<n;i++)
	{
		if((p+i)->roll == rno) //s[i].roll
		{
			printf("The student with Roll Number %d is present at record %d \n",rno,i);
			break;
		}
	}	
}

void sort(int n)
{
int i,j,k;
struct student temp;
for(i=0;i<=(n-1);i++)
{
	for(j=0;j<=(n-i-1);j++)
	{
	if((p+i)->percent>(p+i+1)->percent)//Define the temp variable of Structure type s[j].percent>s[j+1].percent
	temp=*(p+j);//Interchange s[j] and s[j+1] /////////////////////  s[j]
	*(p+j)=*(p+j+1);
	*(p+j)=temp;
	//j++;
	}
}

}

int main()
{
	p=s;
	int n;
	int sw;
	printf("Enter the size of the Database\n");
	scanf("%d",&n);
	
	do //TO REPEAT THE MENU
	{
	
	printf("\n Enter 1 to Create Database \n Enter 2 to Display Database \n Enter 3 to Modify Database \n Enter 4 to append record\n Enter 5 to search a record \n Enter 6 to Sort the Database\n Enter 7 to Quit the System\n\n");
	scanf("%d",&sw);
	
	switch(sw)
	{
		case 1:
			create(n);
			break;
		case 2:
			display(n);
			break;
		case 3:
			modify(n);
			break;
		case 4:
			append(n);
			break;
		case 5:
			search(n);
			break;
		case 6:
			sort(n);
			break;
		case 7:
			break;
		default:
			printf("Enter a Valid Number\n");
	}
	
	}
	while(sw!=7);
	return 0;
}

