import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		str = JOptionPane.showInputDialog("������ı���");
		double money = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("������Ϣ��");
		double interest = Double.parseDouble(str);
		str = JOptionPane.showInputDialog("���뿪ʼʱ�����ݣ�");
		int startYear = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("���뿪ʼʱ����·ݣ�");
		int startMonth = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("���뿪ʼʱ������ڣ�");
		int startDay = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("�������ʱ�����ݣ�");
		int endYear = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("�������ʱ����·ݣ�");
		int endMonth = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("�������ʱ������ڣ�");
		int endDay = Integer.parseInt(str);
		
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(startYear, startMonth, startDay);
		long startTime = myCalendar.getTimeInMillis();
		myCalendar.set(endYear, endMonth, endDay);
		long endTime = myCalendar.getTimeInMillis();
		
		long day = Math.abs(endTime - startTime) / 1000 / 24 / 60 / 60;
		double interestMoney = day * money * interest / 100;
		System.out.println(day + " ��֮�����Ϣ�� " + interestMoney);
	}

}
