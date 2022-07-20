package kadai04_01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
	private int num;
	private double gas;
	
	public void setNum(int n) {
		num = n;
		System.out.println("ナンバーを　" + num + "にしました。");
	}
	
	public void SetGas(double g) {
		gas = g;
		System.out.println("ガソリン量を " + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは　" + num + "です。");
		System.out.println("ガソリンの量は　" + gas + "です。");
	}
}

public class kadai04_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Car car1 = new Car();
		
		System.out.println("ナンバーを入力してください");
		String strnum = br.readLine();
		
		System.out.println("ガソリンの量を入力してください");
		String strgas = br.readLine();
		
		int num = Integer.parseInt(strnum);
		double gas = Double.parseDouble(strgas);
		
		car1.setNum(num);
		car1.SetGas(gas);
		
		car1.show();
	}

}
