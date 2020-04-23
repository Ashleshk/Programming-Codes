#include<stdio.h>
#include<string.h>
void main()
{
	  char a[30], b[30],c[30],bt;
	  int ch=0;
	  do
	  {
         printf("\nEnter the string 1:");
	     gets(a);
	     printf("\nEnter the string 2:");
         gets(b);
	     printf("\nMENU FOR STRING\n1.CONCATE\n2.COPY\n3.COMPARE\n4.EXIT");
	     printf("\nenter your choice:");
	     scanf("%d",&ch);
	     switch(ch)
	     {
	           case 1: strcat(a,b);
				       printf("\nthe concated string is::%s\n",a);
					   break;
			   case 2: strcpy(a,b);
				       printf("\n\nThe new string after copy is:%s\n\n",a);break;
			   case 3: 
				       if((strcmp(a,b))==0)
					   {
					      printf("\n\nThe strings are equal....\n");
					   }
					   else
					   {
					      printf("THE string are not equal....\n\n");
					   }
					   break;
			   case 4: break;

 	     }
	     printf("doyou want to continue..");
	     scanf("%c",&bt);
		 scanf("%c",&bt);


	  }while(bt =='y'||bt == 'Y');

}