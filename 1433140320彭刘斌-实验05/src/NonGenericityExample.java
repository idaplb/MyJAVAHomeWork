class GeneralType {
	private Object object;
	public GeneralType(Object object) {
		this.object = object;
	}
	public Object getObj() {
		return object;
	}
	
	public String getClassType() {
		return object.getClass().toString();
	}
}

public class NonGenericityExample {
	public static void main(String[] args) {
		GeneralType i = new GeneralType(2);
		GeneralType s = new GeneralType("ok");
		Integer obj1=(Integer)i.getObj();
		//Integer obj2=(Integer)s.getObj(); //此处报错，强制类型转换错误
		String obj2=(String)s.getObj();
		System.out.println("i.object=" + obj1 + "\ni.Class: " + i.getClassType());
		System.out.println("s.object=" + obj2 + "\ns.Class: " + s.getClassType());
	}
}