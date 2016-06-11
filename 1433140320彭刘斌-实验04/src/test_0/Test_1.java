package test_0;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] prime = new boolean[101];
		for (int i = 0; i <= 100; ++i) {
			prime[i] = true;
		}
		prime[0] = prime[1] = false;
		for (int i = 2; i * i <= 100; ++i) {
			if (prime[i]) {
				for (int j = i * 2; j <= 100; j += i) {
					prime[j] = false;
				}
			}
		}
		System.out.println("2～100之间的素数如下");
		int sum = 0, num = 0;
		for (int i = 1; i <= 100; ++i) {
			if (prime[i]) {
				System.out.printf("%d\t", i);
				++num;
				sum += i;
				if (num % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println(100 + "之内的所有素数共有" + num +"个，它们的和为" + sum + "，平均值为" + 1.0 * sum / num);

	}

}