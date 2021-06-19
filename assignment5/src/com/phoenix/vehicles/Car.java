package com.phoenix.vehicles;

import com.phoenix.interfaces.Movable;

public class Car extends Vehicle implements Movable, Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run Car");

	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move Car");

	}

	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Start Car");
	}

	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("Stop Car");
	}
	
	

}