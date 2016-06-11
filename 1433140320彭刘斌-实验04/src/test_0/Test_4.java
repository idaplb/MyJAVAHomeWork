package test_0;

import java.util.Collections;
import java.util.Vector;

public class Test_4 {
	
	public static void main(String[] args) {
		Vector<Character> vs = new Vector<Character>();
		for (int i = 0; i < 10; ++i) {
			char temp = (char)('a' + (int)(Math.random() * 25 + 0.5));
			vs.add(temp);
		}
		System.out.println("随机生成的10个字母（排序前）：" + vs);
		Collections.sort(vs);
		System.out.println("随机生成的10个字母（排序后）：" + vs);
	}

}
