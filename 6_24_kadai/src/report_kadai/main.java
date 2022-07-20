package report_kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class AbstDisplay {
	abstract void print(String str);
}

class GetLastChar extends AbstDisplay {
	private int length = 10;
	private char moji[] = new char[10];
	
	public void print(String str) {
		length = str.length();
		try {
			for(int i = 0; i < length; i++) {
				moji[i] = str.charAt(i);
			}
			System.out.println("最後の文字は「" + moji[length -1] + "」です");
			System.out.println("文字列の長さは " + length + "です");
		}
		catch (Exception ArrayIndexOutOfBoundsException) {
			System.out.println("10文字を超えるため配列の要素を超えています。");
		}
	}
}

public class main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		String str = br.readLine();
		
		GetLastChar glc = new GetLastChar();
		glc.print(str);
	}

}
