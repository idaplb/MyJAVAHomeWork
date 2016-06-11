class MyClass {
	public float a;	//����һ��float��ʵ������a
	public static float b;	//����һ��float�������b,��static����b
	public void setA(float a) {
		this.a = a;	//������a��ֵ��ֵ����Ա����a
	}
	public void setB(float b) {
		MyClass.b = b;	//������b��ֵ��ֵ�������b
	}
	public float getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public void printA() {
		System.out.println("a = " + a);
		System.out.println("a + b = " + (a + b)); // �Ǿ�̬������ֱ�ӷ��ʾ�̬��Ա
	}
	public static void printB() {
		System.out.println("b = " + b);
		//System.out.println("a + b = " + a + b); // ��̬��������ֱ�ӷ��ʷǾ�̬��Ա
	}
}

public class ExampleStatic {
	public static void main(String args[]) {
		MyClass.b = 1;	//ͨ���������������b,����ֵ1
		MyClass.printB();	//ͨ�����������෽��printB()
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		obj1.setA(2);	//obj1���÷���setA��obj1�ĳ�Աa��ֵ����Ϊ2
		obj1.setB(3);	//obj1���÷���setB��obj1�ĳ�Աb��ֵ����Ϊ3
		obj2.setA(4);	//obj2���÷���setA��obj2�ĳ�Աa��ֵ����Ϊ4
		obj2.setB(5);	//obj2���÷���setB��obj2�ĳ�Աb��ֵ����Ϊ5
		obj1.printA();	//obj1����printA()
		obj1.printB();	//obj1����printB()
		obj2.printA();	//obj2����printA()
		obj2.printB();	//obj2����printB()
	}
}