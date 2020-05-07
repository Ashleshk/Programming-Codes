package database_assignment;

import java.util.Scanner;

public class Student_data {
		 Scanner scan = new Scanner(System.in);
        public String name;
        public int rollno,size;
        public String sub;
        
        public Student_data() {
			System.out.print("Enter student name:");
			name=scan.next();
			System.out.println("Enter roll no :");
			rollno=scan.nextInt();
			System.out.println("Enter subject  :");
			sub=scan.next();
			 
			}
			
		}
        

