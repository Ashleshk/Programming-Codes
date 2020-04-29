package com.home.Collections;

import java.util.TreeSet;

public class TreeSetEXample {

	    public static void main(String[] args) {
			TreeSet tx =new TreeSet();
			tx.add("B");
			tx.add("C");
			tx.add("A");
			tx.add("E");
			tx.add("D");
			tx.add("B");                                //watch this  statement
			System.out.println("elemenets are :"+tx);
			
		}
}
