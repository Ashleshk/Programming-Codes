package com.lab11.ProirityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemp {
      PriorityQueue<String>  st;
     public void queueMethod()
      {
    	  st =new PriorityQueue<>();
    	  st.add("b");
    	  st.add("abcd");
    	  st.add("abc");
    	  st.add("a");
    	  st.add("xyz");
    	  while(st.size()>0)
    		   System.out.println(st.remove());
      }
      
}
