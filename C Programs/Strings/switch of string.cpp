#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	char a[20],b[20];
	int i,j,ch,k;
	int z;
	char v;
	printf("Enter String 1:\n");
	flushall();
	gets(a);

	printf("Enter String 2:\n");
	flushall();
	gets(b);

	 do
  {
  printf("1.strlength\n2.string compare\n3.string caoncate\n4.string copy\n5.string upper\n6.string lower\n7.exit");
  printf("\nchoose your choice:");
  scanf("%d",&ch);
  
   if(ch==1)
   {
     k=strlen(a);
	 printf("\n\nLEGTH OF THE ARRAY 1 IS:%d",k);
	 k=strlen(b);
	 printf("\n\nLEGTH OF THE ARRAY 2 IS:%d",k);
   }
   else if(ch==2)
   {
     z=strcmp(a,b);
	 if(z==1){printf("\nthe string are equal... :");}
	 else{ printf("not equal string");}
	 
  }
   else if(ch==3)
   {
     strcat(a,b);
	   printf("\nthe new array is:");
	  puts(a);
   }
   else if(ch==4)
   {
      strcpy(a,b);
	  printf("\nthe new array is:");
	  puts(a);
   }
   else if(ch==5)
   {
      strupr(a);
	  printf("\nthe new array is:");
	  puts(a);
	  strupr(b);
	  printf("\nthe new array is:");
	  puts(b);
   }
    else if(ch==6)
   {
      strlwr(a);
	  printf("\nthe new array is:");
	  puts(a);
	  strlwr(b);
	  printf("\nthe new array is:");
	  puts(b);
   }
 
	
   else
   {
    printf("GOODBYEE");
	exit(0);
   }
   
   printf("\n\ndo you want to conitnue..");
   scanf("%c",&v);
   scanf("%c",&v);
   
  }
  while(v=='y' && v!='n');
  return 0;

}