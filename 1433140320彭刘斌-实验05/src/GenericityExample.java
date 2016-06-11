class GenericityType <T> {
    private T object;
    public GenericityType(T object) {
        this.object = object;
    }
    public T getObj() {
        return object;
    }

    public String getClassType() {
		return object.getClass().toString();
	}
}

public class GenericityExample {
	public static void main(String[] args) {
		GenericityType<Integer> i = new GenericityType<Integer>(2);
		GenericityType<String> s = new GenericityType<String>("ok");
		Integer obj1=i.getObj();
		//Integer obj2=s.getObj(); // 编译器会提示该错误：cannot convert from String to Integer
		String obj2 = s.getObj();
		System.out.println("i.object=" + obj1 + "\n i.Class: " + i.getClassType());
		System.out.println("s.object=" + obj2 + "\n s.Class: " + s.getClassType());
	}
}