package test_8;

import java.util.Scanner;

public class TestRegularPentagon {

	public TestRegularPentagon(Scanner Cin) {
		// TODO Auto-generated method stub


		System.out.println("������������εı߳���");
		double X;
		X = Cin.nextDouble();
		
		RegularPentagon objRegularPentagon = new RegularPentagon(X);
		
		System.out.println("������һ��������Σ��߳�Ϊ��" + X + "��");
		System.out.println("������ε��ܳ�Ϊ��" + objRegularPentagon.getLength() + "�����Ϊ��" + objRegularPentagon.getArea());
		
		
	}

}
