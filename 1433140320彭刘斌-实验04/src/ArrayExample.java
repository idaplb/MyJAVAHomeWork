
public class ArrayExample {
	public static void main(String[] args) {
		int[] a = new int[10];	//创建一个长度为10的一维整型数组
		for(int i=0; i<a.length; i++){  //for (int i = 0; i <= a.length; ++i) { //会出现数组越界的错误
			a[i] = (int)(Math.random() * 100 + 0.9);	//为数组元素赋予一个[0,100]之间的随机整数值
		}
		
		//[x, y] x + (int)(Math.random() * y + 0.9)
		
		System.out.println("原始数组");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n");		
		int temp;
		//对数组a进行冒泡升序排序
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
 		
		System.out.println("升序排序后数组");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n");
	}
}