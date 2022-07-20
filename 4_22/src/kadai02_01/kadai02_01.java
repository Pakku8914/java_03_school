package kadai02_01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kadai02_01 {
	public static void main(String[] args) throws IOException{
		int num1;
		int num2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		
		if (num1 > num2) {
			System.out.println("大きい整数は" + num1 + "です");
		}else {
			System.out.println("大きい整数は" + num2 + "です");
		}
	}
}
