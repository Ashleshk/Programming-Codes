package com.lab09.GenericsAndCollection2;

 
import java.util.ArrayList;
import java.util.List;

public class listdemo {
      public static void main(String[] args) {
		 ArrayList<Double> list =new ArrayList<>();
		//list.add("String");
		list.add(20.0);
		list.add(20.876);
		list.add(20.0);
		list.add(20.876);
		System.out.println(list);
		list.remove("String");
		list.remove(20);
		System.out.println(list);
		for(Object ob : list)
		{
			System.out.println(ob);
		}
	}
}
