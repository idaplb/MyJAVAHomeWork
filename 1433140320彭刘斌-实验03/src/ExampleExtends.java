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
	
	//重写父类的sayHello()方法，要求输出类似“你好”这样的汉语信息
	public void sayHello() {
		System.out.println("你好");
	}
	//重写父类的averageHeight()方法，要求输出类似“中国人的平均身高：168.78厘米”这样的汉语信息
	public void averageHeight()	{
		height=168.78;
		System.out.println("中国人的平均身高: "+ height + "厘米");
	}
	//重写父类的averageWeight()方法，要求输出类似“中国人的平均体重：61.25公斤”这样的汉语信息
	public void averageWeight()	{
		weight=61.25;
		System.out.println("中国人的平均体重: "+ weight + "公斤");
	}
	public void chineseKungfu() {
		//输出中国武术的信息，例如："坐如钟,站如松,睡如弓"等
		System.out.println("坐如钟,站如松,睡如弓");
	}
}

class AmericanPeople extends People {

	public AmericanPeople() {
		this.weight = 75.86;
		this.height = 178.23;
	}
	
	//重写父类的sayHello()方法，要求输出类似“How do you do”这样的英语信息。
	public void sayHello() {
		System.out.println("How do you do");
	}
	//重写父类的averageHeight()方法，要求输出类似“The average height of Americans:178.23cm”这样的英语信息
	public void averageHeight()	{
		height=178.23;
		System.out.println("The average height of Americans: "+ height + "cm");
	}
	//重写averageWeight()方法，要求输出类似“The average weight of Americans:75.86kg”这样的英语信息
	public void averageWeight()	{
		weight=75.86;
		System.out.println("The average weight of Americans: "+ weight + "kg");
	}
	public void americanBasketball() {
		//输出美国篮球的信息，例如：“I love this game”等
		System.out.println("I love this game");
	}
}

class BeijingPeople extends ChinesePeople {
	
	public BeijingPeople() {
		this.weight = 67.34;
		this.height = 172.5;
	}
	
	//重写父类的sayHello()方法，要求输出类似“吃了吗”这样的汉语信息
	public void sayHello() {
		System.out.println("吃了吗");
	}
	//重写父类的averageHeight()方法，要求输出类似“北京人的平均身高：172.5厘米”这样的汉语信息
	public void averageHeight()	{
		height=172.5;
		System.out.println("北京人的平均身高：" + height + "厘米");
	}
	//重写父类的averageWeight()方法，要求输出类似“北京人的平均体重：67.34公斤”这样的汉语信息
	public void averageWeight()	{
		weight=67.34;
		System.out.println("北京人的平均体重: "+ weight + "公斤");
	}
	public void beijingOpera() {
		//输出京剧的信息，例如“京剧是中国国粹”等
		System.out.println("京剧是中国国粹");
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
