/*
  Roll no: 2968
  Batch: SE H9
*/

#include<stdio.h>
#include<string.h>                                                  //header file inclustion

struct employee
{
	int id;
	char name[10];
	long int mobno;
	float salary;
};

void input(int );                                                 //prototype of function
void display();
int search(int *,int );
void modify(int );
void del(int );

void input(int ch)                                                   
{                                                                    //input function defination
	FILE *fp;
	struct employee e;
	int n,i=0,j=1;
	char c;
	if(ch==1)
	{
		fp=fopen("data.dat","wb");
		printf("enter how many records you want to enter:");
		scanf("%d",&n);
		while(!feof(fp) && i!=n)
		{
			printf("enter employee %d id:",j);
			scanf("%d",&e.id);
		        c=getchar();
                        printf("enter employee %d name:",j);
                        scanf("%[^\n]s",e.name);
			printf("enter employee %d mobile no:",j);
			scanf("%li",&e.mobno);
			printf("enter employee %d salary:",j);
			scanf("%f",&e.salary);
			i++;
			j++;
			fwrite(&e,sizeof(e),1,fp);
		}

	}
	else if(ch==2)
	{
		fp=fopen("data.dat","ab");
		printf("enter how many records you want to add at the end:");
		scanf("%d",&n);
		while(!feof(fp) && i!=n)
		{
			printf("enter employee %d id:",j);
			scanf("%d",&e.id);
			c=getchar();
            printf("enter employee %d name:",j);
            scanf("%[^\n]s",e.name);
			printf("enter employee %d mobile no:",j);
			scanf("%li",&e.mobno);
			printf("enter employee %d salary:",j);
			scanf("%f",&e.salary);
			i++;
			j++;
			fwrite(&e,sizeof(e),1,fp);
		}
	}
fclose(fp);	   
}

void display()         
{                  																	 //display function defination
	struct employee e;
    char c;
    FILE *fp;
    fp=fopen("data.dat","rb");
    while(fread(&e,sizeof(e),1,fp)==1)
    {
           
           printf("%d %s %li %f",e.id,e.name,e.mobno,e.salary);
    }
    printf("\n");
    fclose(fp);
}

int search(int *m,int id)
{                                                                                     //search function defination
	FILE *fp;
	int flag=0,i=0;
	struct employee e;
	fp=fopen("data.dat","rb");
	while(!feof(fp))
	{
		fread(&e,sizeof(e),1,fp);
		if(id==e.id)
		{
			*m=i;
			flag=1;
			break;
		}
		i++;
	}
	return flag;
	fclose(fp);
}

void modify(int m)
{                                                                                    //modify function defination
	FILE *fp;
	int ch;
	struct employee e;
	char c;
	fp=fopen("data.dat","rb+");
        fseek(fp, m*sizeof(e), SEEK_CUR);
    do
    {
    	printf("1-id\n2-name\n3-mobile number\n4-salary\n5-exit");
    	printf("\nenter choice:");
    	scanf("%d",&ch);
    	switch(ch)
    	{
    		case 0:
    		       break;
    		case 1:
    		       printf("enter new id:");
    		       scanf("%d",&e.id);
    		       fwrite(&e,m*sizeof(e.id),1,fp);
    		       break;
    		case 2:
    		       c=getchar();
                       printf("enter new name:");
                       scanf("%[^\n]s",e.name);
    		       fwrite(&e,m*sizeof(e.name),1,fp);
    		       break;
    		case 3:
    		       printf("enter new mobile number:");
    		       scanf("%li",&e.mobno);
    		      fwrite(&e,m*sizeof(e.mobno),1,fp);
    		       break;   
    		case 4:
    		       printf("enter new salary:");
    		       scanf("%f",&e.salary);
    		       fwrite(&e,m*sizeof(e.salary),1,fp);
    		       break;                               
    	}
    }while(ch!=5);
    
fclose(fp);
}

void del(int id)
{                          															 //delete function defination
    FILE *fp,*fd;
    int i=0;
    char c,p;
    fp=fopen("data.dat","rb+");
    fd=fopen("dummy.dat","wb");
    while(!feof(fp))
    {
    	if(id!=e.id)
         {
               fread(&e,sizeof(e),1,fp);
               fwrite(&e,sizeof(e),1,fd);
         }
    }
    fclose(fp);
    fclose(fd);
    remove("data.dat");
    rename("dummy.dat","data.dat");

}

int main()
{
	int ch,flag,id,m;
	do
	{
		printf("\n1-create\n2-display\n3-add\n4-search\n5-modify\n6-delete\n7-exit");
		printf("\nenter choice:");												//menus
		scanf("%d",&ch);
		switch(ch)
		{
			case 0:
			       break;
			case 1:
			       input(1);
			       break;  
			case 2:
				   printf("id\tname\tmobile no\tsalary\n");
			       display();
			       printf("\n");
			       break;
			case 3:
			       input(2);
				   break;
			case 4:
				printf("enter id of employee you want to search the record:");
                                scanf("%d",&id);
			       flag=search(&m,id);
			       if(flag==1)
			       {
			       	printf("record found at location %d",m+1);
				   }
				   else
				   printf("record not found");
				   break;
			case 5:
				   printf("enter id of employee you want to modify the record:");
                                    scanf("%d",&id);
				   flag=search(&m,id);
				   if(flag==1)
				   {
				   	modify(m);
				   }
				   else
				   {
				   	printf("enter a valid id");
				   }
				   break;
			case 6:
			         printf("enter id of employee you want to delete the record:");
                                   scanf("%d",&id);
				   flag=search(&m,id);
				   if(flag==1)
				   {
				   	del(id);
				   }
				   else
				   {
				   	printf("enter a valid id");
				   }
				   break;	   
		}
	}while(ch!=7);
 

}
