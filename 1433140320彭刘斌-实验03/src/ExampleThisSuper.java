class Person {
	String name="�ž���";
	public void print(){
		System.out.println("���Ǹ���Person��print����");
	}
}
class Student extends Person {
	String name="��ͬѧ";
	public void print() {
		System.out.println("�����е�nameֵ��" + super.name);
		System.out.println("�����е�nameֵ��" + this.name);
		System.out.println("ȥ��this���nameֵ��" + name);
		super.print();
		//print();  ��ʹ��print�������޵��������γ����ݹ�
		System.out.println("��������Student��print����");
	}
}
public class ExampleThisSuper {
	public static void main(String[] args) {
		Student objStu = new Student();
		objStu.print();
	}
}