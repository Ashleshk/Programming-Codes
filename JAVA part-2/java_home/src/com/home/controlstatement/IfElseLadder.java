package com.home.controlstatement;

public class IfElseLadder {
     public static void main(String []args) {
    	 
    	 int r =55;
    	 char grade;
    	 if(r>=90)
    		 grade='A';
    	 else if(r>=80)
    		 grade = 'B';
    	 else if(r>=70)
    		 grade = 'c';
    	 else if(r>60)
    		 grade = 'd';
    	 else      ///   this else is last one no else can be ahead of this  
    	 { grade = 'f';}
    	 /*else
    		 grade='G';*/
      
     switch(r)
     {
     case 0 :  break;
  //   case 55:                                      //duplicate cases are not allowed in switches
     case 55: System.out.println("jai maharashtra");
     }
}
}