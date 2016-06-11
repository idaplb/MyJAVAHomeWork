package test_8;

import java.util.Scanner;

public class TestRegularPentagon {

	public TestRegularPentagon(Scanner Cin) {
		// TODO Auto-generated method stub


		System.out.println("请输入正五边形的边长：");
		double X;
		X = Cin.nextDouble();
		
		RegularPentagon objRegularPentagon = new RegularPentagon(X);
		
		System.out.println("创建了一个正五边形，边长为：" + X + "。");
		System.out.println("正五边形的周长为：" + objRegularPentagon.getLength() + "，面积为：" + objRegularPentagon.getArea());
		
		
	}

}
