
public class Java_test_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("50~100之间的素数如下");
		System.out.println();
		
		for (int i = 50; i < 100; ++i) {
			int flag = 0;
			for (int j = 2; j < Math.sqrt(i) + 1; ++j) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println();

	}

}
