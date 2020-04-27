package com.lab01.basicProgram;

public class MethodOverloading {
	public double add(int a, int b )
	{
		return a+b;
	}
	public double add(int a, float b )
	{
		return a+b;
	}
	public double add(float a, int b )
	{
		return a+b;
	}
	public String add(String a, String b )
	{
		return a+b;
	}
	public double add(float a, double b )
	{
		return a+b;
	}

}
