abstract class Persons {
	private String name;
	private int age;
	public Persons(String name,int age) {
		//对成员域name和age赋值
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
		//调用父类的构造方法来完成name和age的赋值
		super(name, age);
		this.school = school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
	//实现父类抽象方法getInfo，返回类似“姓名：张三；年龄：18；学校：乐山师范学院”的字符串
	
	public String getInfo() {
		return "姓名: " + super.getName() + "; 年龄: " + super.getAge() + "; 学校: " + this.getSchool();
	}

	//编译器报出这样的错：The type Students must implement the inherited abstract method Persons.getInfo()
	
	//即：子类必须将父类的抽象方法实现，但如果子类是抽象的就可以不用实现父类的抽象方法

}
public class ExampleAbstract {
	public static void main(String args[]){
		Students stu = new Students("张三",18,"乐山师范学院");
		System.out.println(stu.getInfo());
		
		//Persons per = new Persons("xx", 20);  不能实例化Persons对象，因为Persons具有抽象（abstract）属性
	}
}