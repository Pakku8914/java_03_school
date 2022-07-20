package kadai05_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai05_01 {

	public static void main(String[] args) throws IOException{
		//標準入力用クラスの宣言
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//キーボードから文字列をaに入力する
		System.out.println("文字列を入力してください");
		String a = br.readLine();
		
		//入力した文字列を逆順にする
		StringBuffer temp = new StringBuffer();
		//入力した文字列の長さを取得
		int len = a.length();
		for(int i= 0;i<len;i++) {
			//キーボードから入力した文字列の右側から順案に1文字ずつ追加
			temp.append(a.charAt(len-i-1));
		}
		
		//キーボードから文字列をbに入力する
		System.out.println("文字列bを入力してください");
		String b = br.readLine();
		
		//aとbをあわせて1つの変数に代入する
		temp.append(b);
		
		//合わせた文字列を表示する
		String pr = temp.toString();
		System.out.println("結果は、" + pr);
	}

}
