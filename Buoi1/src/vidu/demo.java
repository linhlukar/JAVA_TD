package vidu;

public class demo {
	public static int stt = 1;
	public static void Tong() {
		//static : biến toàn cục  chạy trong bất cứ hàm nào có 
		//
		stt++;
	}
	public static void main(String[] args) {
		demo d = new demo(); 
		d.Tong();
		System.out.println(d.stt);
	}
}
