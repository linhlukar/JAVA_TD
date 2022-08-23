package Buoi3.Bai1;

import java.util.Scanner;

public class MainBai1Buoi3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diem A = new Diem(); 
		Diem B = new Diem(); 
		Diem C = new Diem(); 
		Diem D = new Diem(); 
		
		A.setX(3);
		A.setY(2);
		System.out.println("A"+A);
		B.setX(1);
		B.setY(4);
		System.out.println("B"+B);
		C.setX(4);
		C.setY(10);
		System.out.println("C"+C);
		D.setX(5);
		D.setY(2);
		System.out.println("D"+D);
		
		
		 double AB =Math.sqrt(Math.pow((A.getX() -B.getX()), 2) + Math.pow((A.getY() - B.getY()), 2));
			System.out.println("AB = "+AB);

		double BC = Math.sqrt(Math.pow((B.getX() - C.getX()), 2) + Math.pow((B.getY()- C.getY()), 2)); 
		 System.out.println("BC = "+ BC);

		double AC = Math.sqrt(Math.pow((C.getX() - A.getX()), 2) + Math.pow((C.getY()- A.getY()), 2)); 
		System.out.println("AC = "+AC);

		
		double nuaCV =  (AB + BC + AC)/2;
        double S = Math.sqrt(nuaCV * (nuaCV - AB) * (nuaCV - BC) * (nuaCV - AC));
        System.out.println("S = " + S);

	}
}
