package test_8;

public class RegularPentagon {
	
	private double X, Length, Area;
	
	public RegularPentagon(double X) {
		this.X = X;
	}
	
	public double getLength() {
		Length = 5 * X;
		return Length;
	}
	
	public double getArea() {
		Area = 5 * 1 / 2 * X * X / 2 * Math.tan(54 * Math.PI / 180);
		return Area;
	}

}
