package test_0;

import java.util.*;

class CheckPrime {

	public static boolean isPrimeNumber(int Number) {
		if (Number == 1) {
			return false;
		}
		for (int i = 2; i <= (int)Math.sqrt(Number); ++i) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printPrimeNumber(int Start, int End) {
		for (int i = Start; i <= End; ++i) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

}

public class Test_3 {

	public static void main(String Args[]) {
		System.out.println("请输入一个不小于2的数：");
		Scanner Cin = new Scanner(System.in);
		int Number = Cin.nextInt();
		if (CheckPrime.isPrimeNumber(Number)) {
			System.out.println(Number + " is a prime.");
		}
		else {
			System.out.println(Number + " is not a prime.");
		}

		System.out.println("请输入闭区间的上边界：");
		int Start = Cin.nextInt();
		System.out.println("请输入闭区间的下边界：");
		int End = Cin.nextInt();
		CheckPrime.printPrimeNumber(Start, End);
		Cin.close();
	}
}
