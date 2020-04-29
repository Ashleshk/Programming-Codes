package com.home.buckyprograms2;

public class finaldemo {
        private int sum ;
        private final int NUMBER;
		public finaldemo( int nUMBER) {
			 
			NUMBER = nUMBER;
		}
		public void add()
		{
			sum+=NUMBER;
		}
		@Override
		public String toString() {
			return "finaldemo [sum=" + sum + ", NUMBER=" + NUMBER + "]\n";
		}
		
        
}
