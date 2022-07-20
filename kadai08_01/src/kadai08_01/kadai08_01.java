package kadai08_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Car.Car;

public class kadai08_01 {

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
