import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Cin = new Scanner(System.in);
		System.out.println("输入一个大整数：");
		BigInteger num = Cin.nextBigInteger();
		BigInteger sum = new BigInteger("1");
		for (BigInteger i = new BigInteger("2"); i.compareTo(num) <= 0; i = i.add(new BigInteger("1"))) {
			sum = sum.multiply(i);
		}
		System.out.println(sum);
		Cin.close();

	}

}
