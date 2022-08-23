package Buoi3.Bai3;

import java.util.Scanner;

public class But {
	private int soluong; 
	private double giaTien;
	Scanner sc = new Scanner(System.in); 
	@Override
	public String toString() {
		return "[soluong=" + soluong + ", giaTien=" + giaTien+ "]";
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	} 
	



	
}
