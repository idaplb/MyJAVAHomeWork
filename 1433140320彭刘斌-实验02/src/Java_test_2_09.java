
import java.util.*;

public class Java_test_2_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入要打印的菱形图案的行数（奇数）：");
		
		Scanner cin = new Scanner(System.in);
		
		int number = cin.nextInt();
		
		for (int i = 1; i <= number / 2; ++i) {
			for (int j = 1; j <= number / 2 + 1 - i; ++j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= number; ++i) {
			if (i == number / 2 + 1) {
				System.out.print("+");
				continue;
			}
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = number / 2; i > 0; --i) {
			for (int j = 1; j <= number / 2 + 1 - i; ++j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		cin.close();

	}

}
