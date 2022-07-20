package kadai03_04;

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
}

public class kadai03_04 {

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
	}

}
