package test_8;

import java.util.Scanner;

public class TestCircle {

	public TestCircle(Scanner Cin) {
		// TODO Auto-generated method stub

		System.out.println("������Բ�İ뾶��");
		double R;
		R = Cin.nextDouble();
		
		Circle objCircle = new Circle(R);
		
		System.out.println("������һ��Բ�Σ��뾶Ϊ��" + R + "��");
		System.out.println("Բ���ܳ�Ϊ��" + objCircle.getLength() + "�����Ϊ��" + objCircle.getArea() + "��");
		

	}

}
