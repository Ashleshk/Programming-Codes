package com.lab03.passByReference;

public class PassBYreference {
	public static void main(String [] args)
	{    int [][] numbers = new int[][]{{1,2},{3,4},{5,6}};
		 for(int i =0 ; i<3;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 System.out.printf("\nElements ({%d},{%d})={%d}",i,j,numbers[i][j]);
			 }
		 }
	}
}
