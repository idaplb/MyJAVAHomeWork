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
		System.out.println("������ѧ����ѧ�ţ�");
		No = Cin.nextLine();
		System.out.println("������ѧ����������");
		Name = Cin.nextLine();
		System.out.println("������ѧ������ѧ�ɼ���");
		MathGrade = Cin.nextDouble();
		System.out.println("������ѧ����Ӣ��ɼ���");
		EnglishGrade = Cin.nextDouble();
		System.out.println("������ѧ���ļ�����ɼ���");
		ComputerGrade = Cin.nextDouble();
		Cin.close();
		System.out.println("�Ѵ���ѧ������");
		showDetails();
	}

	public void showDetails() {
		System.out.println("ѧ�ţ�" + No + " ������" + Name + " ��ѧ��"
				+ MathGrade + " Ӣ�" + EnglishGrade + " �������" + ComputerGrade);
	}

	public void showAllGrade() {
		System.out.println("�ܷ֣�" + (MathGrade + EnglishGrade + ComputerGrade));
	}

	public void showAverageGrade() {
		System.out.println("ƽ���֣�" + ((MathGrade + EnglishGrade + ComputerGrade) / 3));
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
		System.out.println("��߷֣�" + Max);
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
		System.out.println("��ͷ֣�" + Min);
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
