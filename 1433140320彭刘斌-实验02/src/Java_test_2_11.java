
public class Java_test_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i = 1.0;
		double sum = 1.0;
		while (Math.abs(i - 21.0) > 1e-7) {
			sum += Math.pow(i, i);
			
			System.out.println(Math.pow(i, i) + " +");
			
			i += 1.0;
		}
		
		System.out.println("=\n" + sum);

	}

}
