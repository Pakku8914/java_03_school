package kadai09_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Car.Car;

public class kadai09_02 {

	public static void main(String[] args) throws IOException {
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
		try {
			car1.setGas(gas);
		}
		catch (Exception e){
			System.out.println("正の数を入力してください");
			System.out.println(e + "のエラーが出力されました。");
		}
		car1.setSpeed(spd);
		
		car1.show();
	}
}
