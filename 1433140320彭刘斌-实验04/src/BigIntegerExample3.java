import java.math.BigInteger;

public class BigIntegerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = new BigInteger("0");
		sum = ((new BigInteger("999999999")).multiply((new BigInteger("1000000000")))).divide(new BigInteger("2"));
		System.out.println(sum);

	}

}
