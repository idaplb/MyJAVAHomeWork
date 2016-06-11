
import java.util.*;

public class Java_test_2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		int number;
		System.out.println("请输入一个数字： ");
		while (cin.hasNext()) {
			number = cin.nextInt();
			String str = Integer.toBinaryString(number);
			System.out.print("("+number+")的二进制补码为：");
			System.out.println(str);
			System.out.println("请输入一个数字： ");
		}
		
		cin.close();

	}

}
