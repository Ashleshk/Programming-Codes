/*#include<stdio.h>
int main()
{
   int m,i,roll_no[100];
   char c[100],b[100];
   printf("Enter the no of students in class");
   scanf("%d",&m);
   for(i=0;i<m;i++)
    {
        printf("Enter the roll no of student\n");
        scanf("%d",&roll_no[i]);
        printf("entered the roll no plays cricket?(y/n)\n"); 
        scanf("%s",&c[i]);
        printf("entered the roll no plays badminton?(y/n)\n"); 
        scanf("%s",&b[i]);
  }

   printf("roll no of the students play either badminton or cricket or both\n");
  printf("{");
  for(i=0;i<m;i++)
     { 
      if(c[i]=='y' || b[i]=='y')
        {
          printf("%d\t",roll_no[i]);
        }
     }
  printf("}");

  printf("roll no of student plays both cricket as well as badminton\n");
   printf("{");
   for(i=0;i<m;i++)
     { 
      if(c[i]=='y' && b[i]=='y')
        {
          printf("%d\t",roll_no[i]);
        }
     }
  printf("}");
  printf("roll no plays only cricket\n");
 printf("{");
 for(i=0;i<m;i++)
     { 
      if(c[i]=='y' && b[i]=='n')
        {
          printf("%d\t",roll_no[i]);
        }
     }
    printf("}");
  printf("roll no plays only badminton\n");
 printf("{");
 for(i=0;i<m;i++)
     { 
      if(c[i]=='n' && b[i]=='y')
        {
          printf("%d\t",roll_no[i]);
        }
     }
  printf("}");
 printf("roll no of student plays neither cricket nor badminton\n");
  printf("{"); 
 for(i=0;i<m;i++)
     { 
      if(c[i]=='n' && b[i]=='n')
        {
          printf("%d\t",roll_no[i]);
        }
     }
  printf("}");
 return 0;
 
}
*/
