package goodsWeight;

public class ExampleInterface {
	public static void main(String args[]) {
		IWeigh[] goods1=new IWeigh[50] , goods2=new IWeigh[22];
		for(int i=0;i<goods1.length;i++) {
			if(i%3==0)
				goods1[i]=new Television();
			else if(i%3==1)
				goods1[i]=new Computer();
			else if(i%3==2)
				goods1[i]=new WashingMachine();
		}
		for(int i=0;i<goods2.length;i++) {
			if(i%3==0)
				goods2[i]=new Television();
			else if(i%3==1)
				goods2[i]=new Computer();
			else if(i%3==2)
				goods2[i]=new WashingMachine();
		}
		Car bigCar=new Car(goods1);
		System.out.printf("�����װ�صĻ�������:%.1f����\n" ,bigCar.getTotalWeight());
		Car smallCar=new Car(goods2);
		System.out.printf("С����װ�صĻ�������:%.1f����\n" , smallCar.getTotalWeight());
	}
}