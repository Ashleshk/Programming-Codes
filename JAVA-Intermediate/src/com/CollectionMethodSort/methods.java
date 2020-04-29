package com.CollectionMethodSort;
import java.util.*;
public class methods {
		public static void main(String[] args) {
			
			String[] crap= {"apples","lemons","geese","bacoan","ypouti"};
			
			List<String> l1= Arrays.asList(crap);
			
			
			Collections.sort(l1);
			
			System.out.printf("%s\n",l1);
			
			Collections.sort(l1, Collections.reverseOrder());
			System.out.printf("%s\n",l1);

			
			
			//create a aaray and convert to list
			Character[] ray= {'p','w','a'};
			List<Character> l=Arrays.asList(ray);
			System.out.println("list is :");
			output(l);
			
			//reverse and print out the list
			Collections.reverse(l);
			System.out.println("After reveres:");
			output(l);
			
			//create a new aaray and a lisat
			Character[]  newray= new Character[3];
			List<Character> listcopoy=Arrays.asList(newray);

			Collections.copy(listcopoy, l);
			System.out.println("Copy of list:");
			output(listcopoy);
			
			//fill the colection wiht crap
			Collections.fill(l, 'X');
			System.out.println("after filling the list :");
			output(l);
			
			
			////////////////////////////////////////////////////
			
			ArrayList<String> list2 = new ArrayList<String>( );
			list2.add("youtube");
			list2.add("google");
			list2.add("fihs");
			
			for(String x:list2)
				System.out.printf("%s ",x);
			
			Collections.addAll(list2, crap);
			System.out.println();
			for(String x:list2)
				System.out.printf("%s ",x);
////////////////////////////////////////////////////////////////////////
			System.out.println( Collections.frequency(list2, "youtube"));
			
			
			boolean tof=Collections.disjoint(l1, list2);
			System.out.println(tof);
		}
		//output method
		private static void output(List<Character> thelist)
		{
			for(Character thing:thelist)
				System.out.printf("%s ",thing);
			System.out.println();
		}
}
