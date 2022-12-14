package model.application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BLACK, 3.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle Color: " + s1.getColor());
		System.out.println("Circle area: " +  String.format("%.2f", s1.area()));
		System.out.println("Rectangle Color: " + s2.getColor());
		System.out.println("Rectangle area: " +  String.format("%.2f", s2.area()));
		
	}
}
