package kadai05_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoMath {
	//変数の定義
	private double alpha;
	private double beta;
	
	
	public void setNum(double a, double b) {
		alpha = a;
		beta = b;
	}
	
	public double sinp() {
		double cul;
		cul = Math.sin(alpha) * Math.cos(beta) + Math.cos(alpha) * Math.sin(beta);
		return cul;
	}
	public double sinm() {
		double cul;
		cul = Math.sin(alpha) * Math.cos(beta) - Math.cos(alpha) * Math.sin(beta);
		return cul;
	}
	public double cosp() {
		double cul;
		cul = Math.cos(alpha) * Math.cos(beta) - Math.sin(alpha) * Math.sin(beta);
		return cul;
	}
	public double cosm() {
		double cul;
		cul = Math.cos(alpha) * Math.cos(beta) + Math.sin(alpha) * Math.sin(beta);
		return cul;
	}
	public double tanp() {
		double cul;
		cul = (1 - Math.tan(alpha) * Math.tan(beta)) / (Math.tan(alpha) + Math.sin(beta));
		return cul;
	}
	public double tanm() {
		double cul;	
		cul = (1 + Math.tan(alpha) * Math.tan(beta)) / (Math.tan(alpha) - Math.sin(beta));
		return cul;
	}
}

public class kadai05_05 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください(rad)");
		String a = br.readLine();
		double alpha = Double.parseDouble(a);
		System.out.println("2つ目の数値を入力してください(rad)");
		String b = br.readLine();
		double beta = Double.parseDouble(b);
		
		TwoMath math;
		math = new TwoMath();
		
		math.setNum(alpha, beta);
		System.out.println(math.sinp());
	}

}
