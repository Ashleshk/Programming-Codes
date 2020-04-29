package com.LIsttoarray;

import java.util.Arrays;
import java.util.LinkedList;

public class ash {
   public static void main(String[] args) {
	  String[] stuff= {"babies","watermelon","melons","fudge"};
	  
	  LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
	  //array created ot listarray
	  
	  thelist.add("pumbkin");          //listmethod
	  thelist.addFirst("firstthnng");   //listmethod
	  
	  // convert back to array
	  stuff=thelist.toArray(new String[thelist.size()]);
	  for(String x : stuff)
		  System.out.print(x+ " ");
}
}
