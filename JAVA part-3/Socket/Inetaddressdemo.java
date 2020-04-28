package com.book2.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inetaddressdemo {
    public static void main(String[] args) {
		 
    	InetAddress a;
		try {
			a = InetAddress.getLocalHost();
			System.out.println(a);
		} catch (UnknownHostException e) {
 			e.printStackTrace();
		}
		
	 
		
	}
 
}
