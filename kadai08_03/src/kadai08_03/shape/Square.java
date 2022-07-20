package kadai08_03.shape;

public class Square extends Figure{
	private double width;
	private double height;
	
	public Square(double w, double h){
		width=w;
		height=h;
	}
	
	public void area(){
		double menseki=width*height;
		System.out.println("四角形の面積： " + menseki);
	}
	
	public void around(){
		double gaisyu=2*width+2*height;
		System.out.println("四角形の外周： " + gaisyu);

	}

}
