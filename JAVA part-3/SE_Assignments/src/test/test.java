package test;
import java.util.Arrays;
import java.util.Scanner;
public class test {
	 public static void main(String[] arguments) {
		     /*String names[] = { "Peter", "Patricia", "Hunter", "Sarah",
		        "Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", "Robert",
		       "Sean", "Paschal", "Kathy", "Neleh", "Vecepia" };
	  System.out.println("The original order:");
		      for (int i = 0; i < names.length; i++)
		       System.out.println(i + ": " + names[i]);
	     Arrays.sort(names);
	   System.out.println("The new order:");
		    for (int i = 0; i < names.length; i++)
	      System.out.println(i + ": " + names[i]);*/
		 int[] arr = new int[5];
		 int c;
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter size of array:");
         c=scan.nextInt();
         System.out.println("enter elements:");
         for(int i=0;i<c;i++)
         {
           arr[i]=scan.nextInt();
          } 
	        Arrays.sort(arr);
	       
	        
	        System.out.printf("Modified arr[] : %s",
	                          Arrays.toString(arr));
		  }
}
