import java.util.*;

public class Java_test_2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入要打印的菱形图案的行数（奇数）：");

		Scanner cin = new Scanner(System.in);

		int number = cin.nextInt();

		int i, j;
		
		i = 1;
		while (i <= number / 2 + 1) {
			j = 1;
			while (j <= number / 2 + 1 - i) {
				System.out.print(" ");
				++j;
			}
			
			j = 1;
			while (j <= 2 * i - 1) {
				System.out.print("*");
				++j;
			}
			System.out.println();
			++i;
		}

		i = number / 2;
		while (i > 0) {
			j = 1;
			while (j <= number / 2 + 1 - i) {
				System.out.print(" ");
				++j;
			}
			
			j = 1;
			while (j <= 2 * i - 1) {
				System.out.print("*");
				++j;
			}
			System.out.println();
			--i;
		}

		cin.close();

	}

}
