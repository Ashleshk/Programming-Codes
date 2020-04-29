package assignment10;

import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
		Matrix mat=new Matrix();
		Scanner scan =new Scanner(System.in);
		int c, ch;
		
		do
		{
			System.out.println("MENU \n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
			System.out.println("enter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:mat.add();break;
			case 2:mat.sub();break;
			case 3:mat.multiply();break;
			case 4:mat.divide();break;
			default:System.out.println("INVALID INPUT !!");
				 
			}
			System.out.println("\n\npress '1' to continue '0'for end");
			c=scan.nextInt();			
		}while(c==1);
		
		
		
		
		 
	}
}
