package kadai03_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Keisan {
	int numarr[] = new int [10];
	
	void setNum(int n, int index) {
		numarr[index] = n;
	}
	
	void getAve() {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += numarr[i];
		}
		System.out.println("平均値は" + sum / 10 + "です。");
	}
	
	void max() {
		int maxnum = numarr[0];
		for(int i = 1; i < 10; i++) {
			if(maxnum < numarr[i]) {
				maxnum = numarr[i];
			}
		}
		System.out.println("最大値は" + maxnum + "です");
	}
	
	void min() {
		int minnum = numarr[0];
		for(int i=1;i<10;i++) {
			if(minnum > numarr[i]) {
				minnum = numarr[i];
			}
		}
		System.out.println("最小値は" + minnum + "です");
	}
	
	void bubble_sort() {
		int sort_arr[] = numarr;
		int temp;
		for(int i=0;i<9;i++) {
			for(int j = 0; j < 9; j++) {
				if(sort_arr[j] > sort_arr[j + 1]) {
					temp = sort_arr[j];
					sort_arr[j] = sort_arr[j + 1];
					sort_arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0;i < 10; i++) {
			System.out.println(sort_arr[i]);
		}
	}
}

public class kadai03_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Keisan kei = new Keisan();
		
		System.out.println("数字を入力してください");
		for(int i=0;i<10;i++) {
			String strnum = br.readLine();
			int num = Integer.parseInt(strnum);
			kei.setNum(num, i);
		}
		
		kei.getAve();
		kei.max();
		kei.min();
		
		System.out.println("ソートした配列");
		kei.bubble_sort();
	}

}
