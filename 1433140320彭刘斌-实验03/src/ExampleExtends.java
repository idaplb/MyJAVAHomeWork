class People {
	protected double weight,height;
	public void sayHello() {
		System.out.println("yayawawa");
	}
	public void averageHeight()	{
		height=173;
		System.out.println("average height:"+height);
	}
	public void averageWeight()	{
		weight=70;
		System.out.println("average weight:"+weight);
	}
}

class ChinesePeople extends People {
	
	public ChinesePeople() {
		this.weight = 61.25;
		this.height = 168.78;
	}
	
	//��д�����sayHello()������Ҫ��������ơ���á������ĺ�����Ϣ
	public void sayHello() {
		System.out.println("���");
	}
	//��д�����averageHeight()������Ҫ��������ơ��й��˵�ƽ����ߣ�168.78���ס������ĺ�����Ϣ
	public void averageHeight()	{
		height=168.78;
		System.out.println("�й��˵�ƽ�����: "+ height + "����");
	}
	//��д�����averageWeight()������Ҫ��������ơ��й��˵�ƽ�����أ�61.25��������ĺ�����Ϣ
	public void averageWeight()	{
		weight=61.25;
		System.out.println("�й��˵�ƽ������: "+ weight + "����");
	}
	public void chineseKungfu() {
		//����й���������Ϣ�����磺"������,վ����,˯�繭"��
		System.out.println("������,վ����,˯�繭");
	}
}

class AmericanPeople extends People {

	public AmericanPeople() {
		this.weight = 75.86;
		this.height = 178.23;
	}
	
	//��д�����sayHello()������Ҫ��������ơ�How do you do��������Ӣ����Ϣ��
	public void sayHello() {
		System.out.println("How do you do");
	}
	//��д�����averageHeight()������Ҫ��������ơ�The average height of Americans:178.23cm��������Ӣ����Ϣ
	public void averageHeight()	{
		height=178.23;
		System.out.println("The average height of Americans: "+ height + "cm");
	}
	//��дaverageWeight()������Ҫ��������ơ�The average weight of Americans:75.86kg��������Ӣ����Ϣ
	public void averageWeight()	{
		weight=75.86;
		System.out.println("The average weight of Americans: "+ weight + "kg");
	}
	public void americanBasketball() {
		//��������������Ϣ�����磺��I love this game����
		System.out.println("I love this game");
	}
}

class BeijingPeople extends ChinesePeople {
	
	public BeijingPeople() {
		this.weight = 67.34;
		this.height = 172.5;
	}
	
	//��д�����sayHello()������Ҫ��������ơ������������ĺ�����Ϣ
	public void sayHello() {
		System.out.println("������");
	}
	//��д�����averageHeight()������Ҫ��������ơ������˵�ƽ����ߣ�172.5���ס������ĺ�����Ϣ
	public void averageHeight()	{
		height=172.5;
		System.out.println("�����˵�ƽ����ߣ�" + height + "����");
	}
	//��д�����averageWeight()������Ҫ��������ơ������˵�ƽ�����أ�67.34��������ĺ�����Ϣ
	public void averageWeight()	{
		weight=67.34;
		System.out.println("�����˵�ƽ������: "+ weight + "����");
	}
	public void beijingOpera() {
		//����������Ϣ�����硰�������й����⡱��
		System.out.println("�������й�����");
	}
}
public class ExampleExtends {
	public static void main(String args[]) {
		ChinesePeople objChinesePeople=new ChinesePeople();
		AmericanPeople objAmericanPeople=new AmericanPeople();
		BeijingPeople objBeijingPeople=new BeijingPeople();
		objChinesePeople.sayHello();
		objAmericanPeople.sayHello();
		objBeijingPeople.sayHello();
		objChinesePeople.averageHeight();
		objAmericanPeople.averageHeight();
		objBeijingPeople.averageHeight();
		objChinesePeople.averageWeight();
		objAmericanPeople.averageWeight();
		objBeijingPeople.averageWeight();
		objChinesePeople.chineseKungfu();
		objAmericanPeople.americanBasketball();
		objBeijingPeople.beijingOpera();
		objBeijingPeople.chineseKungfu();
	}
}
