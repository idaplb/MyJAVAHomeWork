package test_8;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Cin = new Scanner(System.in);
		
		new TestTriangle(Cin);
		System.out.println();
		
		new TestCircle(Cin);
		System.out.println();
		
		new TestSquare(Cin);
		System.out.println();
		
		new TestRegularPentagon(Cin);
		
		Cin.close();

	}

}
