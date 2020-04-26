//ASHLESH KHAJBAGE  1632 
// INVENTORY SYSTEM
#include<stdio.h>
int main()
{ 
   struct date 
   {
     int day;
	 int month;
	 int year;
   };
   struct details
   {
     int itmnum;
	 char itmname[20];
	 char itmcat[20];
	 int price;
	 int quantity;
	 struct date mfg;
   };
   struct details item[50];
   int i,n ;
   printf("\nEnter number of items to be enter:");
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
      printf("\nenter item number:");
	  scanf("%d",&item[i].itmnum);
	  printf("\nenter item name:");
	  scanf("%s",item[i].itmname);
	  printf("\nenter item category(elcetronics,food,cosmetics):");
	  scanf("%s",item[i].itmcat);
	  printf("\nenter quantity:");
	  scanf("%d",&item[i].quantity);
	  printf("\nenter price:");
	  scanf("%d",&item[i].price);
	  printf("\nmanufacturing date:(dd-mm-yyyy):");
	  scanf("%d-%d-%d",&item[i].mfg.day,&item[i].mfg.month,&item[i].mfg.year);
   }
   fflush(stdin);
   printf("\n!!!!!!********  INVENTORY  *********!!!!!!!");
   printf("\n----------------------------------------------");
   printf("\nSR.NO\tITM. NUM\tITM NAME\tITM CAT\tQUANTITY\tPRICE\tMFG.DATE\n");
   printf("\n----------------------------------------------");
   for(i=0;i<n;i++)
   {
   printf("%d\t%d\t%s\t%s\t%d\t%d\t%d/%d/%d\n",i+1,item[i].itmnum,item[i].itmname,item[i].itmcat,item[i].quantity,item[i].price,item[i].mfg.day,item[i].mfg.month,item[i].mfg.year);
   printf("\n----------------------------------------------");
   }
 return 0;
}