package com.home.multrithreading;

public class TestMain {
  public static void main(String[] args) {
	new THreaddemo().start();                       //thread are started b ythrad manager
	new B().start();
	new C().start();                 // the output window shows all thread computaiton even if prevois havent ended
}
}
