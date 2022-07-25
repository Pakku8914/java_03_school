package report_02;

public class AveNum extends SearchNum {
	// 平均値を返す
	int getNum() {
		// 合計値を保存
		int sum = 0;
		// 配列ループ
		for(int i: num) {
			sum += i;
		}
		// 平均値を返す
		return sum / 5;
	}
}
