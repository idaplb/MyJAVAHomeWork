
import java.util.*;

public class Java_test_2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		int number;
		System.out.println("������һ�����֣� ");
		while (cin.hasNext()) {
			number = cin.nextInt();
			String str = Integer.toBinaryString(number);
			System.out.print("("+number+")�Ķ����Ʋ���Ϊ��");
			System.out.println(str);
			System.out.println("������һ�����֣� ");
		}
		
		cin.close();

	}

}
