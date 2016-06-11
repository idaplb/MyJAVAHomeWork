package test_0;

import java.util.Scanner;

class Student {
	String No;
	String Name;
	double MathGrade;
	double EnglishGrade;
	double ComputerGrade;

	public Student() {
		Scanner Cin = new Scanner(System.in);
		System.out.println("请输入学生的学号：");
		No = Cin.nextLine();
		System.out.println("请输入学生的姓名：");
		Name = Cin.nextLine();
		System.out.println("请输入学生的数学成绩：");
		MathGrade = Cin.nextDouble();
		System.out.println("请输入学生的英语成绩：");
		EnglishGrade = Cin.nextDouble();
		System.out.println("请输入学生的计算机成绩：");
		ComputerGrade = Cin.nextDouble();
		Cin.close();
		System.out.println("已创建学生对象。");
		showDetails();
	}

	public void showDetails() {
		System.out.println("学号：" + No + " 姓名：" + Name + " 数学："
				+ MathGrade + " 英语：" + EnglishGrade + " 计算机：" + ComputerGrade);
	}

	public void showAllGrade() {
		System.out.println("总分：" + (MathGrade + EnglishGrade + ComputerGrade));
	}

	public void showAverageGrade() {
		System.out.println("平均分：" + ((MathGrade + EnglishGrade + ComputerGrade) / 3));
	}

	public void showMaxGrade() {
		double Max = -1;
		if (MathGrade > Max) {
			Max = MathGrade;
		}
		if (EnglishGrade > Max) {
			Max = EnglishGrade;
		}
		if (ComputerGrade > Max) {
			Max = ComputerGrade;
		}
		System.out.println("最高分：" + Max);
	}

	public void showMinGrade() {
		double Min = 1000;
		if (MathGrade < Min) {
			Min = MathGrade;
		}
		if (EnglishGrade < Min) {
			Min = EnglishGrade;
		}
		if (ComputerGrade < Min) {
			Min = ComputerGrade;
		}
		System.out.println("最低分：" + Min);
	}

}

public class Test_1 {

	public static void main(String Args[]) {
		Student Stu = new Student();
		Stu.showAllGrade();
		Stu.showAverageGrade();
		Stu.showMaxGrade();
		Stu.showMinGrade();
	}
}
