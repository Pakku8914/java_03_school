package kadai09_01;

public class kadai09_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int test[];
			test = new int [5];
			
			System.out.println("6番目の要素に値を代入します。");
			
			test[5] = 80;
			System.out.println("6番目の要素に値を代入しました。");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素を超えています。");
		}
		System.out.println("終了しました。");
	}

}
