class StringExample {
	public static void main(String[] args) {
		String s1=new String("how are you"), s2=new String("how do you do");
		if(s1.equals(s2)){	//使用equals方法判断s1与s2是否相同
			System.out.println(s1+" 与 "+s2+" 相同");
		}else{
			System.out.println(s1+" 与 "+s2+" 不相同");
		}
		String s3=new String("511126200906060058");
		if(s3.startsWith("51")){   //判断s3的前缀是否是"51"。
			System.out.println(s3+" 是四川省的身份证");
		}else{
			System.out.println(s3+" 不是四川省的身份证");
		}
		String s4=new String("asp"), s5=new String("jsp");
		if(s4.compareTo(s5) >= 0){//按字典序判断s4大于等于s5的表达式。
			System.out.println("按字典序:"+s4+" 大于等于 "+s5);
		}else{
			System.out.println("按字典序:"+s4+" 小于 "+s5);
		}
		int position=0;
		String path="http://210.41.160.7/default.htm";
		position = path.indexOf(':');	//获取path中首次出现协议分隔符:的位置
		System.out.println(path+"中首次出现协议分隔符:的位置: "+position);
		String protocolName = path.substring(0, position);	//获取path中"http"子字符串。
		System.out.println(path+"中的协议为: "+protocolName); 
		position = path.lastIndexOf('/');	//获取path中最后出现目录分隔符号/的位置
		System.out.println(path+"中最后出现/的位置: "+position);
		String fileName = path.substring(position + 1);	//获取path中"default.htm"子字符串。
		System.out.println(path+"中含有的文件名: "+fileName);
		String s6 = new String("100");//new String("1a12b");会抛出异常NumberFormatException，表示不能转化为整型数据
		String s7=new String("123.456");
		int n1 = Integer.parseInt(s6);	//将s6转化成int型数据。
		double n2 = Double.parseDouble(s7);	//将s7转化成double型数据。
		double m=n1+n2;
		System.out.println(s6+"+"+s7+"="+m);
		String s8 = String.valueOf(m);	//String调用valuOf()方法将m转化为字符串对象
		position=s8.indexOf(".");
		String temp=s8.substring(position+1);
		System.out.println("数字"+m+"有"+temp.length()+"位小数") ; 
		String s9=new String("ABCDEF");
		char a[] = s9.toCharArray();	//将s9存放到数组a中。
		System.out.print(s9+"存放到数组后，数组内容为：");
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		String s10="Computer";
		String s11=" Science";
		String s12 = s10 + s11;	//将s10和s11拼接起来，得到"Computer Science"
		System.out.println(s10+" 和 "+s11+"拼接后得到"+s12);
		String s13="计科学院开设了《Java程序设计》，这是计科学院的核心课程之一";
		String s14 = s13.replaceAll("计科学院", "计算机科学学院");	//将s13中的“计科学院”替换为“计算机科学学院”
		System.out.println("将 "+s13+" 中的计科学院替换为计算机科学学院后：\n"+s14);
		
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
		System.out.println(m + "分解为：");
		String[] s17 = s16.split("\\.");   //  "\\."是一个正则表达式
		System.out.println(s17[0] + "\n" + s17[1]);
	}
}