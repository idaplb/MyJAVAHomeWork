
public class ArrayExample {
	public static void main(String[] args) {
		int[] a = new int[10];	//����һ������Ϊ10��һά��������
		for(int i=0; i<a.length; i++){  //for (int i = 0; i <= a.length; ++i) { //���������Խ��Ĵ���
			a[i] = (int)(Math.random() * 100 + 0.9);	//Ϊ����Ԫ�ظ���һ��[0,100]֮����������ֵ
		}
		
		//[x, y] x + (int)(Math.random() * y + 0.9)
		
		System.out.println("ԭʼ����");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n");		
		int temp;
		//������a����ð����������
 		for (int i = 0; i < a.length; ++i) {
 			for (int j = 0; j < a.length - 1 - i; ++j) {
 				if (a[j] > a[j + 1]) { // if(a[j] < a[j + 1]) {
 					temp = a[j];
 					a[j] = a[j + 1];
 					a[j + 1] = temp;
 				}
 			}
 		}
 		
 		//Arrays.sort(a);
 		
		System.out.println("�������������");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n");
	}
}