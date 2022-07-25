package report_02;

public class SortAscNum extends SearchNum {
	// 昇順でindex番目の数値を返す
	int getNum(int index) {
		// 昇順ソート
		numsort();
		return num[index];
	}
	
	// 昇順に並べ替え
	void numsort() {
		for(int i = 0; i < 4; i++) {
			// 最小値の保存
			int min = num[i];
			// 最小値のインデクスを保存
			int index = i;
			// i の次の要素から最小値を探索
			for(int j = i + 1; j < 5; j++) {
				// 最小値が更新されると、値を更新
				if(num[j] < min) {
					min = num[j];
					index = j;
				}
			}
			// 初期値から最小値が変わっていれば、ソート
			if(index != i) {
				num[index] = num[i];
				num[i] = min;
			}
		}
	}

	@Override
	int getNum() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}
