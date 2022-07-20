package kadai08_03.shape;

public class Circle extends Figure{
	double radius; //半径を格納
	final double pi = 3.14; // 円周率を設定
			
	public Circle(double r)
	{
		radius=r;
	}

	public void area(){
		double menseki=radius*radius*pi;
		System.out.println("円の面積： " + menseki);
	}
	
	public void around(){
		double gaisyu = 2*pi*radius;
		System.out.println("円の外周： " + gaisyu);
	}
}
