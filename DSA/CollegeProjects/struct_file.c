#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct stud
{
	int sr_no;
   int r_no;
   char name[30];
   float marks;
};

void create();
void display();
void add_record();
int  search_record(int *,int*);
 void modify(int,int*);
 void del(int);
 
int main(void)
{      int ch,no,l,flag=0,flag0=0,num,pos; int rno;
  	    
		do{ 
			printf("\n\tMENU:-\n");
  			printf("1-create new database \n2-display current database \n3-add data to exitsting database \n4-search data\n5-modify data\n6-delete\n6-exit");
			printf("\nenter your choice:-\n");
     			scanf("%d",&ch);
        		
		switch(ch)
            {
              		case 1:  create(); break;
		       
              		case 2:  display(); break;
							
              		case 3: 	add_record(); break;
			  
		      		case 4:		 printf("\nEnter the role number of student you wanna search\n");
	 								 scanf("%d",&rno);
									l=search_record(&flag,&rno);
				  					if(flag==100)
									{
										printf("\nRecord Found!!\n LOCATION: %d",l);flag=0;
									} 
									else 
									{
										printf("\n Record Not Found!!\n"); 
									} break;
		      		case 5: 			printf("\nenter the roll number of student whose record you want to modify\n");
										scanf("%d",&num);
										pos=search_record(&flag0,&num);
										if(flag0==100)
										{
												modify(pos,&num);
										}
										else
										{
										printf("\n Record Not Found!!\n"); 
										} break;
					case 6: 		  del(m);
					case 7:  		exit(0);
			
             }
		}while(ch!=6);
return 0;
}

void create()
   {  
	int n, i=0, j=1;
    	struct stud s;
	FILE *fp;

	printf("enter the no of students:");
  	scanf("%d",&n);
    printf("\n\nenter the details of students\n"); 
    
	fp=fopen("check.txt","w+");
  	if(fp==NULL)
	{ printf("\nerror while creating database file\n");exit(0);}
    
    		 // fprintf(fp,"\n-------------------------------------------------------------------------\n");
     		// fprintf(fp,"\nSR.NO\tROLL_NO\t\tNAME\t\tMARKS\n");
     
	  while(j!=n+1)
	  {
	  		s.sr_no=j;
	  		fprintf(fp,"%d\t",s.sr_no);
       		printf("\n Enter student roll_number:");
       		scanf("%d",&s.r_no);
      		 //fprintf(fp,"\n\t%d\t%d",j,s.r_no);

      		 printf("enter student name:");
       		getchar();
       		gets(s.name);
      		// fprintf(fp,"\t\t%s\t\t",s.name);

      		 printf("enter stud  marks:");
       		scanf("%f",&s.marks);
       		fprintf(fp,"%d\t\t%s\t\t%0.2f\n",s.r_no,s.name,s.marks);
       		j++;
	  }
      		// fprintf(fp,"-------------------------------------------------------------------------");
      
	   fclose(fp); 
   }

void display()
   {   	   	int i,j=1;   struct stud s;
	   	char c;
       		FILE *fp;    
	    	fp=fopen("check.txt","r");
        if(fp==NULL)
		{ printf("\nerror while reading darabase file\n");exit(0);}
    
		while(fscanf(fp,"%d%d%s%f",&s.sr_no,&s.r_no,s.name,&s.marks) != EOF)
    	 	{
				printf("%d\t%d\t%s\t%f",s.sr_no,s.r_no,s.name,s.marks); printf("\n");
			 //c=fgetc(fp); printf("%c",c);
        	}
        	fclose(fp);
   }

void add_record()
{   	
		int k=0;
     	FILE *fp; struct stud s;
	fp=fopen("check.txt","r+");
	if(fp==NULL)
	{ printf("\nerror while opening database file\n");exit(0);}
	
	while(fscanf(fp,"%d%d%s%f",&s.sr_no,&s.r_no,s.name,&s.marks) != EOF)
	{k=k+1;}
	//printf("\n\n\n%d\n\n\n",k);
     
  	//fp=fopen("check.txt","r");
    
	int j=1+k , n, i=1;
	printf("enter the no of students you wanna add:");
  	scanf("%d",&n); 
	
	
	while(i!=n+1)
	{			int check_rno, zenda=0;
	   	printf("\n Enter student roll_number:");
       	  	scanf("%d",&check_rno);
			
						//fp=fopen("check.txt","r");
								fseek( fp, 0, SEEK_SET );
						while(fscanf(fp,"%d%d%s%f",&s.sr_no,&s.r_no,s.name,&s.marks) != EOF)
									{
										if(s.r_no==check_rno)
										{printf("\n Number already exit in List \n"); zenda=1;break;}
									}
					if(zenda==1)
					{break;}
	      	 s.r_no=check_rno;
			printf("enter student name:");
	       	getchar();
	       	gets(s.name);

	       	printf("enter stud marks:");
	       	scanf("%f",&s.marks);
			s.sr_no=j;
		fprintf(fp,"%d\t%d\t\t%s\t\t%0.2f\n",s.sr_no,s.r_no,s.name,s.marks);
	       	i++;j++;
	}
	 //fprintf(fp,"-------------------------------------------------------------------------");
	fclose(fp);
}

int search_record(int *flag,int *rno)
{     int x;
      struct stud s;
	
	  FILE *fp;  
	   fp=fopen("check.txt","r");
	  if(fp==NULL)
	{ printf("\nerror while opening database file\n");exit(0);}
	
	  while( fscanf(fp,"%d%d%s%f",&s.sr_no,&s.r_no,s.name,&s.marks) != EOF  	/*fread(&s,sizeof(s),1,fp)==1*/)
	  {	  		//fscanf(fp,"%d%s%f",s.r_no,s.name,s.marks);
			 if(*rno==s.r_no)
			{
   			    *flag=100; x=s.sr_no;fclose(fp);
				return (x); 
			}
	  } fclose(fp);
	  }
	  
 void modify(int pos,int *num)
 { 		int new_rno,ch;
 		FILE *fp; struct stud s;
		fp=fopen("check.txt","r+");
		if(fp==NULL)
		{ printf("\nerror while opening database file\n");exit(0);}
		fseek(fp,pos*sizeof(s),SEEK_SET);
		fscanf(fp,"%d%d%s%f",&s.sr_no,&s.r_no,s.name,&s.marks);
		
		printf("what you wanna modify\n");
		scanf("%d",&ch);
			switch(ch)
			{
			case 1:
						printf("\nenter new roll number\n");
						scanf("%d",&s.r_no);
						fprintf(fp,"%d",s.r_no); fclose(fp);break;
			case 2: printf("\nenter new name\n");
						scanf("%s",s.name);
						fprintf(fp,"%s",s.name); fclose(fp);break;
			case 3: printf("\nenter new marks\n");
						scanf("%d",&s.marks);
						printf(fp,"%f",s.marks); fclose(fp);break;
			}			
 }
 
 void del(int m)
{                          															 //delete function defination
    FILE *fp,*fd;
    int i=0;
    char c,p;
    fp=fopen("data.txt","r+");
    fd=fopen("dummy.txt","w");
    for(i=0;!feof(fp);i++)
    {
    	if(i==m)
    	continue;
        c=getc(fp);
        putc(c,fd);
    }
    fclose(fp);
    fclose(fd);
	fp=fopen("data.txt","w");
    fd=fopen("dummy.txt","r");    
    while(!feof(fd))
    {
        c=getc(fd);
        putc(c,fp);
    }
    fclose(fp);
    fclose(fd);
}
