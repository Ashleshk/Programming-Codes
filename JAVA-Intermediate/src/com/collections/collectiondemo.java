package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collectiondemo {
    public static void main(String[] args) {
		String[] things= {"eggs","lasers","hats","pie"};
		List<String> list = new ArrayList<String>();
	
      //add array items to list
		for(String x:things)
			 list.add(x);
		
		String[] morethings= {"lasers","hats"};
		List<String> list2 = new ArrayList<String>();
    
		//add array items to list
				for(String y:morethings)
					 list2.add(y);
				
				for(int i=0;i<list.size();i++)
					System.out.printf("%s  ",list.get(i));    
				
				editlist(list,list2);
				System.out.println("\n");
				

				for(int i=0;i<list.size();i++)
					System.out.printf("%s ",list.get(i));
    }
    public static void editlist(Collection<String> l1,Collection<String> l2)
    {
    	Iterator<String> it =l1.iterator();
    	while(it.hasNext())
    	{
    		if(l2.contains(it.next()))
    		{
    			it.remove();
    		}
    		
    	}
    }


}
