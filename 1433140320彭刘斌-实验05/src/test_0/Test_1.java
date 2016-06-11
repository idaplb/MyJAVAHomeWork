package test_0;

import javax.swing.JOptionPane;

interface IShape {
	String getArea();
}

class Circle implements IShape {
	
	private double r;
	
	public Circle() {
		String str = JOptionPane.showInputDialog("请输入圆的半径：");
		r = Double.parseDouble(str);
	}
	
	public String getArea() {
		return "我是一个圆形对象，我的半径为" + r + ", 面积为" + Math.PI * r * r;
	}
}

class Rectangle implements IShape{
	
	private double length;
	private double width;
	
	public Rectangle() {
		String str = JOptionPane.showInputDialog("请输入长方形的长：");
		length = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("请输入长方形的宽：");
		width = Double.parseDouble(str);
	}
	
	public String getArea() {
		return "我是一个长方形对象， 我的长为" + length + "， 宽为" + width + "，面积为" + length * width;
	}
}

class Shape<T extends IShape> {
	private T shape;
	public Shape(T shape) {
		this.shape = shape;
	}
	public String getArea() {
		return shape.getArea();
	}
}

public class Test_1 {
	
	public static void main(String[] Args) {
		Shape<IShape> s1 = new Shape<IShape>(new Rectangle());
		Shape<IShape> s2 = new Shape<IShape>(new Circle());
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
	}

}
