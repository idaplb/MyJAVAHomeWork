enum GRADE {
	//定义EXCELLENT,QUALIFIED,FAILED这三个枚举常量
	EXCELLENT,QUALIFIED,FAILED
};

public class EnumExample {
	public static void main(String[] args) {
		GRADE [] gd = GRADE.values();
		for (int i=0; i<gd.length; i++) {
			switch(gd[i]) {
			//case "EXCELLENT" :	//会报错 cannot convert from String to GRADE
			case EXCELLENT :	//判断EXCELLENT的情况
				System.out.println("优秀，你表现得很棒！");
				break;
			case QUALIFIED :	//判断QUALIFIED的情况
				System.out.println("及格，你能做的更好！");
				break;
			case FAILED :	//判断FAILED的情况
				System.out.println("不及格，你要加油哦！");
				break;
			}
		}
	}
}
