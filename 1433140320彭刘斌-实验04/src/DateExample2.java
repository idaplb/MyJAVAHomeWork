import java.util.*;
import javax.swing.JOptionPane;
public class DateExample2 {
	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog("�����һ�����ڵ����:");
		int yearOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("���������·�:");
		int monthOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("������·ݵ�����:");
		int dayOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("��������ʱ:");
		int hourOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("�������ķ�:");
		int minuteOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("����������:");
		int secondOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("����ڶ������ڵ����:");
		int yearTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("���������·�:");
		int monthTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("������·ݵ�����:");
		int dayTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("��������ʱ:");
		int hourTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("�������ķ�:");
		int minuteTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("����������:");
		int secondTwo=Integer.parseInt(str);
		System.out.println("������ĵ�һ������Ϊ��" + yearOne + "��" + monthOne + "��" + dayOne + "��"
		+ hourOne + "ʱ" + minuteOne + "��" + secondOne + "��");
		System.out.println("������ĵ�һ������Ϊ��" + yearTwo + "��" + monthTwo + "��" + dayTwo + "��"
		+ hourTwo + "ʱ" + minuteTwo + "��" + secondTwo + "��");
		Calendar myCalendar = Calendar.getInstance();	//�����������
		myCalendar.set(yearOne, monthOne, dayOne, hourOne, minuteOne, secondOne);	//��myCalendar��ʱ������ΪyearOne��monthOne��dayOne��
		long timeOne = myCalendar.getTimeInMillis();	//myCalendar��ʾ��ʱ��ת���ɺ���
		myCalendar.set(yearTwo, monthTwo, dayTwo, hourTwo, minuteTwo, secondTwo);	//��myCalendar��ʱ������ΪyearTwo��monthTwo��dayTwo��
		long timeTwo = myCalendar.getTimeInMillis();	//myCalendar��ʾ��ʱ��ת���ɺ��롣
		Date date1 = new Date(timeOne);	// ��timeOne����������date1
		Date date2 = new Date(timeTwo);	// ��timeTwo����������date2
		if(date2.after(date1)) {
			System.out.println("������ĵڶ������ڴ��ڵ�һ������");
		}else if(date2.before(date1)) {
			System.out.println("������ĵڶ�������С�ڵ�һ������");
		}else {
			System.out.println("�������ڵ��ꡢ�¡�����ȫ��ͬ");
		}
		long days = Math.abs(timeOne - timeTwo) / 1000 / 24 / 60 / 60;	//�������������������
		System.out.println("�����������"+days+"��");
	}
}