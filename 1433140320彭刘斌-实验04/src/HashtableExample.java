import java.util.Hashtable;
import java.util.Iterator;
public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();	//创建Hashtable对象
		print("创建了Hashtable对象之后", hs);
		hs.put(2004, "雅典");	//往Hashtable对象hs中添加<2004, "雅典">
		hs.put(2008, "北京");	//往Hashtable对象hs中添加<2008, "北京">
		hs.put(2012, "伦敦");	//往Hashtable对象hs中添加<2012, "伦敦">
		hs.put(2016, "里约热内卢");	//往Hashtable对象hs中添加<2016, "里约热内卢">
		print("在添加了一系列键值对之后", hs);
		int year=2008;
		if(hs.containsKey(year)){	//判断Hashtable对象hs中是否含有指定的year键
			System.out.println("哈希表中包含"+year+"年奥运会，举办地为"+hs.get(year));
		}else{
			System.out.println("哈希表中不包含"+year+"年奥运会");
		}
		year=2000;
		if(hs.containsKey(year)){	//判断Hashtable对象hs中是否含有指定的year键
			System.out.println("哈希表中包含"+year+"年奥运会，举办地为"+hs.get(year));
		}else{
			System.out.println("哈希表中不包含"+year+"年奥运会");
		}
		hs.remove(2004);	//从Hashtable对象hs中删除2004年奥运会
		print("在删除了指定键值对之后", hs);
		hs.clear();	//将Hashtable对象hs清空
		print("在清空哈希表对象之后", hs);
	}
	//print方法负责输出提示信息info，并输出Hashtable对象变量hs的内容、长度和容量
	public static void print(String info, Hashtable<Integer, String> hs){
		System.out.print(info);
		System.out.print("，哈希表对象hs的长度为"+hs.size());
//		System.out.println("，内容为：" + hs.toString());
		System.out.print("，内容为：");
		if(hs.isEmpty()){
			System.out.println("空");
		}else{
			Iterator<Integer> iter = hs.keySet().iterator();
			while(iter.hasNext()){
				int year = iter.next();
				String city = hs.get(year);
				System.out.print("<"+year+","+city+"> ");
			}
			System.out.println();
		}
	}
}