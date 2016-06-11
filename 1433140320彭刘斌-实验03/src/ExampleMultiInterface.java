interface A{
	public static final String NAME="уехЩ";
	public void printA1();
	public void printA2();
}
interface B{
	public void printB();
}
class X implements A,B{
	public void printA1(){
		System.out.println("Hello World!");
	}
	public void printA2(){
//		System.out.println("Hello China!");
	}
	public void printB(){
		System.out.println("Hello "+NAME);
	}	
}
public class ExampleMultiInterface{
	public static void main(String args[]){
		X x=new X();
		x.printA1();
//		x.printA2();
		x.printB();
	}
}
