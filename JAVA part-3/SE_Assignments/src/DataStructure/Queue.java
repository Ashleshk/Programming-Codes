package DataStructure;

import java.util.Scanner;

public class Queue {
		int rear=-1,size, front=-1,c;
		int que[];
		Scanner scan=new  Scanner(System.in);
		public Queue()
		{
			System.out.println("Enter the size of the queue");
			size=scan.nextInt();
			que=new int[size];
		}
		public void enqueue( )
		{    
			do{
		          System.out.println("\nEnter the elements to be entered : ");
			     int val=scan.nextInt();
			  
			      if(rear < size-1)
			      {  
				      if(front==-1)
					    front=0;
			          rear=rear+1;
			          que[rear]=val;
			      }
			      else
			      {
			          System.out.println("\nOVERLOAD !! ... cannot insert new element");
				   return;
			      }
			      display();
			      System.out.println("\npress 1 to insert or other to end inserting  : ");
		             c=scan.nextInt();  
		     }while(c==1);
		}
		public void display() {
			    int i;
			    if (front == - 1)
			        System.out.println("\nQueue is empty  ");
			    else
			    {
			        System.out.println("\nQueue is : \n");
				 System.out.print("FRONT-->|");
			        for (i = front; i <= rear; i++)
			            System.out.print("|"+  que[i]  + "|" );
			         
				System.out.print("|<--REAR \n");
			    }
		 }
		public void dequeue()
		{  
			do{
		 	      if(front >=rear || front==-1)
			      {
			         System.out.println("\nQUEUE UNDERFLOW !!..STACK EMPTY");
			           return;
			      }
			      else
			      {
			           System.out.println("\n the value deleted form queue is  "+ que[front]);
				    front=front+1;
			      } 
			      System.out.println("\npress 1 to delete 1 more or other to stop : ");
		             c=scan.nextInt();  
		      }while(c==1);
		}
 }
