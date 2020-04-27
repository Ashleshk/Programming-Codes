package com.lab12.annotaionAndReflections;

//@Reflectdemo(decs="this is me",val=100)
 
public class Student {

	int rollno;
	String name;
	float marks;
	public Student() {
		this.rollno = 420;
		this.name = "jacob fyres";
		this.marks = 50;
	}
	public Student(int rollno, String name, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks="
				+ marks + "]";
	}
	
	
}
