public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer obj;
		obj=new StringBuffer("How are you.");
		print("在创建了StringBuffer对象之后", obj);
		obj.trimToSize();
		print("在压缩容量之后", obj);
		obj.ensureCapacity(20);
		print("在重新调整容量之后", obj);
		obj.setLength(20);
		print("在设置长度之后", obj);
		obj.setLength(12);
		print("再次设置长度之后", obj);
		obj.setCharAt(11, '?');
		print("在修改了指定位置的字符之后", obj);
		obj.reverse();
		print("在反转之后", obj);
		obj.reverse();
		print("再次反转之后", obj);
		obj.append("And you?");
		print("在追加了指定内容之后", obj);
		obj.insert(obj.indexOf("?")+1, "Not bad!");
		print("在指定位置插入了内容之后", obj);
		obj.delete(12, 19);
		print("在删除了指定区域的内容之后", obj);
		obj.deleteCharAt(12);
		print("在删除了指定位置的字符之后", obj);
		obj.replace(12, 20, "I am fine!");
		print("在替换了指定区域的内容之后", obj);
	}
	
	//print方法负责输出提示信息info，并输出StringBuffer对象变量obj的内容、长度和容量
	public static void print(String info, StringBuffer obj){
		System.out.println(info);
		System.out.print("，字符串缓冲区的内容为\""+obj.toString()+"\"");
		System.out.print("，长度为"+obj.length());
		System.out.println("，容量为"+obj.capacity());
	}
}