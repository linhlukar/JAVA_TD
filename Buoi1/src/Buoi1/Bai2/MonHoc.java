package Buoi1.Bai2;

import java.util.Scanner;

public class MonHoc {

	private String  maMon ; 
	private String tenMon; 
	private String tenGV; 
	private int soTC; 
	
	Scanner sc = new Scanner(System.in);
	public void Nhap() {

		System.out.println("Nhập mã môn học: ");
		maMon = sc.nextLine();
		System.out.print("Nhập tên môn học : ");
		tenMon = sc.nextLine(); 
		System.out.print("Nhập tên giáo viên : ");
		tenGV = sc.nextLine();
		System.out.print("Nhập số tín chỉ : ");
		soTC = sc.nextInt();

	}
	
	public void Xuat() {
		System.out.println("Mã môn học: "+ maMon);
		System.out.println("Tên Môn học: " + tenMon);
		System.out.println("Tên giáo viên: " +tenGV );
		System.out.println("Số tín chỉ: "+ soTC);
	}
}
