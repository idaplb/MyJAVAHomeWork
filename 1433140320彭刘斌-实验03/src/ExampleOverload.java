public class ExampleOverload {
	public static void main(String args[]) {
		float result1=average(12 , 20);
		//float result1=average(12 , 20.5);  //������average(int, double)�ķ���
		float result2=average(5 , 6 , 15);
		float result3=average(26.35f , -12.84f);
		System.out.println("average(int x,int y)="+result1);
		System.out.println("average(int x,int y,int z)="+result2);
		System.out.println("average(float x,float y)="+result3);
	}
	//����������������ľ�ֵ�ķ���������ԭ��float average(int,int)
	
	public static float average(int a, int b) {
		return (a + b) / 2f;
	}
	
	//����������������ľ�ֵ�ķ���������ԭ��float average(int,int,int)
	public static float average(int a, int b, int c) {
		return (a + b + c) / 3f;
	}

	//�����������С���ľ�ֵ�ķ���������ԭ��float average(float,float)
	public static float average(float a, float b) {
		return (a + b) / 2f;
	}
}