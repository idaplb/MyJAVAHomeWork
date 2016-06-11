package test_0;

import javax.swing.JOptionPane;

interface IShape {
	String getArea();
}

class Circle implements IShape {
	
	private double r;
	
	public Circle() {
		String str = JOptionPane.showInputDialog("������Բ�İ뾶��");
		r = Double.parseDouble(str);
	}
	
	public String getArea() {
		return "����һ��Բ�ζ����ҵİ뾶Ϊ" + r + ", ���Ϊ" + Math.PI * r * r;
	}
}

class Rectangle implements IShape{
	
	private double length;
	private double width;
	
	public Rectangle() {
		String str = JOptionPane.showInputDialog("�����볤���εĳ���");
		length = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("�����볤���εĿ�");
		width = Double.parseDouble(str);
	}
	
	public String getArea() {
		return "����һ�������ζ��� �ҵĳ�Ϊ" + length + "�� ��Ϊ" + width + "�����Ϊ" + length * width;
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
