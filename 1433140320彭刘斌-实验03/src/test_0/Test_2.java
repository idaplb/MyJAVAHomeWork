package test_0;

import java.util.Scanner;

class ChangeNumber {

	int Num;

	public ChangeNumber() {
		Scanner Cin = new Scanner(System.in);
		System.out.println("������һ��ʮ��������");
		Num = Cin.nextInt(); 
		Cin.close();
	}

	void changeToBinary() {
		System.out.println("("+ Num + ")�Ķ����Ʊ�ʾΪ��" + Integer.toBinaryString(Num));
	}

	void changeToOctal(){
		System.out.println("("+ Num + ")�İ˽��Ʊ�ʾΪ��" + Integer.toOctalString(Num));
	}

	void changeToHex() {
		System.out.println("("+ Num + ")��ʮ�����Ʊ�ʾΪ��" + Integer.toHexString(Num));
	}

}

public class Test_2 {

	public static void main(String Args[]) {
		ChangeNumber Number = new ChangeNumber();
		Number.changeToBinary();
		Number.changeToOctal();
		Number.changeToHex();
	}
}