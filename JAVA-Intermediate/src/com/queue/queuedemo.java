package com.queue;

import java.util.PriorityQueue;

public class queuedemo {
		public static void main(String[] args) {
			
			PriorityQueue<String> q = new PriorityQueue<String>();
			q.offer("first");
			q.offer("second");
			q.offer("third");
			q.offer("fourth");
			
			System.out.printf("%s ",q);
			System.out.println();
			
			System.out.printf("%s ",q.peek());
			q.poll();
			System.out.printf("%s ",q);
		}
}
