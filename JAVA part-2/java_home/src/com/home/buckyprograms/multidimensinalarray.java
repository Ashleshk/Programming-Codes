package com.home.buckyprograms;

public class multidimensinalarray {
        public static void main(String[] args) {
			int firstarray[][]= {{8,9,10,11},{12,13,14,15}};
			int seconarray[][]= {{8,9,10,11},{12},{2,6,8,9}};
			System.out.println("this is first array");
			display(firstarray);
			System.out.println("this is second array");
			display(seconarray);
		}
        public static void display(int x[][]) {
                   for(int row=0;row<x.length;row++)
                   {
                	   for(int column=0;column<x[row].length;column++)
                	   {
                		   System.out.print(x[row][column]+ "\t");
                	   }
                	   System.out.println();
                   }
		}
}
