package batch2;

import java.util.Scanner;

public class PROGRAM1 {
	public static int factorial(int x)                      //factorial function
	{
		int fact=1;
		for(int i=x;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void prime()                              //prime function
	{  int num=3,status=1;
		for ( int i = 2 ; i <=50 ;  )
    {
        for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
        {
           if ( num%j == 0 )
           {
              status = 0;
              break;
           }
        }
        if ( status != 0 )
        {
           System.out.println(num);
           i++;
        }
        status = 1;
        num++;
     }         
      }
	public static void sum_average()
	{     int size;
	      int arr[] =new int[10],sum=0;
	      float avg;
		System.out.println("enter the size of numbers:");
		Scanner obj=new Scanner(System.in);
		size=obj.nextInt();
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
			sum=sum+arr[i];
		}
	
		System.out.println(" elements of the array:");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		avg=(float)sum/size;
		System.out.println("\nThe sum of all the elements is : "+ sum);
		System.out.println("the average of all the elements is : "+ avg%-3.2);
	}
	
	
	public static void main(String[] args) {
		int x,ch,c;
		System.out.println("the average of all the elements is : "+ 253.2%3.2);
		do
		{
			System.out.println("MENU \n1.factorial\n2.Ist 50 prime number\n3.sum and average");
			System.out.print("enter your choice : ");
			Scanner scan = new Scanner(System.in);
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:{
					System.out.print("enter the number: ");
					x=scan.nextInt();
					int y=factorial(x);
					System.out.println("factorial is : "+y);
					break;
				 }
			case 2:{
					prime();
					break;
				 }
			case 3:{
			           sum_average();
			           break;
		       	 }
			default: System.out.println("INVALID INPUT ....");
		
			}
			System.out.println("press '1' to continue '0'for end");
			c=scan.nextInt();
		}while(c==1);

}
}