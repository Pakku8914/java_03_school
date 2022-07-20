package kadai01_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai01_01 {
	
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// キーボードから入力した文字をstrへ読み込む
		String x = br.readLine();
		String y = br.readLine();
		
		// 文字をintに変換
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		
		int sub = num1 - num2;
		int div = num1 / num2;
		// 出力
		System.out.println(sub);
		System.out.println(div);
	}

}
