import java.util.Hashtable;
import java.util.Iterator;
public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();	//����Hashtable����
		print("������Hashtable����֮��", hs);
		hs.put(2004, "�ŵ�");	//��Hashtable����hs�����<2004, "�ŵ�">
		hs.put(2008, "����");	//��Hashtable����hs�����<2008, "����">
		hs.put(2012, "�׶�");	//��Hashtable����hs�����<2012, "�׶�">
		hs.put(2016, "��Լ����¬");	//��Hashtable����hs�����<2016, "��Լ����¬">
		print("�������һϵ�м�ֵ��֮��", hs);
		int year=2008;
		if(hs.containsKey(year)){	//�ж�Hashtable����hs���Ƿ���ָ����year��
			System.out.println("��ϣ���а���"+year+"����˻ᣬ�ٰ��Ϊ"+hs.get(year));
		}else{
			System.out.println("��ϣ���в�����"+year+"����˻�");
		}
		year=2000;
		if(hs.containsKey(year)){	//�ж�Hashtable����hs���Ƿ���ָ����year��
			System.out.println("��ϣ���а���"+year+"����˻ᣬ�ٰ��Ϊ"+hs.get(year));
		}else{
			System.out.println("��ϣ���в�����"+year+"����˻�");
		}
		hs.remove(2004);	//��Hashtable����hs��ɾ��2004����˻�
		print("��ɾ����ָ����ֵ��֮��", hs);
		hs.clear();	//��Hashtable����hs���
		print("����չ�ϣ�����֮��", hs);
	}
	//print�������������ʾ��Ϣinfo�������Hashtable�������hs�����ݡ����Ⱥ�����
	public static void print(String info, Hashtable<Integer, String> hs){
		System.out.print(info);
		System.out.print("����ϣ�����hs�ĳ���Ϊ"+hs.size());
//		System.out.println("������Ϊ��" + hs.toString());
		System.out.print("������Ϊ��");
		if(hs.isEmpty()){
			System.out.println("��");
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