package assignment14;

import java.util.Scanner;

 
public class TestMain implements Stack,Queue{
	int rear=-1,size,top, front=-1,c;
	int a[];
	 
	Scanner scan=new  Scanner(System.in);
	/************************* QUEUE PART ********************************************/
	public void initQ() {
		System.out.print("Enter the size of the queue :");
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
		      System.out.print("\npress 1 to insert or other to end inserting  : ");
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
		      System.out.print("\npress 1 to delete 1 more or other to stop : ");
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
	 
	
	/*************************************STACK PART****************************************/

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.print("\nEnter the size of the stack:");
	   	 size=scan.nextInt();
	   	 a=new int[size];
	   	 top=-1;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		int token;
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
          System.out.print("do you want to continue insertion 1 for yes  :");
          c=scan.nextInt();
        }
        while(c==1);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
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

	@Override
	public void display() {
		// TODO Auto-generated method stub
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
	/***************************** MAIN PART ***********************************************/
	public static void main(String[] args) {
		 Scanner obj =new Scanner(System.in);
		
		int ch,c;
		do
		{
			System.out.print("menu\n1.STACK\n2.QUEUE\nEnter your choice:");
			ch=obj.nextInt();
			TestMain stack =new TestMain();
			TestMain queue= new TestMain(); 

			switch(ch)
			{
			case 1: {   stack.init();
						do
						{
							System.out.print("1.PUSH\n2.POP\n3.DISPLAY\nEnter your chioce:");
							ch=obj.nextInt();
							switch(ch)
							{
							case 1:{stack.push();stack.display();break;}
							case 2:{stack.pop();stack.display();break;}
							case 3:stack.display();break;
							default:
								System.out.println("INVALID INPUT !!");
							}
							System.out.print("press '1' to continue '0'for end :");
							c=obj.nextInt();
					    }while(c==1);
						break;
					}
			case 2:{   queue.initQ();
						do
						{
							System.out.print("1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\nEnter your chioce:");
							ch=obj.nextInt();
							switch(ch)
							{
								case 1:queue.enqueue();queue.displayQ();break;
								case 2:queue.dequeue();queue.displayQ();break;
								case 3:queue.displayQ();break;
								default:
									System.out.println("INVALID INPUT !!");
							}
							System.out.print("press '1' to continue '0'for end :");
							c=obj.nextInt();
					    }while(c==1);
						break;
					}
				default:
					System.out.println("INVALID INPUT !!");
					
			}
			System.out.println("press '1' to continue '0'for end :");
			c=obj.nextInt();

		}while(c==1);
	}

	

	

}
