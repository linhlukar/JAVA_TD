package Buoi3.Bai2;

import java.util.Scanner;

public class mainSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		SinhVien sv1 = new SinhVien(); 
		SinhVien sv2 = new SinhVien(); 
		
		System.out.println("Nhập thông tin sv 1: ");
		sv1.Nhap();
		System.out.println("Nhập thông tin SV 2 ");
		sv2.Nhap();
		
		// in ra màn hình : 
		System.out.println("Sinh viên 1  "+sv1);
		System.out.println("Sinh viên 2 "+sv2);
		
		
		
		//So sánh điểm : 
		if(sv1.getDiem() > sv2.getDiem())
			System.out.println(sv1);
		else 
			System.out.println(sv2);
		
		
		//khởi tạo sv3 
		SinhVien sv3 = new SinhVien(); 
		
		if(sv1.getDiem() > sv2.getDiem())
		{
			sv3.setDiem(sv2.getDiem());
			sv3.setTenSV(sv1.getTenSV());
			System.out.println("Sinh viên 3 " +sv3);
			//System.out.println("Sinh viên 3: "+sv2.getDiem() + sv1.getTenSV());
		}
		else
		{
			sv3.setDiem(sv1.getDiem());
			sv3.setTenSV(sv2.getTenSV());
			System.out.println("Sinh viên 3 "+ sv3);
//			System.out.println("Sinh viên 3: "+sv1.getDiem() + sv2.getTenSV());
		}	
		
		
	}
}
