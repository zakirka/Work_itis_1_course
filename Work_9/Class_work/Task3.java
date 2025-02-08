abstract class Shape {
	public abstract double area();

	public abstract void draw();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double area(){
		return Math.PI*radius*radius;
	}
	public void draw(){
		System.out.println("Это круг с радиусом " + radius);
	}
}

class Rectangle extends Shape  {
	private double width, height;

	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public void draw() {
		System.out.println("Это прямоугольник с шириной " + width + " и высотой " + height);
	}
}

class Triangle extends Shape {
	private double base, height;

	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}

	public double area() {
		return 0.5 * base * height;
	}

	public void draw() {
		System.out.println("Это треугольник с основанием " + base + " и высотой " + height );
	}
}

public class Task3 {
	public static void main(String[] args){
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4,6);
		Shape triangle = new Triangle(3,7);

		circle.draw();
		System.out.println("Площадь круга: " + circle.area());
		System.out.println();

		rectangle.draw();
		System.out.println("Площадь прямоугольника: " + rectangle.area());
		System.out.println();

		triangle.draw();
		System.out.println("Площадь треугольника: " + triangle.area());
	}
}