package com.lab09.GenericsAndCollection;

public class GenreicMUltiple <T,V,F>{
    T ob;
    V ob1;
    F ob2;
    

	 
    public GenreicMUltiple(T ob, V ob1, F ob2) {
		this.ob = ob;
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public T getob(){
    	return ob;
    }
    public V getob1(){
    	return ob1;
    }
    public F getob2(){
    	return ob2;
    }
   
}
