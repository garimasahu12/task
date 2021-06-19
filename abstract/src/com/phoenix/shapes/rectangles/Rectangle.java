package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape
{
     private int length;
     private int breadth;
     
     public Rectangle()
     {
    	 System.out.println("###############################");
    	 System.out.println("default constructor of rectangle");
     }
     
     public void Rectangle(int length,int breadth)
     {
    	 System.out.println("parameterized constructor of rectangle");
    	 this.length=length;
    	 this.breadth=breadth;
    	 
     }
      public void calculateArea()
      {
    	  float areaOfRectangle = length*breadth;
    	  System.out.println("Area of circle: "+areaOfRectangle);
      }
      
      public void calculatePerimeter() {
    		// TODO Auto-generated method stub
    		float PerimeterOfRectangle = 2*(length+breadth);
    		  System.out.println("perimeter of circle: "+PerimeterOfRectangle);
    		  System.out.println( );
    	}

	

}
