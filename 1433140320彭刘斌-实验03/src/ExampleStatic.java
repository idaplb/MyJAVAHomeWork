class MyClass {
	public float a;	//声明一个float型实例变量a
	public static float b;	//声明一个float型类变量b,即static变量b
	public void setA(float a) {
		this.a = a;	//将参数a的值赋值给成员变量a
	}
	public void setB(float b) {
		MyClass.b = b;	//将参数b的值赋值给类变量b
	}
	public float getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public void printA() {
		System.out.println("a = " + a);
		System.out.println("a + b = " + (a + b)); // 非静态方法能直接访问静态成员
	}
	public static void printB() {
		System.out.println("b = " + b);
		//System.out.println("a + b = " + a + b); // 静态方法不能直接访问非静态成员
	}
}

public class ExampleStatic {
	public static void main(String args[]) {
		MyClass.b = 1;	//通过类名访问类变量b,并赋值1
		MyClass.printB();	//通过类名调用类方法printB()
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		obj1.setA(2);	//obj1调用方法setA将obj1的成员a的值设置为2
		obj1.setB(3);	//obj1调用方法setB将obj1的成员b的值设置为3
		obj2.setA(4);	//obj2调用方法setA将obj2的成员a的值设置为4
		obj2.setB(5);	//obj2调用方法setB将obj2的成员b的值设置为5
		obj1.printA();	//obj1调用printA()
		obj1.printB();	//obj1调用printB()
		obj2.printA();	//obj2调用printA()
		obj2.printB();	//obj2调用printB()
	}
}