package test_8;

import java.util.Scanner;

public class TestSquare {

	public TestSquare(Scanner Cin) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入正方形的边长：");
		double X;
		X = Cin.nextDouble();
		
		Square objSquare = new Square(X);
		
		System.out.println("创建了一个正方形，边长为：" + X + "。");
		System.out.println("正方形的周长为：" + objSquare.getLength() + "，面积为：" + objSquare.getArea());
		
	}

}
