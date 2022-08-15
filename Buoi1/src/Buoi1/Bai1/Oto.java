package Buoi1.Bai1;

import java.util.Scanner;

public class Oto {
	private String maOto; 
	private String tenXe;
	private String loaiXe;
	private double giaTien; 
	Scanner sc = new Scanner(System.in); 

	public void Nhap() {
		System.out.print("Nhập mã ô tô : ");
		maOto = sc.nextLine(); 
		System.out.print("Nhập tên ô tô: ");
		tenXe = sc.nextLine(); 
		System.out.print("Nhập loại xe: ");
		loaiXe = sc.nextLine(); 
		System.out.print("Nhập giá tiền: "); 
		giaTien = Double.parseDouble(sc.nextLine());

	}
	public void Xuat() {
		System.out.printf("%-15s %-15s %-15s %-10f %n", maOto, tenXe, loaiXe, giaTien);

	}
}
