//ashlesh khajbage 1632
#include<stdio.h>
union tag
{
   int purchase_cost;
   char donor_name[20];
};
struct lib
{
  int acc_no;
  char title[20];
  int edition;
  char author[20];
  union tag u;
};
int main()
{
   struct lib l[5];
   int i, n, t, count =0 ;
   printf("\nEnter the no of books you want to enter:");
   scanf("%d",&n);
   printf("\nEnter the books details..");
   for(i=0;i<n;i++)
   {
	   printf("\nEnter the details account number:");
       scanf("%d",&l[i].acc_no);
	   printf("\nEnter the title:");
       scanf("%s",l[i].title);
	   printf("\nEnter the edition:");
       scanf("%d",&l[i].edition);
	   printf("\nEnter the author name:");
       scanf("%s",l[i].author);
   }
   for(i=0;i<n;i++)
   {
      printf("\n%d\t%s\t%d\t%s\n",l[i].acc_no,l[i].title,l[i].edition,l[i].author);
   }
   for(i=0;i<n;i++)
   {
      printf("\nEnter the tag value for purchase cost and 0 for donated books:");
      scanf("%d",&t);
	  if(t==1)
	  {
		  printf("\nEnter the purchase cost:");
	    scanf("%d",&l[i].u.purchase_cost);
		printf("\nPURCHASED BOOK:%d\t%d\t%s\n",l[i].u.purchase_cost,l[i].acc_no,l[i].title);
		count++;
	  }
	  else
	  {   
		  printf("\nEnter the donor name:");
	     scanf("%s",l[i].u.donor_name);
		printf("\nDONATED BOOK:%d\t%d\t%s\n",l[i].u.donor_name,l[i].acc_no,l[i].title);
	  }
   }
   return 0;
}