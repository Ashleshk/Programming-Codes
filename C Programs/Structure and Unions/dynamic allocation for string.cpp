#include<stdio.h>
#include<string.h>
#include<stdlib.h>
char* accept(char *pname)
{
   char temp[20];
   gets(temp);
   pname=(char*)malloc(strlen(temp)+1);
   strcpy(pname,temp);
   return pname;
}
int main()
{
    char *p=NULL;
	p=accept(p);
	puts(p);

}