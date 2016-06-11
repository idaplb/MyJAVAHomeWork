package test_0;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[21];
		for (int i = 0; i < 21; ++i) {
			num[i] = 0;
		}
		for (int i = 0; i < 10000; ++i) {
			int temp =  (int)(Math.random() * 20 + 0.5);
			++num[temp];
		}
		for (int i = 0; i < 21; ++i) {
			System.out.println("随机生成了 " + num[i] + " 个 " + i + ", 所占比例" + 1.0 * num[i] / 100 + "%");
		}

	}

}
