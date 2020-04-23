#include<stdio.h>
#include<ctype.h>

struct bank
{
 int accno;
 char name[20];
 int balance;
 int internetfacility;
 int pin;
 int acctype;
};

int main()
{
 struct bank b[50];
 int i,n,count=0;

 printf("Enter the number of customer accounts:");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
  printf("Enter the account number:");
 scanf("%d",&b[i].accno);
 printf("Enter account holder name:");
 scanf("%s",b[i].name);
 printf("Enter about internet facility avail(0 for not available/1 for available):");
 scanf("%d",&b[i].internetfacility);
 scanf("%d",&b[i].balance);
  printf("Enter area pincode:");
 scanf("%d",&b[i].pin);
  printf("Enter account type(2 for saving/3 for recurring/4 for deposit):");
 scanf("%d",&b[i].acctype);
}
printf("Welcome!!");
for(i=0;i<n;i++)
{
  printf("%d\t%s\t%d\t%d\t%d\t%d\n",b[i].accno,b[i].name,b[i].balance,b[i].internetfacility,b[i].pin,b[i].acctype);
}
printf("List of Golden,Silver,General:");
for(i=0;i<n;i++)
{
  if(b[i].balance>=1000000)
  {
      printf("The customer is Golden customer\n");
  }
  else
  {
     if(b[i].balance<=1000000&& b[i].balance>=500000)
     printf("The customer is Silver customer\n");
     else
     printf("The customer is General customer\n");
  }
}
   printf("List of customer who have internet banking facility\n");
 for(i=0;i<n;i++)
 {
   if(b[i].internetfacility==1)
   {
     printf("%d\t%s\t%d\t%d\t%d\t%d\n",b[i].accno,b[i].name,b[i].balance,b[i].internetfacility,b[i].pin,b[i].acctype);
     count++;
   }
 }
 printf("List of customer according to account type\n");
 for(i=0;i<n;i++)
 {
   if(b[i].acctype==2)
    printf("Saving account:%s\t%d\t",b[i].name,b[i].accno);
   else if(b[i].acctype==3)
    printf("Recurring account:%s\t%d\t",b[i].name,b[i].accno);
   else
    printf("Deposit account:%s\t%d\t",b[i].name,b[i].accno);
   printf("\n");
 }
 printf("Sort bank accounts according to pin code");

   for(i=0;i<n;i++)
   {
     printf("%d\t%s\t%d\t\n",b[i].accno,b[i].name,b[i].pin);
   }
 return 0;
}
