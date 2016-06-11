import java.math.*;
class BigIntegerExample {
	public static void main(String[] args){
		BigInteger n1=new BigInteger("987654321987654321987654321"), n2=new BigInteger("123456789123456789123456789"), result=null;
		System.out.println("第一个数: "+n1.toString());
		System.out.println("第二个数: "+n2.toString());
		result = n1.add(n2);	//n1和n2做加法运算，结果返回给result
		System.out.println("和:"+result.toString());
		result = n1.subtract(n2);	//n1和n2做减法运算，结果返回给result
		System.out.println("差:"+result.toString());
		result = n1.multiply(n2);	//n1和n2做乘法运算，结果返回给result
		System.out.println("积:"+result.toString());
		result = n1.divide(n2);	//n1和n2做除法运算，结果返回给result
		System.out.println("商:"+result.toString());
		BigInteger num=new BigInteger("123456"),	COUNT=new BigInteger("0"), ONE=new BigInteger("1"),	TWO=new BigInteger("2");
		System.out.println("\n"+num.toString()+"的因子有:");
		for(BigInteger i=TWO; i.compareTo(num)<0; i=i.add(ONE)){
			if((num.remainder(i).compareTo(BigInteger.ZERO))==0){
				COUNT=COUNT.add(ONE);
				System.out.print(i.toString()+"  ");
			}
		}
		System.out.println("\n一共有"+COUNT.toString()+"个因子");    
	}
}