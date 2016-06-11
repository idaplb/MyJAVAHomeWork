import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vs;
		vs=new Vector<String>();
		print("�ڴ�����������֮��", vs);
		vs.add("�Ĵ�ʡ");
		vs.addElement("�ƿ�ѧԺ");
		vs.add(1, "��ɽ��");
		vs.insertElementAt("��ɽʦԺ", 2);
		print("�����Ԫ��֮��", vs);
		vs.set(2, "��ɽʦ��ѧԺ");
		vs.setElementAt("�������ѧѧԺ", 3);
		print("���޸�Ԫ��֮��", vs);
		if(vs.contains("��ɽ��")){
			System.out.println("�����а���\"��ɽ��\"������Ϊ"+vs.indexOf("��ɽ��"));
		}else{
			System.out.println("�����в�����\"��ɽ��\"������Ϊ"+vs.indexOf("��ɽ��"));
		}
		if(vs.contains("�ɶ���")){
			System.out.println("�����а���\"�ɶ���\"������Ϊ"+vs.indexOf("�ɶ���"));
		}else{
			System.out.println("�����в�����\"�ɶ���\"������Ϊ"+vs.indexOf("�ɶ���"));
		}
		System.out.println("�������׸�Ԫ����\""+vs.firstElement()+"\"");
		System.out.println("�����ĵ�2��Ԫ����\""+vs.elementAt(1)+"\"");
		System.out.println("�����ĵ�3��Ԫ����\""+vs.get(2)+"\"");
		System.out.println("������ĩ��Ԫ����\""+vs.lastElement()+"\"");
		vs.ensureCapacity(50);
		print("��������������֮��", vs);
		vs.setSize(10);
		print("��������������֮��", vs);
		vs.setSize(4);
		print("��������������֮��", vs);
		vs.trimToSize();
		print("��ѹ����������֮��", vs);
		vs.remove(2);	//��	vs.removeElementAt(2);
		vs.remove("��ɽ��");	//��	vs.removeElement("��ɽ��");
		print("��ɾ������Ԫ��֮��", vs);
		vs.clear();	//��	vs.removeAllElements();
		print("���������֮��", vs);
		vs.add("hello");
		vs.add("ok");
		vs.add("apple");
		vs.add("yes");
		print("������ǰ", vs);
		Collections.sort(vs);
		print("�������", vs);
	}
	
	//print�������������ʾ��Ϣinfo�������Vector�������vs�����ݡ����Ⱥ�����
	public static void print(String info, Vector<String> vs){
		System.out.print(info);
		System.out.print("����������ĳ���Ϊ"+vs.size());
		System.out.print("������Ϊ"+vs.capacity());
//		System.out.println("������Ϊ��" + vs.toString());
		System.out.print("������Ϊ��");
		if(vs.isEmpty()){
			System.out.println("��");
		}else{
			Iterator<String> iter = vs.iterator();
			while(iter.hasNext()){
				System.out.print(iter.next()+"  ");
			}
			System.out.println();
		}
	}
}
