package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape
{
	
 private float radius;

 public Circle()
 {
	 
	 System.out.println("###############################");
	 System.out.println("default constructor of Circle");
 }
 
 public void Circle(float radius)
 {
	 System.out.println("parameterized constructor of rectangle");
	 this.radius=radius;
 }
  public void calculateArea()
  {
	  float areaOfCircle = MATH_PI*radius*radius;
	  System.out.println("Area of circle: "+areaOfCircle);
	  
  }

@Override
public void calculatePerimeter() {
	// TODO Auto-generated method stub
	float PerimeterOfcircle = 2*MATH_PI*radius;
	  System.out.println("perimeter of circle: "+PerimeterOfcircle);
	  System.out.println();
}






 
}
