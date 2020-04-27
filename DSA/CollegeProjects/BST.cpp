/********* **************ASHLESH KHAJABGE,ROLLNO-2508*********************************/
/*PROBLEM STATEMENT:
 BINARY SEARCH TREE:  write a program in c to implement binary search tree with operations
 like create,search,recursive traversal etc.
******************************************************************************/
#include<stdio.h>                             //HEADER FILES 
#include<conio.h>
#include<stdlib.h>
typedef struct tree                              //TREE STRUCT
{
	int data;
	
	struct tree *left,*right;

}tree;
/******************* FINDMAX--IN-TREE **********************************/ 
tree *findMAX(tree *T){
	while(T->right!=NULL)
	{
		T=T->right;
    }
	return(T);
}
/******************* FINDMIN--IN-TREE **********************************/
tree *findMIN(tree *T)
{
	while(T->left!=NULL)
	{
		T=T->left;
    }
	return(T);
}
/******************* TRAVERSAL-IN-TREE **********************************/
void traversal(tree *T){
     if(T!=NULL)
	 {   if(T->left!=NULL)
	       traversal(T->left);
		 printf("(%d)-->",T->data);
		if(T->right!=NULL)
          traversal(T->right); 
		
	 }
	 
}
/******************* PRINT-THE-TREE **********************************/
void tabs(char ch, int n)
{
   int i;
   for(i=0;i<n;i++)
	   printf("%c",ch);
}
void print(tree *T  ,int level)
{
	int  i;
	
	if(T==NULL)
	{
	   tabs(' ',level);
	}
	else
	{
		print(T->right,level+1);
		tabs(' ',level);
		tabs(' ',level);
		tabs(' ',level);
		tabs(' ',level);
		tabs(' ',level);
		tabs(' ',level);
		tabs(' ',level);
		printf("%d\n\n",T->data);
		print(T->left,level+1);
	}

}
/******************* FIND-IN-TREE **********************************/
tree *find(tree *T,int no){

	if(T==NULL)
		return(NULL);
	else if(T->data==no)
		return(T);
	else if(T->data>no)
		{return(find(T->left,no));}
	else
	{ return(find(T->right,no));}
	
}
/******************* INSERT-IN-TREE **********************************/
tree *insert(tree *T,int val)
{  
	if(T == NULL)
	{
	   T=(struct tree*)malloc(sizeof(struct tree));
	   T->data=val;
	   T->left=NULL;
	   T->right=NULL;
	   return(T);
	}
	else if(T->data<val)
	{   
		T->right=insert(T->right,val);
		
	    return(T) ;	
	}
	else
		T->left=insert(T->left,val);
	
	
	return(T);

} 
/******************* DELETE-IN-TREE **********************************/
tree *Delete(tree *T,int n)
{
  tree *p;
  if(T==NULL)
	{  printf("TREE ELEMENT NOT FOUND");
       return(T);
    }
  if(T->data>n)
  {
	  T->left=Delete(T->left,n);
	  return(T);
  }
  if(T->data<n)
  {
	  T->right=Delete(T->right,n);
	  return(T);
  }
  if(T->left==NULL && T->right==NULL)   //leaf node
  {
     p=T;
	 free(p);
	 return(NULL);
  }
  if(T->left==NULL)   //1 child
  {
     p=T;
	 T=T->right;
	 free(p);
	 return(T);
  }
  if(T->right==NULL)    //1 child
  {
     p=T;
	 T=T->left;
	 free(p);
	 return(T);
  }
  p=findMIN(T->right);    //2 child
  T->data=p->data;
  T->right=Delete(T->right,p->data) ;
  return(T);
}
/******************* CREATE-THE-TREE-(1-TIME-CALL) **********************************/
tree *create()
{
   
	int n,x,i;
	tree *ROOT;
	ROOT=NULL;
	printf("\nENTER THE NUMBER OF NODES:");
	scanf("%d",&n);
	printf("ENTER TREE VALUES(1st will be root):\n");
	for(i=0;i<n;i++)
	{   scanf("%d",&x);
		ROOT=insert(ROOT,x);
	}
	return(ROOT);
}
/******************* THE-MAIN-FUNCTION **********************************/
void main()
{    int ch,no;
      tree *root,*t;
    do
	{
		printf("\n\t+---------------------------------------+");
     printf("\n\t*\tMENU:\t\t\t\t*\
			\n\t*\t1.CREATE\t\t\t*\
			\n\t*\t2.DISPLAY \t\t\t*\
			\n\t*\t3.FIND\t\t\t\t*\
			\n\t*\t4.FIND_MIN\t\t\t*\
			\n\t*\t5.FInd_MAX\t\t\t*\
			\n\t*\t6.INSERT\t\t\t*\
			\n\t*\t7.DELETE\t\t\t*\
			\n\t*\t8.TRAVERSAL\t\t\t*\
			\n\t*\t0.EXIT\t\t\t\t*\
			\n\t*\tchoose your option:");
	 scanf("%d",&ch);
	 printf("\t+---------------------------------------+\n");
	switch(ch)
	{
	case 1: root=create();
		    break;
	case 2:printf("\n\nTHE BINARY TREE IS PRINTED AT 90 DEGREE ROTATION\n\n\n\n");
		print(root,0);
		break;
	case 3: printf("\nTHE NODE  YOU WANT TO FIND ");
		scanf("%d",&no);
		t=find(root,no);
		printf("\nTHE NODE %d WAS FOUND  ",t->data);
		break;
	case 4: t=findMIN(root);
		printf("\nTHE SMALLEST NODE IN THE TREE IS %d",t->data);
		break;
	case 5:t=findMAX(root);
		printf("\nTHE LARGEST NODE IN THE TREE IS %d",t->data);
		break;
	case 6: printf("\nENTER NEW NODE YOU WANT TO ENTER IN A TREE :");
		scanf("%d",&no);
		root=insert(root,no);
		printf("\nTHE TREE AFTER INSERT");
		printf("\n\nTHE BINARY TREE IS PRINTED AT 90 DEGREE ROTATION\n\n\n\n");
		print(root,0);
		break;
	case 7:printf("\nENTER NEW NODE YOU WANT TO DELETE FROM A TREE :");
		scanf("%d",&no);
		root=Delete(root,no);
		printf("\nTHE TREE AFTER DELETE");
		printf("\n\nTHE BINARY TREE IS PRINTED AT 90 DEGREE ROTATION\n\n\n\n");
		print(root,0);
		break;
	case 8: traversal(root);                           // implementing inorder traversal only
	    printf("END");    
		break;
	}
	}while(ch !=0);
	getch();
}