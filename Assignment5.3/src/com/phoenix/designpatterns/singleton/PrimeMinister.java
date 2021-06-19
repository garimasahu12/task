package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister obj;
	private PrimeMinister()
	{
		
	}
	public static PrimeMinister getInstance()
	{
		if(obj==null)
			obj= new PrimeMinister();
		return obj;
	}
	public void serveNation()
	{
		System.out.println("Prime Minister serve nation");
	}

}