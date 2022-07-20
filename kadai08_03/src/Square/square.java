package Square;

import Figure.Figure;

public class Square extends Figure {
	private double width, height;
	public void setWidHei(double w, double h) {
		width = w;
		height = h;
	}
	
	public void area() {
		double cul = width * height;
		System.out.println("面積は" + cul + "です");
	}
	
	public void around() {
		double cul = 2 * width + 2 * height;
		System.out.println("外周は" + cul + "です");
	}
}
