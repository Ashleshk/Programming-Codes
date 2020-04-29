package com.home.completebox;

public class box {
	private double width;
	private double height;
	private double depth;
	box(box ob) {    // pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	//constructor used when all dimensions specified
	box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	//constructor used when no dimensions specified
	box() {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	}
	//constructor used when cube is created
	void box(double len) {
		width = height = depth = len;
	}
	//compute and return volume
	double volume() {
		return width * height * depth;
	}
}



