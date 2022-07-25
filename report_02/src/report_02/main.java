package report_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface SortNum {
	int numsort();
}

abstract class SearchNum {
	// 配列を定義
	protected int num[] = new int[5];
	
	// 整数値を登録
	protected void setNum(int arr[]) {
		for(int i = 0; i < 5; i++) {
			num[i] = arr[i];
		}
	}
	
	abstract int getNum();
}

public class main {
	// 抽象メソッド
	int getNum() {
		return 0;
	}
	// インターフェース
	public int numsort() {
		return 0;
	}

	public static void main(String[] args) throws IOException {
		// 入力のための定義
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int arr[] = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("数字を入力してください");
			String str_number = br.readLine();
			int number = Integer.parseInt(str_number);
			arr[i] = number;
		}
		// コンポーネントの定義
		AveNum average = new AveNum();
		SortAscNum a_num = new SortAscNum();
		SortDescNum d_num = new SortDescNum();
		
		// 配列の値を適用
		average.setNum(arr);
		a_num.setNum(arr);
		d_num.setNum(arr);
		
		// 平均値を出力
		System.out.println("平均値" + average.getNum());
		System.out.println("昇順ソート");
		for(int i = 0; i < 5; i++) {
			System.out.println(a_num.getNum(i));
		}
		System.out.println("降順ソート");
		for(int i = 0; i < 5; i++) {
			System.out.println(d_num.getNum(i));
		}
	}
	
}
