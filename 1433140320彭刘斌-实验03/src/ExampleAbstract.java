abstract class Persons {
	private String name;
	private int age;
	public Persons(String name,int age) {
		//�Գ�Ա��name��age��ֵ
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public abstract String getInfo();
}

//abstract class Students extends Persons {

class Students extends Persons {
	private String school;
	public Students(String name,int age,String school){
		//���ø���Ĺ��췽�������name��age�ĸ�ֵ
		super(name, age);
		this.school = school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
	//ʵ�ָ�����󷽷�getInfo���������ơ����������������䣺18��ѧУ����ɽʦ��ѧԺ�����ַ���
	
	public String getInfo() {
		return "����: " + super.getName() + "; ����: " + super.getAge() + "; ѧУ: " + this.getSchool();
	}

	//���������������Ĵ�The type Students must implement the inherited abstract method Persons.getInfo()
	
	//����������뽫����ĳ��󷽷�ʵ�֣�����������ǳ���ľͿ��Բ���ʵ�ָ���ĳ��󷽷�

}
public class ExampleAbstract {
	public static void main(String args[]){
		Students stu = new Students("����",18,"��ɽʦ��ѧԺ");
		System.out.println(stu.getInfo());
		
		//Persons per = new Persons("xx", 20);  ����ʵ����Persons������ΪPersons���г���abstract������
	}
}