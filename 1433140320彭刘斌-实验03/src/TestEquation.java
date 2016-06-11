
//import lstc.*; // 无法从当前包中找到SquareEquation类

import lstc.jkx.SquareEquation; // 这是直接导入此类

class TestEquation {
	public static void main(String args[ ]) {
		SquareEquation equation=new SquareEquation(4,5,1);
		equation.getRoots();
		equation.setCoefficient(-3,4,5);
		equation.getRoots();
	}
}