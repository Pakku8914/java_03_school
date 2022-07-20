package kadai07_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Vehicle {
	protected int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("速度を" + speed + "にしました");
	}
	
	abstract void show();
}

class Car extends Vehicle {
	private int num;
	private double gas;
	
	public void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です");
		System.out.println("速度は" + speed + "です");
	}
}

class Plane extends Vehicle {
	private int flight;
	
	public void setFlight(int f) {
		flight = f;
		System.out.println("便名を" + flight + "にしました。");
	}
	
	public void show() {
		System.out.println("便名は" + flight + "です");
		System.out.println("速度は" + speed + "です");
	}
}

public class kadai07_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		Car car1 = new Car();
		
		System.out.println("ナンバーを入力してください");
		String strnum = br.readLine();
		
		System.out.println("ガソリンの量を入力してください");
		String strgas = br.readLine();
		
		System.out.println("速度を入力してください");
		String strspd = br.readLine();
		
		int num = Integer.parseInt(strnum);
		double gas = Double.parseDouble(strgas);
		int spd = Integer.parseInt(strspd);
		
		car1.setNum(num);
		car1.setGas(gas);
		car1.setSpeed(spd);
		
		car1.show();
	}

}
