class Person {
	String name="张经理";
	public void print(){
		System.out.println("这是父类Person的print方法");
	}
}
class Student extends Person {
	String name="李同学";
	public void print() {
		System.out.println("父类中的name值：" + super.name);
		System.out.println("子类中的name值：" + this.name);
		System.out.println("去掉this后的name值：" + name);
		super.print();
		//print();  这使得print函数无限调用自身，形成死递归
		System.out.println("这是子类Student的print方法");
	}
}
public class ExampleThisSuper {
	public static void main(String[] args) {
		Student objStu = new Student();
		objStu.print();
	}
}