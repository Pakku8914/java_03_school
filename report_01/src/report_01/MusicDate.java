package report_01;

public class MusicDate {
	private String title;
	private String singer;
	private String album_title;
	private int year;
	
	public MusicDate() {
		
	}
	
	public void setFields(String k_title, String kasyu, String al_name, int y) {
		title = k_title;
		singer = kasyu;
		album_title = al_name;
		year = y;
	}
	
	public String getKyokumei() {
		return title;
	}
	
	public String getKasyumei() {
		return singer;
	}
	
	public String getAlbummei() {
		return album_title;
	}
	
	public int getHappyonen() {
		return year;
	}
}
