package test_0;

import java.util.Scanner;

public class Test_7 {

	public static void main(String Args[]) {
		Scanner Cin = new Scanner(System.in);
		System.out.println("�������ܽ�");
		int n = Cin.nextInt();

		System.out.println(n + "ԪǮ������£�");
		for(int i = 0; i < n + 1; ++i) {
			for (int j = 0; j < n / 2 + 2; ++j) {
				for (int l = 0; l < n / 5 + 2; ++l) {
					if (i + j * 2 + l * 5 == n) {
						System.out.println(i + " ��һԪ��" + j + " ����Ԫ��" + l + " ����Ԫ��");
					}
				}
			}
		}

		Cin.close();
	}
}