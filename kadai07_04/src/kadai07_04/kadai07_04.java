package kadai07_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Figure{
	abstract void area();
	abstract void around();
	public void measure() {
		this.area();
		this.around();
	}
}

class Square extends Figure {
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

class Circle extends Figure {
	private double radius;
	private double pi = 3.14;
	public void setRad(double r) {
		radius = r;
	}
	
	protected void area() {
		double cul = radius * radius * pi;
		System.out.println("面積は" + cul + "です");
	}
	protected void around() {
		double cul = radius * 2 * pi;
		System.out.println("外周は" + cul + "です");
	}
}

public class kadai07_04 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		Square fig1 = new Square();
		Circle fig2 = new Circle();
		
		System.out.println("縦の長さを入力してください");
		String strw = br.readLine();
		
		System.out.println("横の長さを入力してください");
		String strh = br.readLine();
		
		System.out.println("半径を入力してください");
		String strr = br.readLine();
		
		// 変換
		double w = Double.parseDouble(strw);
		double h = Double.parseDouble(strh);
		double r = Double.parseDouble(strr);
		
		//クラスに適応
		fig1.setWidHei(w, h);
		fig2.setRad(r);
		
		//表示
		fig1.measure();
		fig2.measure();
	}

}
