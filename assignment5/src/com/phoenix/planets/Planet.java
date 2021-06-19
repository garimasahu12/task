package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {
	private int noOfMoons;

	@Override
	public void revolve() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the noOfMoons
	 */
	public int getNoOfMoons() {
		return noOfMoons;
	}

	/**
	 * @param noOfMoons the noOfMoons to set
	 */
	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	protected abstract boolean supportsLife();
	public String toString()
	{
		return "total moon:"+noOfMoons;
	}

}