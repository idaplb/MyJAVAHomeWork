package test_0;

import java.util.Vector;

public class Test_5 {
	
	public static int ans = 0;
	
	public static void f(int n, int step, String str, Vector<Integer> used) {
		if (step == n + 1) {
			int num = Integer.parseInt(str);
			int flag = 0;
			num += 20085;
			String s = Integer.toString(num);
			if (s.length() > 5) {
				return ;
			}
			s += str;
			for (int i = 0; i < s.length() - 1; ++i) {
				String tp = s.substring(i, i + 1);
				String x = s.substring(i + 1);
				if (x.contains(tp)) {
					flag = 1;
				}
			}
			if (flag == 0) {
				++ans;
				System.out.println("µÚ" + ans + "ÖÖ½â");
				for (int i = 0; i < 6 - str.length(); ++i) {
					System.out.print(" ");
				}
				System.out.println(str);
				System.out.println("+20085");
				System.out.println("------");
				System.out.println(" " + num);
			}
			return ;
		}
		for (int i = 0; i < 10; ++i) {
			if (used.contains(i) != true) {
				used.add(i);
				step += 1;
				str += i;
				f(n, step, str, used);
				step -= 1;
				str = str.substring(0, str.length() - 1);
				used.removeElement(i);
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i <= 5; ++i) {
			Vector<Integer> used = new Vector<Integer>();
			f(i, 1, "", used);
		}
	}

}
