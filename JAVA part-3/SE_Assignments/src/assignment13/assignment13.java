package assignment13;

import java.util.Scanner;

import DataStructure.Queue;
import DataStructure.Stack;

public class assignment13 {
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			int ch,c;
			do
			{
				System.out.println("menu\n1.STACK\n2.QUEUE\nEnter your choice:");
				ch=scan.nextInt();
				switch(ch)
				{
				case 1: {   
							Stack stack = new Stack();
							do
							{
								System.out.println("1.PUSH\n2.POP\n3.DISPLAY\nEnter your chioce:");
								ch=scan.nextInt();
								switch(ch)
								{
								case 1:stack.push();stack.display();break;
								case 2:stack.pop();stack.display();break;
								case 3:stack.display();break;
								default:
									System.out.println("INVALID INPUT !!");
								}
								System.out.println("press '1' to continue '0'for end :");
								c=scan.nextInt();
						    }while(c==1);
							break;
						}
				case 2:{
							Queue queue = new Queue();
							do
							{
								System.out.println("1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\nEnter your chioce:");
								ch=scan.nextInt();
								switch(ch)
								{
									case 1:queue.enqueue();queue.display();break;
									case 2:queue.dequeue();queue.display();break;
									case 3:queue.display();break;
									default:
										System.out.println("INVALID INPUT !!");
								}
								System.out.println("press '1' to continue '0'for end :");
								c=scan.nextInt();
						    }while(c==1);
							break;
						}
					default:
						System.out.println("INVALID INPUT !!");
						
				}
				System.out.println("press '1' to continue '0'for end :");
				c=scan.nextInt();

			}while(c==1);
		}
}
