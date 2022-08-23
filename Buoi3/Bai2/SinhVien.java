package Buoi3.Bai2;

import java.util.Scanner;

public class SinhVien {

	private double diem; 
	private String tenSV;
	Scanner sc = new Scanner(System.in); 
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	

	public void Nhap()
	{
		System.out.print("Nhập tên : ");
		tenSV = sc.nextLine(); 
		System.out.print("Nhập điểm : ");
		diem = Double.parseDouble(sc.nextLine()); 
	}
	@Override
	public String toString() {
		return "[diem=" + diem + ", tenSV=" + tenSV + "]";
	} 
	
	
}
