class Triangle {
	private double sideA , sideB , sideC , area , length;
	private boolean isCorrect;

	public Triangle(double a,double b,double c)	{
		//����a,b,c�ֱ�ֵ��sideA,sideB,sideC
		sideA = a;
		sideB = b;
		sideC = c;
		if(Math.abs(a - b) < c && a + b > c) { //a,b,c���������ε��������ʽ
			isCorrect = true;	//��isCorrect��ֵ
		} else {
			isCorrect = false;	//��isCorrect��ֵ
		}
	}
	public double getLength() {
		//�����壬Ҫ������length��ֵ������
		return length = sideA + sideB + sideC;
	}
	public double getArea() {
		if(isCorrect) {
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			return area;
		}else{
			System.out.println("����һ��������,���ܼ������");
			return 0;
		}
	}
	public void setABC(double a,double b,double c) {
		//����a,b,c�ֱ�ֵ��sideA,sideB,sideC
		sideA = a;
		sideB = b;
		sideC = c;
		if(Math.abs(a - b) < c && a + b > c) { //a,b,c���������ε��������ʽ
			isCorrect = true;	//��isCorrect��ֵ
		} else {
			isCorrect = false;	//��isCorrect��ֵ
		}
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public boolean isIsosceles() {
		if (!isCorrect) {
			System.out.println("�ⲻ��һ��������");
			return false;
		}
		if (sideA == sideB || sideB == sideC || sideA == sideC) {
			return true;
		}
		return false;
	}
	public boolean getIsCorrect() {
		return isCorrect;
	}
}

class Trapezoid {
	private double above,bottom,height,area;

	public Trapezoid(double a,double b,double h) {
		//�����壬������a,b,h�ֱ�ֵ��above,bottom,height
		above = a;
		bottom = b;
		height = h;
	}
	public double getArea() {
		//�����壬Ҫ������area����
		return area = (above + bottom) * height / 2;
	}
}

class Circle {
	private double radius,area,length;

	public Circle(double r) {
		//������
		radius = r;
	}
	public double getArea() {
		//�����壬Ҫ������area����
		return area = Math.PI * radius * radius;
	}
	public double getLength() {
		//������,Ҫ������length����
		return length = 2 * Math.PI * radius;
	}
	public void setRadius(double newRadius) {
		radius=newRadius;
	}
	public double getRadius() {
		return radius;
	}
}

public class ThreeShape {
	public static void main(String args[]) {
		double length,area;
		Circle objCircle;
		Triangle objTriangle;
		Trapezoid objTrapezoid;

		objCircle = new Circle(10);	//��������objCircle  �˴��޷�ʡ��,��ΪobjCircleû�г�ʼ��������һ��ʵ������
		objTriangle = new Triangle(3, 4, 5);	//��������objTriangle
		objTrapezoid = new Trapezoid(10, 20, 5);	//��������objTrapezoid

		length = objCircle.getLength();	//objCircle���÷��������ܳ�����ֵ��length
		System.out.println("Բ���ܳ�:"+length);
		area = objCircle.getArea();	//objCircle���÷��������������ֵ��area
		System.out.println("Բ�����:"+area);

		length = objTriangle.getLength();	//objTriangle���÷��������ܳ�����ֵ��length
		System.out.println("�����ε��ܳ�:"+length);
		area = objTriangle.getArea();	//objTriangle���÷��������������ֵ��area
		System.out.println("�����ε����:"+area);

		area = objTrapezoid.getArea();	//objTrapezoid���÷��������������ֵ��area
		System.out.println("���ε����:"+area);

		objTriangle.setABC(1, 2, 3);	//objTriangle���÷������������ߣ�Ҫ���������޸�Ϊ1,2,3
		System.out.println("�����ε��������Ѿ�����Ϊ1,2,3");
		area = objTriangle.getArea();	//objTriangle���÷��������������ֵ��area
		System.out.println("�����ε����:"+area);
		length = objTriangle.getLength();	//objTriangle���÷��������ܳ�����ֵ��length
		System.out.println("�����ε��ܳ�:"+length);

		System.out.println("�����εı� A Ϊ " + objTriangle.getSideA());
		System.out.println("�����εı� B Ϊ " + objTriangle.getSideB());
		System.out.println("�����εı� C Ϊ " + objTriangle.getSideC());

		if (objTriangle.isIsosceles()) {
			System.out.println("���������ǵ���������");
		}
		else if (objTriangle.getIsCorrect()){
			System.out.println("�������β��ǵ���������");
		}
		
		objCircle.setRadius(100);
		System.out.println("�����ε��������Ѿ�����Ϊ " + objCircle.getRadius());
		length = objCircle.getLength();	//objCircle���÷��������ܳ�����ֵ��length
		System.out.println("Բ���ܳ�:"+length);
		area = objCircle.getArea();	//objCircle���÷��������������ֵ��area
		System.out.println("Բ�����:"+area);
	}
}