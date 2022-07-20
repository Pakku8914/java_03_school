package kadai03_07;

class Month {
	int arr[] = new int[31];
	String week[] = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
	
	void setDay() {
		for(int i=0; i<31; i++) {
			arr[i] = i + 1;
		}
	}
	
	void getCal() {
		int p = 5;
		for(int i = 0; i < 30; i++) {
			System.out.println(week[p] + " " + arr[i]);
			if (p == 6) {
				p = 0;
			}else {
				p++;
			}
		}
	}
}

public class kadai03_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Month cal = new Month();
		
		cal.setDay();
		
		cal.getCal();
	}

}
