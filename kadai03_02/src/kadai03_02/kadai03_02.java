package kadai03_02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
	int num;

	double gas;

	void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}

	void setGas(double g){
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	void getNum() {
		System.out.println("車のナンバーは" + num + "です。");
	}
	
	void getGas() {
		System.out.println("ガソリン量は" + gas + "です。");
	}

	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class kadai03_02 {
	public static void main(String[] args) throws IOException {
		// 標準入力クラスとCarクラスのオブジェクトの宣言
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car car1 = new Car();

		// ナンバーの文字列の入力
		System.out.println("ナンバーを入力してください");
		String strnum = br.readLine();

		// ガソリン量の文字列の入力
		System.out.println("ガソリンの量を入力してください");
		String strgas = br.readLine();

		// 入力した文字を整数・小数点に変換
		int num = Integer.parseInt(strnum);
		double gas = Double.parseDouble(strgas);

		// クラスのオブジェクトへ代入
		car1.setNum(num);
		car1.setGas(gas);

		// 代入した値を表示
		car1.show();
	}
}