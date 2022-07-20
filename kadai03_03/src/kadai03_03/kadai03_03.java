package kadai03_03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sansu {
	int num1;
	int num2;
	
	void setNums(int x, int y) {
		num1 = x;
		num2 = y;
	}
	
	void getSum() {
		int culc;
		culc = num1 + num2;
		System.out.println("和は" + culc + "です。");
	}
	
	void getMin() {
		int culc;
		culc = num1 - num2;
		System.out.println("差は" + culc + "です。");
		
	}
	
	void getMulti() {
		int culc;
		culc = num1 * num2;
		System.out.println("積は" + culc + "です。");
	}
	
	void getDiv() {
		int culc;
		culc = num1 / num2;
		System.out.println("商は" + culc + "です。");
	}
}

public class kadai03_03 {
	public static void main(String[] args) throws IOException {
		// 標準入力クラスとCarクラスのオブジェクトの宣言
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Sansu number = new Sansu();

		// 数字を入力
		System.out.println("一つ目の数字を入力してください");
		String strnum1 = br.readLine();

		// 数字を入力
		System.out.println("二つ目の数字を入力してください");
		String strnum2 = br.readLine();

		// 入力した文字を整数・小数点に変換
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);

		// クラスのオブジェクトへ代入
		number.setNums(num1, num2);

		// 代入した値を表示
		number.getSum();
		number.getMin();
		number.getMulti();
		number.getDiv();
	}
}