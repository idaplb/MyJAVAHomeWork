package test_8;

import java.util.Scanner;

public class TestTriangle {

	public TestTriangle(Scanner Cin) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入三角形的三边长：");
		double A, B, C;
		A = Cin.nextDouble();
		B = Cin.nextDouble();
		C = Cin.nextDouble();
		
		if (A + B > C && Math.abs(A - B) < C) {		
			Triangle objTriangle = new Triangle(A, B, C);
			System.out.println("创建了一个三角形，三边分别为：" + A + "，" + B + "，" + C + "。");
			System.out.println("三角形的周长为：" + objTriangle.getLength() + "，面积为：" + objTriangle.getArea() + "。");
		}
		else {
			System.out.println("这三边不能组成三角形。");
		}

	}

}
