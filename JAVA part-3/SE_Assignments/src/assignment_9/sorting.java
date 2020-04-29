package assignment_9;

import java.util.Scanner;
import java.util.Arrays;

public class sorting {

  Scanner obj= new Scanner(System.in);
    static void int_sort(int a[],int n)
    {    int temp;
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=0;j<n-i-1;j++)
    		{
    		   if(a[j]>a[j+1])
    		   {  temp =a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    		}
    		
    	}
    }
    static void string_sort(String a[],int n)
    {
    	String temp  ;
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=0;j<n-i-1;j++)
    		{
    		   if(a[j].compareTo(a[j+1])>0)
    		   {  temp =a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    		}
    		
    	}
    }
     	
	public static void main(String[] args) {
		int ch,ch1,c;
		int arr[] ;
		String a[];
		Scanner scan= new Scanner(System.in);
		do
		{
		System.out.println("MENU \n1.MANUAL\n2.AUTO");
		System.out.println("enter your choice:");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1:{
					System.out.println("MENU \n1.INTEGER\n2.STRING");
					System.out.println("enter your choice:");
					ch1=scan.nextInt();
					switch(ch1)
					{
					case 1:{  System.out.println("enter size of array:");
					            c=scan.nextInt();
					            arr =new int[c];
					            System.out.println("enter elements:");
					            for(int i=0;i<c;i++)
					            {
					              arr[i]=scan.nextInt();
					            }
					            int_sort(arr,c);
					            System.out.println("the sorted array:");
					            for(int i=0;i<c;i++)
					            {
					               System.out.print(arr[i]+" ");
					            }
					            break;
					}
					case 2: { 
						    System.out.println("enter size of array:");
				            c=scan.nextInt();
				            a  =new String[c];
				            System.out.println("enter elements:");
				            for(int i=0;i<c;i++)
				            {
				              a[i]=scan.next();
				            }
						string_sort(a,c);
						 System.out.println("the sorted array:");
				            for(int i=0;i<c;i++)
				            {
				               System.out.print(a[i]+" ");
				            }
							break;
					}
					default:System.out.println("INVALID INPUT !!");
					}
					break;
				}
		case 2:{	System.out.println("MENU \n1.INTEGER\n2.STRING");
					System.out.println("enter your choice:");
					ch1=scan.nextInt();
					switch(ch1)
					{
					case 1: { System.out.println("enter size of array:");
		                     c=scan.nextInt();
		                     arr =new int[c];
		                     System.out.println("enter elements:");
		                     for(int i=0;i<c;i++)
		                     {
		                       arr[i]=scan.nextInt();
		                      } 
		                       Arrays.sort(arr);
		            	     System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
							  break;
					}
					case 2:  { 
						System.out.println("enter size of array:");
						c=scan.nextInt();
						a =new String[c];
						System.out.println("enter elements:");
						for(int i=0;i<c;i++)
						{
		             	a[i]=scan.next();
						}
						 System.out.println("The original array:");
					      for (int i = 0; i < a.length; i++)
					       System.out.print(" " + a[i]);
					      	Arrays.sort(a);
					      	System.out.println("\nThe new array:");
					    for (int i = 0; i < a.length; i++)
				      System.out.print(" " + a[i].toString());
				     
						break;
						}
					default:System.out.println("INVALID INPUT !!");
					}
					break;
					}
		default:   System.out.println("INVALID INPUT !!");
		
		}
		System.out.println("\n\npress '1' to continue '0'for end");
		c=scan.nextInt();
	}while(c==1);
	}
	
	
}