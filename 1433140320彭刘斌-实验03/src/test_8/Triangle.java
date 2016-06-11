package test_8;

public class Triangle {
	
	private double A, B, C, Length, Area;
	
	public Triangle(double A, double B, double C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double getLength() {
		Length = A + B + C;
		return Length;
	}
	
	public double getArea() {
		double p = (A + B + C) / 2;
		Area = Math.sqrt(p * (p - A) * (p - B) * (p - C));
		return Area;
	}

}