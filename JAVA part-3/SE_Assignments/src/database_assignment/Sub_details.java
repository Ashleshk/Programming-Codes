package database_assignment;

import java.util.Scanner;

public class Sub_details extends Student_data{
           public int sub_code;
           public int internal_marks;
           public int univ_marks;
           Scanner scan= new Scanner(System.in);
           
           
           public Sub_details() {
        	   System.out.println("Enter subject code:");
        	   sub_code=scan.nextInt();
        	   System.out.println("Enter internal marks: ");
        	   internal_marks=scan.nextInt();
        	   System.out.println("Enter university marks:");
        	   univ_marks=scan.nextInt();
        	}
}
