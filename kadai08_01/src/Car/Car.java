package Car;

import kadai08_01.Ab.Vehicle;

class GasException extends Exception {};

public class Car extends Vehicle{
	private int num;
	private double gas;
	private int speed;
	
	public void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	public void setGas(double g) throws GasException{
		if (g < 0) {
			GasException e = new GasException();
			throw e;
		}
		else {
			gas = g;
			System.out.println("ガソリン量を" + gas + "にしました。");
		}
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です");
		System.out.println("速度は" + speed + "です");
	}
}