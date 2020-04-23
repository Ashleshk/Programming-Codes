#include<stdio.h>

struct item
{
  int itemno,available;
  char itemname[50],itemcat[50];
};
int main()
{
  int i,n;
  struct item s[100];
  printf("Enter the number of items:");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("Enter the item name,item number,item category(FOOD/ELECTRONICS/COSMETICS) and availability in stock(0 if not available/1 if available):\n");
    scanf("%s%d%s%d",s[i].itemname,&s[i].itemno,s[i].itemcat,&s[i].available);
  }

   for(i=0;i<n;i++)
   {
     if(s[i].available==0)
     {
       printf("Out of stock please try something else\n");
     }
     else
     {
       printf("item name:%s\titem number:%d\titem category:%s\navailability:IN STOCK\n",s[i].itemname,s[i].itemno,s[i].itemcat);
     }
   }
   return 0;
}
