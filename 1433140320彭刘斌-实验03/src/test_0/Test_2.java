package test_0;

import java.util.Scanner;

class ChangeNumber {

	int Num;

	public ChangeNumber() {
		Scanner Cin = new Scanner(System.in);
		System.out.println("请输入一个十进制数：");
		Num = Cin.nextInt(); 
		Cin.close();
	}

	void changeToBinary() {
		System.out.println("("+ Num + ")的二进制表示为：" + Integer.toBinaryString(Num));
	}

	void changeToOctal(){
		System.out.println("("+ Num + ")的八进制表示为：" + Integer.toOctalString(Num));
	}

	void changeToHex() {
		System.out.println("("+ Num + ")的十六进制表示为：" + Integer.toHexString(Num));
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