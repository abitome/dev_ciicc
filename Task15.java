package test;

interface Shape {
	double calculatePerimeter(AbstractShape shape);
	double calculateArea(AbstractShape shape);
}

abstract class AbstractShape implements Shape {
	String color;
	double length;
	double width;

	AbstractShape(String color, double radius) {
		this.color = color;
		((Circle)this).radius = radius;
	}

	AbstractShape(String color, double length, double width){
		this.color = color;
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea(AbstractShape shape) {
		return switch( this.getClass().getSimpleName() ) {
			case "Circle" -> (Math.PI * ((Circle)shape).radius * ((Circle)shape).radius) ; 
			case "Rectangle" -> length * width;
			default -> 0;
		};
	}

	@Override
	public double calculatePerimeter(AbstractShape shape){ 
		if(shape instanceof Circle) return (Math.PI * 2 * ((Circle)shape).radius);
		if(shape instanceof Rectangle) return (2 * shape.width + 2 * shape.length);
		return 0;
	}
}

class Circle extends AbstractShape {
	double radius;

	Circle(String color, double radius){
		super(color, radius);
	}
}

class Rectangle extends AbstractShape {

	double length;
	double width;

	Rectangle(String color, double length, double width){
		super(color, length, width);
		this.length = length;
		this.width = width;
	}
}

public class Task15 {
	public static void main(String[] args) {
		Circle c = new Circle("White", 3);
		System.out.println("Circle radius:" + c.radius);
		System.out.println("Circle circumference: " + c.calculatePerimeter(c));
		System.out.println("Circle area: " + c.calculateArea(c));
		
		Rectangle r = new Rectangle("Black", 3, 4);
		System.out.println("Rectangle width: " + r.width + " length: " + r.length);
		System.out.println("Rectangle perimeter: " + r.calculatePerimeter(r));
		System.out.println("Rectangle area: " + r.calculateArea(r));
	}
}
