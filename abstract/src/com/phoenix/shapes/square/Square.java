package com.phoenix.shapes.square;

import com.phoenix.shapes.Shape;

public class Square extends Shape
{
	private int side;
    
    public Square()
    {
    	 System.out.println("###############################");
   	 System.out.println("default constructor of square");
    }
    
    public void Square(int side)
    {
   	 System.out.println("parameterized constructor of square");
   	 this.side=side;
   	}
    
    public void calculateArea()
     {
   	  float areaOfSquare= side*side;
   	  System.out.println("Area of square: "+areaOfSquare);
     }
    
    public void calculatePerimeter() {
    	// TODO Auto-generated method stub
    	float PerimeterOfSquare = 4*side;
    	  System.out.println("perimeter of circle: "+PerimeterOfSquare);
    	  System.out.println();
    }

	
}


