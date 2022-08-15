package Buoi1.Bai1;

import java.util.Scanner;

public class XuongXe {
	private String maXuong; 
	private Oto a = new Oto(); 
	private XeMay b = new XeMay(); 

	Scanner sc = new Scanner(System.in); 

	public void Nhap() {
		System.out.println("Nhập mã xưởng: ");
		maXuong = sc.nextLine(); 
//		shift alt s : tạo nhanh get set 

		System.out.println("Nhập thông tin ô tô : ");
		a.Nhap();
		System.out.println("Nhập thông tin xe máy: ");
		b.Nhap();
		
	}
	public void Xuat() {
		System.out.println("Mã Xưởng : " + maXuong);
//		shift alt s : tạo nhanh get set 
		System.out.printf("%-15s %-15s %-15s %-10s %n", "Mã ô tô", "Tên ô tô"," Loại xe"," Giá");
		a.Xuat();
		System.out.printf("%-15s %-15s %-15s %-20s %-15s %n", "Mã xe máy", "Tên xe máy", "loại xe","thời gian sử dụng"," tình trạng");
		b.Xuat();
	}
	public static void main(String[] args) {
		XuongXe k = new XuongXe();
		k.Nhap();
		System.out.println("THÔNG TIN XƯỞNG");
		k.Xuat();
	}
}
