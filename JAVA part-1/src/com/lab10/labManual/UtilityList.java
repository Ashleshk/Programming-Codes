package com.lab11.labManual;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilityList {
	List<Employee> list =new ArrayList<>();
	public void addEMployee(Employee emp)
	{
		list.add(emp);
	}
	public void Displayemployee()
	{
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public List currentLIst(){
		return list;
	}
}
