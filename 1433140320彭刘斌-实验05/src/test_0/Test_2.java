package test_0;

enum WEEK {
	星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期天
}

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (WEEK w : WEEK.values()) {
			System.out.print(w + " ");
		}
	}

}
