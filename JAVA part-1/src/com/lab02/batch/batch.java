package com.lab02.batch;

import com.lab02.OOPsInJava.Student;

public class batch {
       public int batchbo;
       private String date;
       protected  String course;
        int studentenrolled;
        public batch() {
		this(12,"27/06/2017","javacore",23);
        	// TODO Auto-generated constructor stub
		}
        public batch(int bn,String s,String c,int count){
        	  batchbo=bn;
              date=s;
              course=c;
              studentenrolled=count;
        	
        }
        public void displaybatch(){
        	System.out.print("the batch details "+batchbo+" \n"+date+ " \n"+ course+" \n"+studentenrolled+" \n");
        	Student st =new Student(33,"ramu","h+",43);
        	st.display();
        }
}
