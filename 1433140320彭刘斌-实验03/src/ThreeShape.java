class Triangle {
	private double sideA , sideB , sideC , area , length;
	private boolean isCorrect;

	public Triangle(double a,double b,double c)	{
		//参数a,b,c分别赋值给sideA,sideB,sideC
		sideA = a;
		sideB = b;
		sideC = c;
		if(Math.abs(a - b) < c && a + b > c) { //a,b,c构成三角形的条件表达式
			isCorrect = true;	//给isCorrect赋值
		} else {
			isCorrect = false;	//给isCorrect赋值
		}
	}
	public double getLength() {
		//方法体，要求计算出length的值并返回
		return length = sideA + sideB + sideC;
	}
	public double getArea() {
		if(isCorrect) {
			double p=(sideA+sideB+sideC)/2.0;
			area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			return area;
		}else{
			System.out.println("不是一个三角形,不能计算面积");
			return 0;
		}
	}
	public void setABC(double a,double b,double c) {
		//参数a,b,c分别赋值给sideA,sideB,sideC
		sideA = a;
		sideB = b;
		sideC = c;
		if(Math.abs(a - b) < c && a + b > c) { //a,b,c构成三角形的条件表达式
			isCorrect = true;	//给isCorrect赋值
		} else {
			isCorrect = false;	//给isCorrect赋值
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
			System.out.println("这不是一个三角形");
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
		//方法体，将参数a,b,h分别赋值给above,bottom,height
		above = a;
		bottom = b;
		height = h;
	}
	public double getArea() {
		//方法体，要求计算出area返回
		return area = (above + bottom) * height / 2;
	}
}

class Circle {
	private double radius,area,length;

	public Circle(double r) {
		//方法体
		radius = r;
	}
	public double getArea() {
		//方法体，要求计算出area返回
		return area = Math.PI * radius * radius;
	}
	public double getLength() {
		//方法体,要求计算出length返回
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

		objCircle = new Circle(10);	//创建对象objCircle  此处无法省略,因为objCircle没有初始化，不是一个实例对象
		objTriangle = new Triangle(3, 4, 5);	//创建对象objTriangle
		objTrapezoid = new Trapezoid(10, 20, 5);	//创建对象objTrapezoid

		length = objCircle.getLength();	//objCircle调用方法返回周长并赋值给length
		System.out.println("圆的周长:"+length);
		area = objCircle.getArea();	//objCircle调用方法返回面积并赋值给area
		System.out.println("圆的面积:"+area);

		length = objTriangle.getLength();	//objTriangle调用方法返回周长并赋值给length
		System.out.println("三角形的周长:"+length);
		area = objTriangle.getArea();	//objTriangle调用方法返回面积并赋值给area
		System.out.println("三角形的面积:"+area);

		area = objTrapezoid.getArea();	//objTrapezoid调用方法返回面积并赋值给area
		System.out.println("梯形的面积:"+area);

		objTriangle.setABC(1, 2, 3);	//objTriangle调用方法设置三个边，要求将三个边修改为1,2,3
		System.out.println("三角形的三条边已经更改为1,2,3");
		area = objTriangle.getArea();	//objTriangle调用方法返回面积并赋值给area
		System.out.println("三角形的面积:"+area);
		length = objTriangle.getLength();	//objTriangle调用方法返回周长并赋值给length
		System.out.println("三角形的周长:"+length);

		System.out.println("三角形的边 A 为 " + objTriangle.getSideA());
		System.out.println("三角形的边 B 为 " + objTriangle.getSideB());
		System.out.println("三角形的边 C 为 " + objTriangle.getSideC());

		if (objTriangle.isIsosceles()) {
			System.out.println("此三角形是等腰三角形");
		}
		else if (objTriangle.getIsCorrect()){
			System.out.println("此三角形不是等腰三角形");
		}
		
		objCircle.setRadius(100);
		System.out.println("三角形的三条边已经更改为 " + objCircle.getRadius());
		length = objCircle.getLength();	//objCircle调用方法返回周长并赋值给length
		System.out.println("圆的周长:"+length);
		area = objCircle.getArea();	//objCircle调用方法返回面积并赋值给area
		System.out.println("圆的面积:"+area);
	}
}