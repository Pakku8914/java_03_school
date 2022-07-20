package Circle;

import Figure.Figure;

public class Circle extends Figure {
	private double radius;
	private double pi = 3.14;
	public void setRad(double r) {
		radius = r;
	}
	
	public void area() {
		double cul = radius * radius * pi;
		System.out.println("面積は" + cul + "です");
	}
	public void around() {
		double cul = radius * 2 * pi;
		System.out.println("外周は" + cul + "です");
	}
}
