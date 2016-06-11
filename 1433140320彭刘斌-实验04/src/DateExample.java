import java.util.*;
import javax.swing.JOptionPane;
public class DateExample {
	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog("输入第一个日期的年份:");
		int yearOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("输入该年的月份:");
		int monthOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("输入该月份的日期:");
		int dayOne=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("输入第二个日期的年份:");
		int yearTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("输入该年的月份:");
		int monthTwo=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("输入该月份的日期:");
		int dayTwo=Integer.parseInt(str);
		System.out.println("您输入的第一个日期为："+yearOne+"年"+monthOne+"月"+dayOne+"日");
		System.out.println("您输入的第二个日期为："+yearTwo+"年"+monthTwo+"月"+dayTwo+"日");
		Calendar myCalendar = Calendar.getInstance();	//获得日历对象
		myCalendar.set(yearOne, monthOne, dayOne);	//将myCalendar的时间设置为yearOne年monthOne月dayOne日
		long timeOne = myCalendar.getTimeInMillis();	//myCalendar表示的时间转换成毫秒
		myCalendar.set(yearTwo, monthTwo, dayTwo);	//将myCalendar的时间设置为yearTwo年monthTwo月dayTwo日
		long timeTwo = myCalendar.getTimeInMillis();	//myCalendar表示的时间转换成毫秒。
		Date date1 = new Date(timeOne);	// 用timeOne做参数构造date1
		Date date2 = new Date(timeTwo);	// 用timeTwo做参数构造date2
		if(date2.after(date1)) {
			System.out.println("您输入的第二个日期大于第一个日期");
		}else if(date2.before(date1)) {
			System.out.println("您输入的第二个日期小于第一个日期");
		}else {
			System.out.println("两个日期的年、月、日完全相同");
		}
		long days = Math.abs(timeOne - timeTwo) / 1000 / 24 / 60 / 60;	//计算两个日期相隔天数
		System.out.println("两个日期相隔"+days+"天");
	}
}