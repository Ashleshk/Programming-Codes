package com.lab09.BoundedTypeGenerics;

import javax.swing.text.StyledEditorKit.BoldAction;

public class AverageCalci<T extends Number> {
        T[] arr ;

		public AverageCalci(T[] arr) {
			this.arr = arr;
		}
        public double calculateavg(){
        	double sum=0;
        	for(int i=0;i<arr.length;i++)
        	{
        		sum += arr[i].doubleValue();
        		
        	}
        	sum =sum /arr.length;
        	return sum;
        	
        }
        public boolean issameavg(AverageCalci<?>ac){
        	if(this.calculateavg()==ac.calculateavg())
        	{
        		return true ;
        	}
        	else 
        		return false;
        }
        
        /*amethod(aun ?extends emp>g)
        amethod(aun ?extends sale>g)*/   //        this are thea another bounded wildcard
}
