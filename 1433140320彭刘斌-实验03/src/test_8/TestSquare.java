package test_8;

import java.util.Scanner;

public class TestSquare {

	public TestSquare(Scanner Cin) {
		// TODO Auto-generated method stub
		
		System.out.println("�����������εı߳���");
		double X;
		X = Cin.nextDouble();
		
		Square objSquare = new Square(X);
		
		System.out.println("������һ�������Σ��߳�Ϊ��" + X + "��");
		System.out.println("�����ε��ܳ�Ϊ��" + objSquare.getLength() + "�����Ϊ��" + objSquare.getArea());
		
	}

}
