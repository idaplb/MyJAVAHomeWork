import java.util.Random;
import java.util.Vector;

public class ForExample {
	public static void main(String[] args) {
		Vector<Integer> objVector = new Vector<Integer>();
		Random rnd = new Random();
		for(int i=1; i<=10; i++) {
			objVector.add(rnd.nextInt(1000));
		}
		System.out.println("向量对象的内容：");
		for (int x : objVector) {	//用for语句的简写形式遍历输出向量objVector的所有元素
			System.out.print(x+"  ");
		}
		
		Object [] objArray =objVector.toArray();
		System.out.println("\n数组对象的内容：");
		for (Object x : objArray){	//用for语句的简写形式遍历输出数组objArray的所有元素
			System.out.print(x+"  ");
		}
	}
}