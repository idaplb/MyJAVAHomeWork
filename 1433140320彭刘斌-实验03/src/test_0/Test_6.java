package test_0;

class Factorial {

	public int recurrence(int n) {
		if (n == 1) {
			return 1;
		}
		return n * recurrence(n - 1);
	}

	public int loop(int n) {
		int sum = 1;
		for (int i = 1; i <= n; ++i) {
			sum *= i;
		}
		return sum;
	}

}

public class Test_6 {

	public static void main(String Args[]) {
		Factorial f = new Factorial();
		for (int i = 1; i < 11; ++i) {
			System.out.println("递归求解：" + i + "! = " + f.recurrence(i));
			System.out.println("非递归求解：" + i + "! = " + f.loop(i));
		}
	}
}