package kadai05_01;

import java.io.IOException;

public class kadai05_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 3; i<100; i++) {
			if(i % 3 == 0 && !(i % 5 == 0) ) {
				System.out.println(i);
			}
		}
	}

}
