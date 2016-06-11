package lstc.jkx;

public class SquareEquation {
	double a,b,c;
	double root1,root2;
	boolean flag;
	public SquareEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		if(a!=0) {
			flag=true;
		}else{
			flag=false;
		}
	}
	public void getRoots()	{
		if(flag) {
			System.out.print("是一元二次方程，");
			double delta=b*b-4*a*c;
			if(delta>=0) {
				root1=(-b+Math.sqrt(delta))/(2*a);
				root2=(-b-Math.sqrt(delta))/(2*a);
				System.out.printf("方程的根:%.2f,%.2f\n",root1,root2);
			}else{
				System.out.printf("方程没有实根\n");
			}
		}else{
			System.out.println("不是一元二次方程");
		}
	}
	public void setCoefficient(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		if(a!=0) {
			flag=true;
		}else{
			flag=false;
		}
	}
}