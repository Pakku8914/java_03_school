package report_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class report_01 {
	
	// ソート関数
	static void sort_year_down(MusicDate[] db) {
		for(int i = 0; i < 9; i++) {
			// tempに入れ替え先のdbを保存
			MusicDate temp = db[i];
			// 初期値を設定（最小値を設定）
			int min_year = temp.getHappyonen();
			// index
			int min_index = i;
			for(int j = i + 1; j < 10; j++) {
				// 探索しているDBのyearが小さければ
				if(db[j].getHappyonen() < min_year)
				{
					// 値の入れ替え
					temp = db[j];
					min_year = temp.getHappyonen();
					min_index = j;
				}
			}
			if(db[i] != temp) {
				db[min_index] = db[i];
				db[i] = temp;
			}
			
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 楽曲データベース
		MusicDate[] db = new MusicDate[10];
		
		// 楽曲情報入力
		for(int i = 0; i < 10; i++) {
			db[i] = new MusicDate();
			// 入力を取得
			System.out.println("曲名を入力してください");
			String title = br.readLine();
			System.out.println("歌手名を入力してください");
			String singer = br.readLine();
			System.out.println("アルバム名取得");
			String a_title = br.readLine();
			System.out.println("発売年を入力してください");
			String str_year = br.readLine();
			int year = Integer.parseInt(str_year);
			
			// クラスに値を代入
			db[i].setFields(title, singer, a_title, year);
		}
		
		// ソート
		sort_year_down(db);
		
		for(int i=0; i< 10; i++) {
			System.out.println("title: " + db[i].getKyokumei());
			System.out.println("singer: " + db[i].getKasyumei());
			System.out.println("album_title: " + db[i].getAlbummei());
			System.out.println("year: " + db[i].getHappyonen());
		}
	}

}
