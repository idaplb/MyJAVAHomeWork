import java.util.Random;
import java.util.Vector;

public class ForExample {
	public static void main(String[] args) {
		Vector<Integer> objVector = new Vector<Integer>();
		Random rnd = new Random();
		for(int i=1; i<=10; i++) {
			objVector.add(rnd.nextInt(1000));
		}
		System.out.println("������������ݣ�");
		for (int x : objVector) {	//��for���ļ�д��ʽ�����������objVector������Ԫ��
			System.out.print(x+"  ");
		}
		
		Object [] objArray =objVector.toArray();
		System.out.println("\n�����������ݣ�");
		for (Object x : objArray){	//��for���ļ�д��ʽ�����������objArray������Ԫ��
			System.out.print(x+"  ");
		}
	}
}