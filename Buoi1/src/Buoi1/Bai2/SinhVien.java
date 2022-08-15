package Buoi1.Bai2;

import java.util.Scanner;


public class SinhVien {


	private static int maSV = 2020601; 
	private String tenSV; 
	private float diem; 
	private MonHoc a = new MonHoc(); 
	private float diemMonhoc; 
	
	Scanner sc = new Scanner(System.in);
	
	public static int getMaSV() {
		return maSV++;
	}
	
	private void Nhap() {
//		System.out.print("Nhập mã sinh viên : ");
//		maSV = sc.nextLine(); 
		System.out.print("Nhập tên sinh viên : ");
		tenSV = sc.nextLine(); 
		System.out.print("Nhập điểm sinh viên : ");
		diem = Float.parseFloat(sc.nextLine()); 
		System.out.print("Nhập thông tin môn học : ");
		a.Nhap();
		System.out.print("Nhập điểm môn học: ");
		diemMonhoc = sc.nextFloat();
	}
	
	private void Xuat() {
//		System.out.printf("%-10s %-15s %-15s %-10s %-10f ", getMaSV(), tenSV, diem);
//		System.out.printf("%-50s");
//		a.Xuat();
//		System.out.printf("-10f %n", diemMonhoc);
		
		System.out.println("\nMã sinh viên: "+ getMaSV());
		System.out.println("Tên Sinh viên: "+ tenSV);
		System.out.println("Điểm tổng: "+diem);
		System.out.println("THÔNG TIN MÔN HỌC: ");
		a.Xuat();
		System.out.println("Điểm môn học : "+diemMonhoc );
		
		}
	
	
	 public static void main(String[] args)
	    {

	        SinhVien[] ds = new SinhVien[5];
	        for (int i =0; i<ds.length; i++)
	        {
	            ds[i] = new SinhVien();
	            ds[i].Nhap();
	        }

//	        System.out.printf("%-15s %-15s %-10s %-20s %-15s %n", 
//	        			"Mã Sinh Viên", "Tên Sinh viên", "Điểm tổng", "THÔNG TIN ", "Điểm");
	        for(SinhVien a : ds)
	            a.Xuat();
	    }
	
	
}
