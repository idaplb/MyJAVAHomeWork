class StringExample {
	public static void main(String[] args) {
		String s1=new String("how are you"), s2=new String("how do you do");
		if(s1.equals(s2)){	//ʹ��equals�����ж�s1��s2�Ƿ���ͬ
			System.out.println(s1+" �� "+s2+" ��ͬ");
		}else{
			System.out.println(s1+" �� "+s2+" ����ͬ");
		}
		String s3=new String("511126200906060058");
		if(s3.startsWith("51")){   //�ж�s3��ǰ׺�Ƿ���"51"��
			System.out.println(s3+" ���Ĵ�ʡ�����֤");
		}else{
			System.out.println(s3+" �����Ĵ�ʡ�����֤");
		}
		String s4=new String("asp"), s5=new String("jsp");
		if(s4.compareTo(s5) >= 0){//���ֵ����ж�s4���ڵ���s5�ı��ʽ��
			System.out.println("���ֵ���:"+s4+" ���ڵ��� "+s5);
		}else{
			System.out.println("���ֵ���:"+s4+" С�� "+s5);
		}
		int position=0;
		String path="http://210.41.160.7/default.htm";
		position = path.indexOf(':');	//��ȡpath���״γ���Э��ָ���:��λ��
		System.out.println(path+"���״γ���Э��ָ���:��λ��: "+position);
		String protocolName = path.substring(0, position);	//��ȡpath��"http"���ַ�����
		System.out.println(path+"�е�Э��Ϊ: "+protocolName); 
		position = path.lastIndexOf('/');	//��ȡpath��������Ŀ¼�ָ�����/��λ��
		System.out.println(path+"��������/��λ��: "+position);
		String fileName = path.substring(position + 1);	//��ȡpath��"default.htm"���ַ�����
		System.out.println(path+"�к��е��ļ���: "+fileName);
		String s6 = new String("100");//new String("1a12b");���׳��쳣NumberFormatException����ʾ����ת��Ϊ��������
		String s7=new String("123.456");
		int n1 = Integer.parseInt(s6);	//��s6ת����int�����ݡ�
		double n2 = Double.parseDouble(s7);	//��s7ת����double�����ݡ�
		double m=n1+n2;
		System.out.println(s6+"+"+s7+"="+m);
		String s8 = String.valueOf(m);	//String����valuOf()������mת��Ϊ�ַ�������
		position=s8.indexOf(".");
		String temp=s8.substring(position+1);
		System.out.println("����"+m+"��"+temp.length()+"λС��") ; 
		String s9=new String("ABCDEF");
		char a[] = s9.toCharArray();	//��s9��ŵ�����a�С�
		System.out.print(s9+"��ŵ��������������Ϊ��");
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		String s10="Computer";
		String s11=" Science";
		String s12 = s10 + s11;	//��s10��s11ƴ���������õ�"Computer Science"
		System.out.println(s10+" �� "+s11+"ƴ�Ӻ�õ�"+s12);
		String s13="�ƿ�ѧԺ�����ˡ�Java������ơ������Ǽƿ�ѧԺ�ĺ��Ŀγ�֮һ";
		String s14 = s13.replaceAll("�ƿ�ѧԺ", "�������ѧѧԺ");	//��s13�еġ��ƿ�ѧԺ���滻Ϊ���������ѧѧԺ��
		System.out.println("�� "+s13+" �еļƿ�ѧԺ�滻Ϊ�������ѧѧԺ��\n"+s14);
		
		String s15 = new String(a, 0, 3);
		System.out.println(s15);
		
		String str1=new String("ABCABC"),str2=null,str3=null,str4=null;
		str2=str1.replaceAll("A","First");
		str3=str2.replaceAll("B","Second");
		str4=str3.replaceAll("C","Third");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		long x = 12345;
		System.out.println(Long.toString(x, 2));
		System.out.println(Long.toString(x, 8));
		System.out.println(Long.toString(x, 16));
		
		String s16 = String.valueOf(m);
		System.out.println(m + "�ֽ�Ϊ��");
		String[] s17 = s16.split("\\.");   //  "\\."��һ��������ʽ
		System.out.println(s17[0] + "\n" + s17[1]);
	}
}