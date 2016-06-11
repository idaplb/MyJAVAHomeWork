public class DataType {
	public static void main(String[] args) {
		byte b=0x55;
		short s=0x55ff;
		int i=10;
		long l=0xffffL;
		char c='a';
		float f=0.23F;
		double d=0.7E-3;
		boolean B=true;
		String S="这是字符串类数据类型";
		System.out.println("字节型(byte)变量 b = "+b);
		System.out.println("短整型(short)变量 s = "+s);
		System.out.println("整型(int)变量   i = "+i);
		System.out.println("长整型(long)变量 l = "+l);
		System.out.println("字符型(char)变量 c = "+c);
		System.out.println("浮点型(float)变量 f = "+f);
		System.out.println("双精度(double)变量 d = "+d);
		System.out.println("布尔型(boolean)变量 B = "+B);
		System.out.println("字符串类(String)对象 S = "+S);
	}
}