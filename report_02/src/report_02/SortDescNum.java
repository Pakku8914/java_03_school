package report_02;

public class SortDescNum extends SearchNum {
	// 降順でindex番目の数値を返す
	int getNum(int index) {
		// 降順ソート
		numsort();
		return num[index];
	}
	
	// 降順に並べ替え
	void numsort() {
		for(int i = 0; i < 4; i++) {
			// 最小値の保存
			int max = num[i];
			// 最小値のインデクスを保存
			int index = i;
			// i の次の要素から最小値を探索
			for(int j = i + 1; j < 5; j++) {
				// 最小値が更新されると、値を更新
				if(max < num[j]) {
					max = num[j];
					index = j;
				}
			}
			// 初期値から最大値が変わっていれば、ソート
			if(index != i) {
				num[index] = num[i];
				num[i] = max;
			}
		}
	}

	@Override
	int getNum() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
