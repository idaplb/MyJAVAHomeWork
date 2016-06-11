package test_0;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Vector;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = cin.nextInt();
		
		GregorianCalendar myCalendar = new GregorianCalendar();
		myCalendar.set(year, 0, 1);
		Vector<String> vs = new Vector<String>();
		for (int i = 0; i < 12; ++i) {
			System.out.println(year + "年" + (i + 1) + "月");
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			int weekDay = myCalendar.get(Calendar.DAY_OF_WEEK);
			for (int l = Calendar.SUNDAY; l < weekDay; ++l) {
				System.out.print("\t");
			}
			int j = 1;
			do {
				if (weekDay != 1 && j % 10 == weekDay - 1) {
					vs.add((myCalendar.get(Calendar.MONTH) + 1) + "." + j + ", 星期" + (weekDay - 1));
				}
				if (weekDay == 1 && j % 10 == 7) {
					vs.add((myCalendar.get(Calendar.MONTH) + 1) + "." + j + ", 星期" + 7);
				}
				System.out.print(j + "\t");
				if (weekDay == Calendar.SATURDAY) {
					System.out.println();
				}
				myCalendar.add(Calendar.DAY_OF_MONTH, 1);
				weekDay = myCalendar.get(Calendar.DAY_OF_WEEK);
				++j;
			} while(myCalendar.get(Calendar.MONTH) == i);
			
			myCalendar.set(myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), 1);
			System.out.println();
			System.out.println("|**************************************************|\n");
		}
		int cnt = 0;
		for (String str : vs) {
			System.out.print("(" + str + ")");
			++cnt;
			if (cnt % 5 == 0) {
				System.out.println();
			}
		}

		cin.close();
	}

}
