package test_8;

public class Square {
	
	private double X, Length, Area;
	
	public Square(double X) {
		this.X = X;
	}
	
	public double getLength() {
		Length = 4 * X;
		return Length;
	}
	
	public double getArea() {
		Area = X * X;
		return Area;
	}

}
