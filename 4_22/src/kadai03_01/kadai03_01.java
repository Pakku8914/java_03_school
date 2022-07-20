package kadai03_01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai03_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		if (num >= 30) {
			num *= 100;
			num *= 0.8;
			System.out.println(num);
		}else if(num >= 10) {
			num *= 100;
			num *= 0.9;
			System.out.println(num);
		}else {
			num *= 100;
			System.out.println(num);
		}
	}

}
