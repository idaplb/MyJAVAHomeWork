package test_0;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

enum MONTH {
	January, February, March, April, May, June,
	July, Auguet, September, October, November, December
}

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("请输入年份");
		int year = Integer.parseInt(str);
		
		System.out.println("你输入的是" + year + "年");
		
		for (MONTH m : MONTH.values()) {
			switch(m) {
			case January   : System.out.println(MONTH.January + ": " + "31");break;
			case February  : System.out.println(MONTH.February + ": "
								+ (new GregorianCalendar().isLeapYear(year) ? "29" : "28"));break;
			case March      : System.out.println(MONTH.March + ": " + "31");break;
			case April      : System.out.println(MONTH.April + ": " + "30");break;
			case May      : System.out.println(MONTH.May + ": " + "31");break;
			case June      : System.out.println(MONTH.June + ": " + "30");break;
			case July      : System.out.println(MONTH.July + ": " + "31");break;
			case Auguet      : System.out.println(MONTH.Auguet + ": " + "31");break;
			case September      : System.out.println(MONTH.September + ": " + "30");break;
			case October      : System.out.println(MONTH.October + ": " + "31");break;
			case November      : System.out.println(MONTH.November + ": " + "30");break;
			case December      : System.out.println(MONTH.December + ": " + "31");break;
			}
		}

	}

}
