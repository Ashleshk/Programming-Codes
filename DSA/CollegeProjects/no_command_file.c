#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct Student
{
  int rno;
  char Name[20];
  char class[5];
  float sgpa;
};
FILE *fp;
void insert();
void search();
void del();
void modify();
void display(int);
int advsee();
int main()
{
  int choice,ans;
  FILE *fp;
    if(fp!=NULL) 
       {
         printf("\nFile is ready to use");
         do{
            printf("\nMENU\n1.INSERT\n2.SEARCH\n3.DELETE\n4.MODIFY\n5.DISPLAY\nCHOOSE :");
            scanf("%d",&choice);
            switch(choice)
            {
             case 1:insert();
                    display(0);
                    break;
             case 2:ans=advsee();
                    display(ans);
                    break;
             case 3:del();
                    display(0);
                    break;
             case 4:modify();break;
             case 5: 
                     display(0);break;
            }
          }while(choice!=6);
       }
    printf("\n");
    return 0;
}
void insert()
{
  struct Student st;
  //fseek(fp,0,2);
  fp=fopen("Main.txt","a+");
  printf("\nRoll No :");
  scanf("%d",&st.rno);
  printf("\nName :");
  scanf("%s",st.Name);
  printf("\nClass :");
  scanf("%s",st.class);
  printf("\nSGPA :");
  scanf("%f",&st.sgpa);
  fprintf(fp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);
  fclose(fp);

}
void display(int offset)
{
 struct Student st;
 fp=fopen("Main.txt","r");
 fseek(fp,offset,0);
 printf("\n--------------------------------");
 printf("\nROll No\tNAME\tCLASS\tSGPA");
 printf("\n--------------------------------\n");
 while(!feof(fp))
 {
  fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
  printf("%d\t%s\t%s\t%2.2f\n",st.rno,st.Name,st.class,st.sgpa);
 }
}
void search()
{
  struct Student st;
  int r,i;
  rewind(fp);
  printf("\nEnter roll no to be searched :");
  scanf("%d",&r);
  while(!feof(fp))
  {
    fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
    if(st.rno==r)
     {
      printf("\nRecord found\n");
      printf("%d\n%s\n%s\n%2.2f\n",st.rno,st.Name,st.class,st.sgpa);
    }
    else {printf("\nRecord Not Found");}
  }
    return;
 } 
void del()
{
  struct Student st;
  FILE *tmp;
  int recno,i;
  printf("\nEnter Record no to Delete :");
  scanf("%d",&recno);
  tmp=fopen("temp.txt","w+");
  rewind(fp);
  for(i=1;i<recno && !feof(fp);i++)
   {
       fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
       fprintf(tmp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);
   }
  if(feof(fp))
   printf("\n record no out of range");
  else
    {
       fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
       while(!feof(fp))
       {
         fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
         fprintf(tmp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);             
       }
     fclose(fp);
     fclose(tmp);
     fp=fopen("Main.txt","w+");
     tmp=fopen("temp.txt","r+");
     while(!feof(tmp))
       {
         fscanf(tmp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
         fprintf(fp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);             
       }
       fclose(tmp);
    }
}
void modify()
{
  struct Student st;
  FILE *tmp;
  int recno,i;
  printf("\nEnter Record no to Modify :");
  scanf("%d",&recno);
  tmp=fopen("temp.txt","w+");
  rewind(fp);
  for(i=1;i<recno && !feof(fp);i++)
   {
       fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
       fprintf(tmp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);
   }
  if(feof(fp))
   printf("\n record no out of range");
  else
    {
       fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
       printf("\nRoll No :");
       scanf("%d",&st.rno);
       printf("\nName :");
       scanf("%s",st.Name);
       printf("\nClass :");
       scanf("%s",st.class);
       printf("\nSGPA :");
       scanf("%f",&st.sgpa);
       fprintf(tmp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);
     
       while(!feof(fp))
       {
         fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
         fprintf(tmp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);             
       }
     fclose(fp);
     fclose(tmp);
     fp=fopen("Main.txt","w+");
     tmp=fopen("temp.txt","r+");
     while(!feof(tmp))
       {
         fscanf(tmp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
         fprintf(fp,"%d\n%s\n%s\n%f\n",st.rno,st.Name,st.class,st.sgpa);             
       }
       fclose(tmp);
     }
}
int advsee()
{
  struct Student st;
  int r,i,pos;
  rewind(fp);
  printf("\nEnter roll no to be searched :");
  scanf("%d",&r);
  while(!feof(fp))
  {
    fscanf(fp,"%d%s%s%f\n",&st.rno,st.Name,st.class,&st.sgpa);
    if(st.rno==r)
     {
      printf("\nRecord found\n");
      pos=ftell(fp)+(-1*sizeof(st));
      return pos;
     // printf("%d\n%s\n%s\n%2.2f\n",st.rno,st.Name,st.class,st.sgpa);
    }
    else {printf("\nRecord Not Found");}
  }
    return -1;
 } 
/*
linkfloat()
{
  float a=0,*b;
  b=&a;
  a=*b;
}
*/
