package test_0;

import java.util.*;

class Problem {
	private double a, b, c;

	public void setNum(Scanner Cin) {
		System.out.println("���������뷽�� ax^2 + bx + c = 0 ��a, b, c ��ֵ��");
		this.a = Cin.nextDouble();
		this.b = Cin.nextDouble();
		this.c = Cin.nextDouble();
		System.out.println("��ǰ����Ϊ��" + a + "x^2 + " + b + "x + " + c + " = 0");
	}

	public void search() {
		if (a == 0.0) {
			System.out.print("ֻ��һ��ʵ������" + -c / b);
			return ;
		}
		if (b * b - 4 * a * c > 0) {
			System.out.print("������ʵ������");
			dtGreaterThanZero();
		}
		else if (b * b - 4 * a * c == 0) {
			dtEqualToZero();
		}
		else {
			System.out.print("��������������");
			dtLessThanZero();
		}
	}

	public void dtGreaterThanZero() {
		double dt = b * b - 4 * a * c;
		System.out.print("x1 = " + (-b + Math.sqrt(dt)) / (2 * a)
				+ ", x2 = " + (-b - Math.sqrt(dt)) / (2 * a));
	}

	public void dtLessThanZero() {
		double dt = Math.abs(b * b - 4 * a * c);
		System.out.print("x1 = " + (-b) / (2 * a) + "+" + Math.sqrt(dt) / (2 * a) + "i"
				+ ", x2 = " + (-b) / (2 * a) + -Math.sqrt(dt) / (2 * a) + "i");
	}

	public void dtEqualToZero() {
		System.out.print("ֻ��һ��ʵ������" + (-b) / (2 * a));
	}
}


public class Test_4 {

	public static void main(String Args[]) {
		Scanner Cin = new Scanner(System.in);
		Problem OneProblem = new Problem();
		OneProblem.setNum(Cin);
		OneProblem.search();
		System.out.println();
		System.out.println();
		OneProblem.setNum(Cin);
		OneProblem.search();
		System.out.println();
		System.out.println();
		OneProblem.setNum(Cin);
		OneProblem.search();
		Cin.close();
	}
}

