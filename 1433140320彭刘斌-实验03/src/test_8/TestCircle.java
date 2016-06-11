package test_8;

import java.util.Scanner;

public class TestCircle {

	public TestCircle(Scanner Cin) {
		// TODO Auto-generated method stub

		System.out.println("请输入圆的半径：");
		double R;
		R = Cin.nextDouble();
		
		Circle objCircle = new Circle(R);
		
		System.out.println("创建了一个圆形，半径为：" + R + "。");
		System.out.println("圆的周长为：" + objCircle.getLength() + "，面积为：" + objCircle.getArea() + "。");
		

	}

}
