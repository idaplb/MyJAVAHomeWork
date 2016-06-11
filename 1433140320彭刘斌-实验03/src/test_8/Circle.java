package test_8;

public class Circle {
	
	private double R, Length, Area;
	
	public Circle(double R) {
		this.R = R;
	}
	
	public double getLength() {
		Length = 2 * Math.PI * R;
		return Length;
	}
	
	public double getArea() {
		Area = Math.PI * R * R;
		return Area;
	}

}
