package goodsWeight;

public class Car {
	IWeigh[] goods;
	double totalWeight=0;
	public Car(IWeigh[] goods) {
		this.goods=goods;
	}
	public double getTotalWeight() {
		totalWeight=0;
		//��forѭ������totalWeight
		for (IWeigh weight : goods) {
			totalWeight += weight.getWeigh();
		}
		return totalWeight;
	}
}