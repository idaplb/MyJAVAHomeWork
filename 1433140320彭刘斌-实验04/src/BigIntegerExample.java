import java.math.*;
class BigIntegerExample {
	public static void main(String[] args){
		BigInteger n1=new BigInteger("987654321987654321987654321"), n2=new BigInteger("123456789123456789123456789"), result=null;
		System.out.println("��һ����: "+n1.toString());
		System.out.println("�ڶ�����: "+n2.toString());
		result = n1.add(n2);	//n1��n2���ӷ����㣬������ظ�result
		System.out.println("��:"+result.toString());
		result = n1.subtract(n2);	//n1��n2���������㣬������ظ�result
		System.out.println("��:"+result.toString());
		result = n1.multiply(n2);	//n1��n2���˷����㣬������ظ�result
		System.out.println("��:"+result.toString());
		result = n1.divide(n2);	//n1��n2���������㣬������ظ�result
		System.out.println("��:"+result.toString());
		BigInteger num=new BigInteger("123456"),	COUNT=new BigInteger("0"), ONE=new BigInteger("1"),	TWO=new BigInteger("2");
		System.out.println("\n"+num.toString()+"��������:");
		for(BigInteger i=TWO; i.compareTo(num)<0; i=i.add(ONE)){
			if((num.remainder(i).compareTo(BigInteger.ZERO))==0){
				COUNT=COUNT.add(ONE);
				System.out.print(i.toString()+"  ");
			}
		}
		System.out.println("\nһ����"+COUNT.toString()+"������");    
	}
}