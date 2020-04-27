package com.lab02.categories;

public class Product {
    private int id;
    private String name,brand;
     
    private double retialprice,MRPprice ,GST,discount,count=0;
    public Product(){
  	  this(13,"kurkure",15,12,6,2,"parle");
    }
    public Product(int i,String s,double rp ,double mrp,double gst,double dis,String br ){
  	 
  	  id=i;
  	  name=s; 
  	  retialprice=rp;
  	  MRPprice=mrp;
  	  GST=gst;
  	  discount=dis;
  	  brand=br;
  	   
    }
    public void display(){
  	    double margin_money= MRPprice-retialprice-discount;
  	    double PRoduct_price=MRPprice+5-discount;
  	    
  	  
  	  System.out.println("\n"+id+"\n"+name+"\n"+retialprice+"\n"+MRPprice+"\n"+GST+"\n"+discount+"\n");
  	  System.out.println("total count="+count);
    }
    public int getid(){
  	  
  	  return id;
    }
    public String getname(){
  	  
  	  return name;
    }
    public double getretailprice(){
	  
	  return retialprice;
    }
    public double getmrpprice(){
	  
	  return MRPprice;
    }
    
    

}
