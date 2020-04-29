package DataStructure;

import java.util.Scanner;

public class Stack {
     Scanner scan= new Scanner(System.in);
     int a[] =null;
     int top, size;
     public Stack()
     {
    	 System.out.println("Enter the size of the stack:");
    	 size=scan.nextInt();
    	 a=new int[size];
    	 top=-1;
     }
     public void push( )
     {   int token;
         int c;
         do
         {
           if(top==size-1)
           {
             System.out.println("\n\nOVERFLOW!!..Stack full\n");
             return;
           }
           System.out.println("\nEnter the token to be inserted:");
           token=scan.nextInt();
           top=top+1;
           a[top]=token;
           System.out.println("do you want to continue insertion 1 for yes");
           c=scan.nextInt();
         }
         while(c==1);
     }
     public int pop()
     {
          int t;
          if(top==0) 
          {
               System.out.println("\nStack UNDERFLOW");top=top-1;
               return -1;
          }
          t=a[top];
          top=top-1;
          return t;
     }
     public void display()
     {
          int i;
          System.out.println("The Stack elements are:");
          for(i=top;i>=0;i--)
          {    if(i==top)
     	       {	
        	  		System.out.println( a[i]+" <--top ");
        	   }
               else 	  
     	       System.out.println( a[i]+" ");
          }
          if(top==-1)
     	   System.out.println("-1\t<--top\nEMPTY STACK");
     }
}
