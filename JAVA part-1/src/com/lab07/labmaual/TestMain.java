package com.lab07.labmaual;

public class TestMain {
public static void main(String[] args) {
	
	int a, b,ch ;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	System.out.println("NETER YOUR CHOICE"+"1.ADD\n2.SUBTRACT\n3.MULITPLY\n4.DIVIDE"+"\nCHOOSE one option ");
	ch=Integer.parseInt(args[2]);
	
	switch(ch)
	{
	case 1: System.out.println("additon is "+(a+b));break;
	case 2: System.out.println("subtraction is "+(a-b));break;
	case 3: System.out.println("multiplication is "+(a*b));break;
	case 4: System.out.println("division is "+(a/b)+"  Remainder "+(a%b));break;
	default:  System.out.println("invalid " );break;
	}
}
}
