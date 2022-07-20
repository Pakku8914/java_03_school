package kadai06_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
	private int num;
	private double gas;
	
	public Car() {
		System.out.println("Carクラスのコンストラクターを呼び出しました。");
	}
	
	public void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です");
		System.out.println("ガソリン量は" + gas + "です");
	}
}

//　継承クラスを宣言
class RacingCar extends Car {
	private double course;
	
	public RacingCar() {
		System.out.println("Racingクラスのコンストラクターを呼び出しました。");
	}
	
	public void setCourse(double n) {
		course = n;
		System.out.println("コース番号を" + course + "にしました。");
	}
	public void show() {
		//System.out.println("車のナンバーは" + num + "です");
		//System.out.println("ガソリン量は" + gas + "です");
		super.show();
		System.out.println("コース番号は" + course + "です");
	}
}

class Track extends Car {
	private double capacity;
	
	public void setCapa(double n) {
		capacity = n;
		System.out.println("積載量を" + capacity + "にしました。");
	}
	
	public void show() {
		//System.out.println("車のナンバーは" + num + "です");
		//System.out.println("ガソリン量は" + gas + "です");
		super.show();
		System.out.println("積載量は" + capacity + "です");
	}
}

public class kadai06_04 {

	public static void main(String[] args) throws IOException{
		// オブジェクトを宣言
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		Car car[] = new Car[10];
		for (int i = 0; i < 10; i++) {
			// 車の種類の入力
			System.out.println("car: 1, racingcar: 2, track: 3");
			System.out.println((i + 1) + "代目の作成したい車の数字を入力してください");
			String choice = br.readLine();
			int ch = Integer.parseInt(choice);
			
			System.out.println("ナンバーを入力してください");
			String strnum = br.readLine();
			
			System.out.println("ガソリン量を入力してください");
			String strgas = br.readLine();
			
			//文字列型から数字へ変換
			int num = Integer.parseInt(strnum);
			double gas = Double.parseDouble(strgas);
			
			// クラスの定義
			switch(ch) {
			case 1:
				car[i] = new Car();
				car[i].setNum(num);
				car[i].setGas(gas);
				
				//値の表示
				car[i].show();
				break;
			case 2:
				car[i] = new RacingCar();
				System.out.println("コース番号を入力してください");
				String strcrs = br.readLine();
				double crs = Integer.parseInt(strcrs);
				
				//値の代入
				car[i].setNum(num);
				car[i].setGas(gas);
				((RacingCar)car[i]).setCourse(crs);
				
				//値の表示
				((RacingCar)car[i]).show();
				break;
			case 3:
				car[i] = new Track();
				System.out.println("積載量を入力してください");
				String strcapa = br.readLine();
				double capa = Double.parseDouble(strcapa);
				
				//値の代入
				car[i].setNum(num);
				car[i].setGas(gas);
				((Track)car[i]).setCapa(capa);
				
				//値の表示
				((Track)car[i]).show();
				break;
			default:
				System.out.println("値が適切ではありません。");
				break;
			}
		}		
		
		
		
	}

}