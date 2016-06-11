package test_0;

import java.util.Scanner;

class Hanoi {

	int Count = 0;

	public void hanoi(int n, char S, char T, char E) {
		if (n == 1) {
			++Count;
			System.out.println("���̴�" + S + "�Ƶ�" + E + ";");
			return ;
		}
		hanoi(n - 1, S, E, T);
		++Count;
		System.out.println("���̴�" + S + "�Ƶ�" + E + ";");
		hanoi(n - 1, T, S, E);
	}

}

public class Test_5 {

	public static void main(String Args[]) {
		Hanoi h = new Hanoi();
		Scanner Cin = new Scanner(System.in);
		int n = Cin.nextInt();
		h.hanoi(n, 'S', 'T', 'E');
		System.out.println("����ŵ����" + n + "��ʱ����Ҫ�ƶ�" + h.Count + "�����");
		Cin.close();
	}
}