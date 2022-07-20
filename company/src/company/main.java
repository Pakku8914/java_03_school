package company;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Company cmp = new Company();
		
		Driver dr1 = new Driver(cmp);
		Driver dr2 = new Driver(cmp);
		Driver dr3 = new Driver(cmp);
		Driver dr4 = new Driver(cmp);
		
		dr1.start();
		dr2.start();
		dr3.start();
		dr4.start();
	}

}
