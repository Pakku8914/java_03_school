package kadai04_01;
import java.io.IOException;

public class kadai04_01 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
		int count = 0;
		while (count < 3) {
			int num = 0;
			while (num < 10) {
				System.out.println(arr[num]);
			}
			count++;
		}
		for(int n = 0; n < 3; n++) {
			for(int i = 0; i<10;i++) {
				System.out.println(arr[i]);
			}
		}
		count = 0;
		do {
			int num = 0;
			do {
				System.out.println(arr[num]);
				num++;
			}while (num < 10);
			count++;
		}while (count < 3);
		
	}

}
