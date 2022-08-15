package Buoi1.Bai1;

import java.util.Scanner;

public class XeMay {
	private String maXeMay; 
	private String tenXe;
	private String loaiXe;
	private double thoigiansd; 
	private String tinhtrang; 

	Scanner sc = new Scanner(System.in); 

	public void Nhap() {
		System.out.print("Nhập mã xe máy : ");
		maXeMay = sc.nextLine(); 
		System.out.print("Nhập tên xe máy: ");
		tenXe = sc.nextLine(); 
		System.out.print("Nhập loại xe: ");
		loaiXe = sc.nextLine(); 
		System.out.print("Nhập thời gian sử dụng: "); 
		thoigiansd = Double.parseDouble(sc.nextLine()); 
//		Integer.parseInt(sc.nextLine());
//		thoigiansd = sc.nextDouble();
//		sc.nextLine();
		System.out.print("Nhập tình trạng: ");
		tinhtrang = sc.nextLine();

	}
	
	public void Xuat() {
		System.out.printf("%-15s %-15s %-15s %-25f %-15s %n", maXeMay, tenXe, loaiXe, thoigiansd, tinhtrang);
	}
		
}






