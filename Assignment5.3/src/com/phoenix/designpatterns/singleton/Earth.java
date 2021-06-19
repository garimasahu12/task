package com.phoenix.designpatterns.singleton;


	public class Earth {
		private static Earth obj;
		private Earth()
		{
			
		}
		public static Earth getInstance()
		{
			if(obj==null)
				obj= new Earth();
			return obj;
		}
		public void createLife()
		{
			System.out.println("Earth creates life");
		}

	}
	