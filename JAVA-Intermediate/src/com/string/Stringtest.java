package com.string;

public class Stringtest {
		public static void main(String[] args) {
			String[] words= {"funk","chunk","furry","bacanoter"};
			
			String s = "ashleshkhajbageashleshkhajabge";
			String a ="ashlesh ";
			String b="     khajbage    ";
			//startswith
			for(String w : words) {
				   if(w.startsWith("fu"))
					   System.out.println(w + "starts with fu");
						   
			}
			//endswith
			for(String w : words) {
				   if(w.endsWith("unk"))
					   System.out.println(w + "ends with unk");
						   
			}
			
			System.out.println(s.indexOf('k')); //find index of fisrt k
			System.out.println(s.indexOf('k',5));//fisrt k starting 5th location  ie ignore ashles
			System.out.println(s.indexOf("kha"));
			System.out.println(s.indexOf("kha",15 ));
		
		
		   System.out.println(a.concat(b));
		   System.out.println(a.replace('h', 'F'));
		   System.out.println(b.toUpperCase());
		   System.out.println(b.trim());
		}
}
