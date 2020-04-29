package assignment14;

import java.util.Scanner;

public class Queuedemo implements Queue{
	int rear=-1,size, front=-1,c;
	int a[];
	Scanner scan=new  Scanner(System.in);
	/************************* QUEUE PART ********************************************/
	@Override
	public void initQ() {
		System.out.println("Enter the size of the queue");
		size=scan.nextInt();
		a=new int[size];
		
	}

	@Override
	public void enqueue() {
		// TODO Auto-generated method stub
		do{
	          System.out.println("\nEnter the elements to be entered : ");
		     int val=scan.nextInt();
		  
		      if(rear < size-1)
		      {  
			      if(front==-1)
				    front=0;
		          rear=rear+1;
		          a[rear]=val;
		      }
		      else
		      {
		          System.out.println("\nOVERLOAD !! ... cannot insert new element");
			   return;
		      }
		      displayQ();
		      System.out.println("\npress 1 to insert or other to end inserting  : ");
	             c=scan.nextInt();  
	     }while(c==1);
	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		do{
	 	      if(front >=rear || front==-1)
		      {
		         System.out.println("\nQUEUE UNDERFLOW !!..STACK EMPTY");
		           return;
		      }
		      else
		      {
		           System.out.println("\n the value deleted form queue is  "+ a[front]);
			    front=front+1;
		      } 
		      System.out.println("\npress 1 to delete 1 more or other to stop : ");
	             c=scan.nextInt();  
	      }while(c==1);
	}
	@Override
	public void displayQ() {
		// TODO Auto-generated method stub
		  int i;
		    if (front == - 1)
		        System.out.println("\nQueue is empty  ");
		    else
		    {
		        System.out.println("\nQueue is : \n");
			 System.out.print("FRONT-->|");
		        for (i = front; i <= rear; i++)
		            System.out.print("|"+  a[i]  + "|" );
		         
			System.out.print("|<--REAR \n");
		    }
	}
}
