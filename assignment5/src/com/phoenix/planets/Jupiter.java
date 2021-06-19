package com.phoenix.planets;

import com.phoenix.interfaces.Rotatable;

public class Jupiter extends Planet{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		super.revolve();
		System.out.println("Revolve Jupiter");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		super.rotate();
		System.out.println("Rotate Jupiter");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("Move Jupiter");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return false;
	}
	

}