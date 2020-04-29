package assignment10;
import java.util.Scanner;

 public class Matrix {
	 public int r,c;
	  
     private int a[][],anew[][];
     private int b[][];
     private int res[][];
     
     Scanner scan= new Scanner(System.in);
	public void read()
   {
	   System.out.println("enter the rows and columns for matrix 1 :");
	   r=scan.nextInt();
	   c=scan.nextInt();
	   a=new int[r][c];
	   System.out.println("enter the elements :");
	   for(int i=0 ;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
			   	a[i][j]=scan.nextInt();
	   }
	   System.out.println("enter the rows and columns for matrix 2 :");
	   r=scan.nextInt();
	   c=scan.nextInt();
	   b=new int[r][c];
	   System.out.println("enter the elements :");
	   for(int i=0 ;i<r;i++)
	   {
		   for(int j=0;j<c;j++)
			   b[i][j]=scan.nextInt();
	   }
   }
   public void display(int arr[][])
   {
	    
	   for(int i=0 ;i<r;i++)
	   {  
		   for(int j=0;j<c;j++)
			   	System.out.print(arr[i][j]+" ");
	       System.out.println();
	   }
	    
	    
   }
   public void add()
   {    read();
   		System.out.println("the matrix 1 is:");
   		display(a);
   		System.out.println("the matrix 2 is:");
   		display(b);
   		res=new int[r][c];
	   for(int i=0 ;i<r;i++)
	   {  
		   for(int j=0;j<c;j++)
			    res[i][j]=a[i][j]+ b[i][j];
	   }
		   System.out.println("the ADDITION is:");
	   display(res);
   }
   public void sub()
   {    read();
   		System.out.println("the matrix 1 is:");
   		display(a);
   		System.out.println("the matrix 2 is:");
   		display(b);
   		res=new int[r][c];
	   
	      
   		for(int i=0 ;i<r;i++)
	   {  
		   for(int j=0;j<c;j++)
			    res[i][j]=a[i][j]-b[i][j];
	   }
		   System.out.println("the SUBTRACTION is:");
	   display(res);
   }
   public void multiply()
   {
	   read();
	   System.out.println("the matrix 1 is:");
	   display(a);
	   System.out.println("the matrix 2 is:");
	   display(b);
	   if(r==c)
	   {
		   res=new int[r][c];
		    
		   for(int i=0 ;i<r;i++)
		   {  
			   for(int j=0;j<c;j++)
				   	for(int k=0;k<c;k++)
				   		
				   		res[i][j]=res[i][j] +a[i][k]*b[k][j];
		   }
		   
		   System.out.println("the MULTIPLICATION is:");
		   display(res);
	   }
	   else
	      System.out.println("multiplication doesn't exist");
	         
	    
   }
   public void divide()
   {
	   read();int det=0;
	   System.out.println("the matrix 1 is:");
	   display(a);
	   System.out.println("the matrix 2 is:");
	   display(b);
	   anew=new int[3][3];
	   if(r==c)
	   {
		   res=new int[r][c];
		    for(int i=0;i<3;i++)
		    	det=det+(a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3]-a[1][(i+2)%3]*a[2][(i+1)%3]));
		   System.out.println("determinant is: "+ det);
		    
		  for(int i=0;i<3;i++)
		  {  for(int j=0;j<3;j++)
			  { anew[i][j]=((a[(j+1)%3][(i+1)%3]*a[(j+2)%3][(i+2)%3])-(a[(j+1)%3][(i+2)%3]*a[(j+2)%3][(i+1)%3]))/det;
			  }
              
		  }
		  display(anew);
		  for(int i=0 ;i<r;i++)
		   {  
			   for(int j=0;j<c;j++)
				   	for(int k=0;k<c;k++)
				   		
				   		res[i][j]=res[i][j] +anew[i][k]*b[k][j];
		   }
		   
		  System.out.println("the DIVISION is:");
		   
		   display(res);
	   }
	   else
	      System.out.println("division  doesn't exist");
	         
	    
   }
}
