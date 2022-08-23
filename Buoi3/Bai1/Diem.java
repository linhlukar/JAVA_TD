package Buoi3.Bai1;

public class Diem {
	private double x; 
	private double y;
	private float khoangCach; 
	
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "=[" + x + "," + y + "]";
	} 
	
	
	
//	public double khoangCach (Diem a, Diem b)
//	{
//		double kc;
//        kc = Math.sqrt(Math.pow((a.x -b.x), 2) + Math.pow((a.y - b.y), 2));
//        return kc;
//	}
////	
////	public double dienTich(Diem a, Diem b, Diem c)
////	{
////		float nuachuVi =Math.( khoangCach(a, b) + khoangCach(b, c) + khoangCach(c, a) )/2; 
////		double dienTich = 0; 
////		
////		
////		
////	}
	
}
