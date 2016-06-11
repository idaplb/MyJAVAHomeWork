package test_0;

import java.util.*;

class Problem {
	private double a, b, c;

	public void setNum(Scanner Cin) {
		System.out.println("请依次输入方程 ax^2 + bx + c = 0 的a, b, c 的值：");
		this.a = Cin.nextDouble();
		this.b = Cin.nextDouble();
		this.c = Cin.nextDouble();
		System.out.println("当前方程为：" + a + "x^2 + " + b + "x + " + c + " = 0");
	}

	public void search() {
		if (a == 0.0) {
			System.out.print("只有一个实数根：" + -c / b);
			return ;
		}
		if (b * b - 4 * a * c > 0) {
			System.out.print("有两个实数根：");
			dtGreaterThanZero();
		}
		else if (b * b - 4 * a * c == 0) {
			dtEqualToZero();
		}
		else {
			System.out.print("有两个虚数根：");
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
		System.out.print("只有一个实数根：" + (-b) / (2 * a));
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

