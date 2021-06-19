package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.square.Square;

public class AbstractMain 
{
	public static void main(String []args)
	{
    Circle c=new Circle();
     c.Circle(8.9f);
     c.calculateArea();
     c.calculatePerimeter();
    
     Rectangle r=new Rectangle();
     r.Rectangle(2,3);
     r.calculateArea();
     r.calculatePerimeter();
     
     Square s=new Square();
     s.Square(3);
     s.calculateArea();
     s.calculatePerimeter();
	}
}
