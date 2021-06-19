package com.phoenix.designpatterns.singleton;

public class SingletonMain {
	public static void main(String [] args)
	{
		Earth h=Earth.getInstance();
	
		President p=President.getInstance();
		
		
		PrimeMinister pm=PrimeMinister.getInstance();
		
	     Sun s=Sun.getInstance();
		
		System.out.println();
		
		h.createLife();
		System.out.println("###################");
		System.out.println();
		
		p.representNation();
		System.out.println("###################");
		System.out.println();
		
		pm.serveNation();
		System.out.println("###################");
		System.out.println();
		
		s.giveLight();
		System.out.println("###################");
	
	}

}