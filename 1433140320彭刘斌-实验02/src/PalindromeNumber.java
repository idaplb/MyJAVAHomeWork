import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		int number, d5, d4, d3, d2, d1;
		Scanner objScanner = new Scanner(System.in);
		System.out.println("����һ��1��99999֮�������");
		number=objScanner.nextInt();
		if(number >= 1 && number <= 99999) {	//�ж�number��1��99999֮������� 
			//����number�����λ����λ��d5
			d5 = number / 10000;
			//����number��ǧλd4
			d4 = number / 1000 % 10;
			//����number�İ�λd3
			d3 = number / 100 % 10;
			d2=number%100/10;
			d1=number%10;
			if(d5 > 0) {	//�ж�number��5λ��������
				System.out.println(number+"��5λ��");
				if(d5 == d1 && d2 == d4) {	//�ж�number�ǻ�����������
					System.out.println(number+"�ǻ�����");
				} else { 
					System.out.println(number+"���ǻ�����");
				}
			} else if(d4 > 0) {	//�ж�number��4λ��������
				System.out.println(number+"��4λ��");
				if(d1 == d4 && d2 == d3) {	//�ж�number�ǻ�������������
					System.out.println(number+"�ǻ�����");
				} else { 
					System.out.println(number+"���ǻ�����");
				}
			} else if(d3 > 0) {	//�ж�number��3λ��������
				System.out.println(number+"��3λ��");
				if(d3 == d1) {	//�ж�number�ǻ�����������
					System.out.println(number+"�ǻ�����");
				} else {
					System.out.println(number+"���ǻ�����");
				}
			} else if(d2!=0) {
				System.out.println(number+"��2λ��");
				if(d1==d2) {
					System.out.println(number+"�ǻ�����");
				} else { 
					System.out.println(number+"���ǻ�����");
				}
			} else if(d1!=0) {
				System.out.println(number+"��1λ��");
				System.out.println(number+"�ǻ�����");
			}
		} else {
			System.out.println(number+"����1��99999֮��");
		}
		objScanner.close();
	}
}