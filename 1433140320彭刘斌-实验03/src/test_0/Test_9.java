package test_0;

interface ISayLove {
	
	public void printLove();
}

class Chinese implements ISayLove{
	
	public void printLove() {
		System.out.println("∞Æ");
	}
}

class English implements ISayLove{
	
	public void printLove() {
		System.out.println("Love");
	}
}

class Japanese implements ISayLove{
	
	public void printLove() {
		System.out.println("ê€");
	}
}

public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chinese objChinese = new Chinese();
		English objEnglish = new English();
		Japanese objJapanese = new Japanese();
		
		objChinese.printLove();
		objEnglish.printLove();
		objJapanese.printLove();

	}

}
