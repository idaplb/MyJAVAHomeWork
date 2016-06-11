public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer obj;
		obj=new StringBuffer("How are you.");
		print("�ڴ�����StringBuffer����֮��", obj);
		obj.trimToSize();
		print("��ѹ������֮��", obj);
		obj.ensureCapacity(20);
		print("�����µ�������֮��", obj);
		obj.setLength(20);
		print("�����ó���֮��", obj);
		obj.setLength(12);
		print("�ٴ����ó���֮��", obj);
		obj.setCharAt(11, '?');
		print("���޸���ָ��λ�õ��ַ�֮��", obj);
		obj.reverse();
		print("�ڷ�ת֮��", obj);
		obj.reverse();
		print("�ٴη�ת֮��", obj);
		obj.append("And you?");
		print("��׷����ָ������֮��", obj);
		obj.insert(obj.indexOf("?")+1, "Not bad!");
		print("��ָ��λ�ò���������֮��", obj);
		obj.delete(12, 19);
		print("��ɾ����ָ�����������֮��", obj);
		obj.deleteCharAt(12);
		print("��ɾ����ָ��λ�õ��ַ�֮��", obj);
		obj.replace(12, 20, "I am fine!");
		print("���滻��ָ�����������֮��", obj);
	}
	
	//print�������������ʾ��Ϣinfo�������StringBuffer�������obj�����ݡ����Ⱥ�����
	public static void print(String info, StringBuffer obj){
		System.out.println(info);
		System.out.print("���ַ���������������Ϊ\""+obj.toString()+"\"");
		System.out.print("������Ϊ"+obj.length());
		System.out.println("������Ϊ"+obj.capacity());
	}
}