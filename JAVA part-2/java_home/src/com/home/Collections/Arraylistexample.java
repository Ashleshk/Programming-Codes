package com.home.Collections;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList arraylist =new ArrayList();
		System.out.println("initial size of the arraylis t:"+arraylist.size());
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		arraylist.add("F");
		arraylist.add("G");
		System.out.println("size of the araraylist after the adding elements"+arraylist.size());
		System.out.println("Contents of arraylist:"+arraylist);
		arraylist.add(2, "Z");
		System.out.println("Contents of arraylist  after changes:"+arraylist);
		arraylist.remove(3);
		arraylist.remove("A");
		System.out.println("Contents of arraylist  after removing elements:"+arraylist);
		 

		
	}
}
/*   ARRAYLIST/LIST DEOSNOT HAVE ANY METHODS LIKE GETITEM OR DELETE     
 *      RATHER THEY HAVE get(int index)  and remove(index or value)
 * */
