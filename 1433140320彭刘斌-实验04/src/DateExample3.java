import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		str = JOptionPane.showInputDialog("输入存款的本金：");
		double money = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("输入利息：");
		double interest = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("输入开始时间的年份：");
		int startYear = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入开始时间的月份：");
		int startMonth = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入开始时间的日期：");
		int startDay = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入结束时间的年份：");
		int endYear = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入结束时间的月份：");
		int endMonth = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入结束时间的日期：");
		int endDay = Integer.parseInt(str);
		
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(startYear, startMonth, startDay);
		long startTime = myCalendar.getTimeInMillis();
		myCalendar.set(endYear, endMonth, endDay);
		long endTime = myCalendar.getTimeInMillis();
		
		long day = Math.abs(endTime - startTime) / 1000 / 24 / 60 / 60;
		double interestMoney = day * money * interest / 100;
		System.out.println(day + " 天之后的利息是 " + interestMoney);
	}

}
