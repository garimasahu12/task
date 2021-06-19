package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m,m1,m2,m3,m4,m5;
		//Earth
		m=new Earth();
		System.out.println("Earth\n");
		((Earth)m).setNoOfMoons(1);
		System.out.println(((Earth)m).toString());
		System.out.println("Number of moons on earth:"+((Earth)m).getNoOfMoons());
		((Earth)m).move();
		((Earth)m).revolve();
		((Earth)m).rotate();
		System.out.println("earth supports life:"+((Earth)m).supportsLife());
		//jupiter
		System.out.println("###########################");
		System.out.println("Jupiter\n");
		m1=new Jupiter();
		((Jupiter)m1).setNoOfMoons(8);
		System.out.println(((Jupiter)m1).toString());
		System.out.println("number of moons in jupiter:"+((Jupiter)m1).getNoOfMoons());
		((Jupiter)m1).move();
		((Jupiter)m1).revolve();
		((Jupiter)m1).rotate();
		System.out.println("jupiter supports life:"+((Jupiter)m1).supportsLife());
		//tiger
		
		
		System.out.println("############################");
		System.out.println("tiger\n");
		m2=new Tiger();
		((Tiger)m2).jump();
		((Tiger)m2).move();
		((Tiger)m2).run();
		((Tiger)m2).walk();
		//cat
		
		System.out.println("#############################");
		System.out.println("Cat\n");
		m3=new Cat();
		((Cat)m3).jump();
		((Cat)m3).move();
		((Cat)m3).run();
		((Cat)m3).walk();
		
		
		
		//car
		System.out.println("#############################");
		System.out.println("car\n");
		m4=new Car();
		((Car)m4).move();
		((Car)m4).run();
		((Car)m4).start();
		((Car)m4).stop();
		
		
		//humanRobot
		System.out.println("#############################");
		System.out.println("HumanRobot\n");
		m5=new HumanRobot();
		((HumanRobot)m5).jump();
		((HumanRobot)m5).move();
		((HumanRobot)m5).processData();
		((HumanRobot)m5).run();
		((HumanRobot)m5).senseInfo();
		((HumanRobot)m5).useArtificialIntelligence();
		((HumanRobot)m5).walk();

	}

}