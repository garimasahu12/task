package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

/*
 * author: Garima sahu
 * version: 1.0
 * organization: stl
 */
public class CarFactory {
	public static Car newCar(String carType)
	{
		Car nc=null;
		if(carType.equals("Sedan"))
			return new SedanCar();
		else if(carType.equals("Couple"))
			return new CoupleCar();
		else if(carType.equals("Sport"))
			return new SportCar();
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		else
			return null;
		
		
	}

}