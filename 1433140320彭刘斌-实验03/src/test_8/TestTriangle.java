package test_8;

import java.util.Scanner;

public class TestTriangle {

	public TestTriangle(Scanner Cin) {
		// TODO Auto-generated method stub
		
		System.out.println("�����������ε����߳���");
		double A, B, C;
		A = Cin.nextDouble();
		B = Cin.nextDouble();
		C = Cin.nextDouble();
		
		if (A + B > C && Math.abs(A - B) < C) {		
			Triangle objTriangle = new Triangle(A, B, C);
			System.out.println("������һ�������Σ����߷ֱ�Ϊ��" + A + "��" + B + "��" + C + "��");
			System.out.println("�����ε��ܳ�Ϊ��" + objTriangle.getLength() + "�����Ϊ��" + objTriangle.getArea() + "��");
		}
		else {
			System.out.println("�����߲�����������Ρ�");
		}

	}

}
