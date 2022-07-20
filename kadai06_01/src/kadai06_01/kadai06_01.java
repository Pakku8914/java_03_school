package kadai06_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
	private int num;
	private double gas;
	
	public Car() {
		System.out.println("Carクラスのコンストラクターを呼び出しました。");
	}
	
	public void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリン量は" + gas + "です");
	}
}

//　継承クラスを宣言
class RacingCar extends Car {
	private double course;
	
	public RacingCar() {
		System.out.println("Racingクラスのコンストラクターを呼び出しました。");
	}
	
	public void setCourse(double n) {
		course = n;
		System.out.println("コース番号を" + course + "にしました。");
	}
	public void show() {
		//System.out.println("車のナンバーは" + num + "です");
		//System.out.println("ガソリン量は" + gas + "です");
		super.show();
		System.out.println("コース番号は" + course + "です");
	}
}

public class kadai06_01 {

	public static void main(String[] args) throws IOException{
		// オブジェクトを宣言
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		Car car1 = new RacingCar();
		
		System.out.println("ナンバーを入力してください");
		String strnum = br.readLine();
		
		System.out.println("ガソリン量を入力してください");
		String strgas = br.readLine();
		
		System.out.println("コース番号を入力してください");
		String strcrs = br.readLine();
		
		int num = Integer.parseInt(strnum);
		double gas = Double.parseDouble(strgas);
		double crs = Integer.parseInt(strcrs);
		
		// クラスのオブジェクトへ代入
		car1.setNum(num);
		car1.setGas(gas);
		((RacingCar)car1).setCourse(crs);
		
		// 代入した値を表示
		((RacingCar)car1).show();
	}

}
