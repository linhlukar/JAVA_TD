package Buoi3.Bai3;

import java.util.Scanner;

public class MainBai3 {

	public static void main(String[] args) {
		
		But butbi = new But(); 
		But butchi = new But(); 
		
		Scanner sc = new Scanner(System.in); 
		
		butbi.setSoluong(40);
		butbi.setGiaTien(3500);
		butchi.setSoluong(35); 
		butchi.setGiaTien(2500);

	//Xuất thông tin : 
		System.out.println("Bút BI : "+butbi);
		System.out.println("Bút Chì: "+butchi);
		
	//Nhập thông tin : 
		
		System.out.print("But chi khach muon mua : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("But bi khach muon mua: ");
        int b = Integer.parseInt(sc.nextLine());
        
        
        double tong = a * butbi.getGiaTien() + b * butchi.getGiaTien();
        System.out.print("Tong tien: " + tong +"\n");

        butbi.setSoluong((butbi.getSoluong() - a));
        System.out.println( "Bút bi:  " +butbi);
        butchi.setSoluong((butchi.getSoluong()-b ));
        System.out.println("bút chì: "+ butchi);

        System.out.println("Tổng còn lại sau khi mua : "+(butbi.getSoluong() + butchi.getSoluong()));
        if ( (butbi.getSoluong() + butchi.getSoluong()) < 30)
        {
             System.out.println("Số lượng nhập bút bi cần nhập: " + ( 35-butbi.getSoluong()));
            System.out.println("Số lượng nhập bút chì cần nhập: " + ( 35-butchi.getSoluong() ));       	
        }
        
        
        

	}
}
