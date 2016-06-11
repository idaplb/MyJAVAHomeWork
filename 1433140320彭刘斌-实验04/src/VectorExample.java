import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vs;
		vs=new Vector<String>();
		print("在创建向量对象之后", vs);
		vs.add("四川省");
		vs.addElement("计科学院");
		vs.add(1, "乐山市");
		vs.insertElementAt("乐山师院", 2);
		print("在添加元素之后", vs);
		vs.set(2, "乐山师范学院");
		vs.setElementAt("计算机科学学院", 3);
		print("在修改元素之后", vs);
		if(vs.contains("乐山市")){
			System.out.println("向量中包含\"乐山市\"，索引为"+vs.indexOf("乐山市"));
		}else{
			System.out.println("向量中不包含\"乐山市\"，索引为"+vs.indexOf("乐山市"));
		}
		if(vs.contains("成都市")){
			System.out.println("向量中包含\"成都市\"，索引为"+vs.indexOf("成都市"));
		}else{
			System.out.println("向量中不包含\"成都市\"，索引为"+vs.indexOf("成都市"));
		}
		System.out.println("向量的首个元素是\""+vs.firstElement()+"\"");
		System.out.println("向量的第2个元素是\""+vs.elementAt(1)+"\"");
		System.out.println("向量的第3个元素是\""+vs.get(2)+"\"");
		System.out.println("向量的末个元素是\""+vs.lastElement()+"\"");
		vs.ensureCapacity(50);
		print("在增加向量容量之后", vs);
		vs.setSize(10);
		print("在增加向量长度之后", vs);
		vs.setSize(4);
		print("在缩短向量长度之后", vs);
		vs.trimToSize();
		print("在压缩向量容量之后", vs);
		vs.remove(2);	//或	vs.removeElementAt(2);
		vs.remove("乐山市");	//或	vs.removeElement("乐山市");
		print("在删除两个元素之后", vs);
		vs.clear();	//或	vs.removeAllElements();
		print("在清空向量之后", vs);
		vs.add("hello");
		vs.add("ok");
		vs.add("apple");
		vs.add("yes");
		print("在排序前", vs);
		Collections.sort(vs);
		print("在排序后", vs);
	}
	
	//print方法负责输出提示信息info，并输出Vector对象变量vs的内容、长度和容量
	public static void print(String info, Vector<String> vs){
		System.out.print(info);
		System.out.print("，向量对象的长度为"+vs.size());
		System.out.print("，容量为"+vs.capacity());
//		System.out.println("，内容为：" + vs.toString());
		System.out.print("，内容为：");
		if(vs.isEmpty()){
			System.out.println("空");
		}else{
			Iterator<String> iter = vs.iterator();
			while(iter.hasNext()){
				System.out.print(iter.next()+"  ");
			}
			System.out.println();
		}
	}
}
