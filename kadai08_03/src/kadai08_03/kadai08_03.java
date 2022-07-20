package kadai08_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Circle.Circle;
import Square.Square;

//abstract class Figure{
//	abstract void area();
//	abstract void around();
//	public void measure() {
//		this.area();
//		this.around();
//	}
//}

public class kadai08_03 {

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
