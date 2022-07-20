package kadai04_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyPoint {
//	変数の定義
	private int x;
	private int y;
	
	public MyPoint() {
		x = 0;
		y = 0;
		System.out.println("MyPointを作成しました。");
	}
	public MyPoint(int px, int py) {
		this();
		x = px;
		y = py;
	}
	
	public void setX(int px) {
		x = px;
	}
	
	public void setY(int py) {
		y = py;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class kadai04_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MyPoint p1;
		p1 = new MyPoint();
		MyPoint p2;
		p2 = new MyPoint();
		
		System.out.println("x座標を入力してください");
		String str_p1_x = br.readLine();
		
		System.out.println("y座標を入力してください");
		String str_p1_y = br.readLine();
		
		System.out.println("x座標を入力してください");
		String str_p2_x = br.readLine();
		
		System.out.println("y座標を入力してください");
		String str_p2_y = br.readLine();
		
		int p1x = Integer.parseInt(str_p1_x);
		int p1y = Integer.parseInt(str_p1_y);
		p1.setX(p1x);
		p1.setY(p1y);
		int p2x = Integer.parseInt(str_p2_x);
		int p2y = Integer.parseInt(str_p2_y);
		p1.setX(p2x);
		p1.setY(p2y);
		
		int disx = p1.getX() - p2.getX();
		int disy = p1.getX() - p2.getY();
		int culc = disx * disx + disy * disy;
		
		System.out.println("2点間の距離の2乗の値は、" + culc + " です");

	}

}
