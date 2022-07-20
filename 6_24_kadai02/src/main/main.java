package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		String numstr = br.readLine();
		int num = Integer.parseInt(numstr);
		
		Ransu rand = new Ransu();
		for(int i = 0; i < 10; i++) {
			rand.setRm(i, rand.getRev());
		}
		
		rand.checking(num);
	}
}

