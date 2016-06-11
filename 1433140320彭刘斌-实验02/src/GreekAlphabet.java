public class GreekAlphabet {
	public static void main (String args[ ]) {
		int startPosition=0 , endPosition=0 , counter=0;
		char cStart='α',cEnd='ω',ch;
		//cStart做int型转换运算，并将结果赋值给startPosition
		startPosition = cStart;
		//cEnd做int型转换运算，并将结果赋值给endPosition
		endPosition = cEnd;
		System.out.println("第一个希腊字母\'α\'在unicode表中的位置:"+(int)cStart);
		System.out.println("最后一个希腊字母\'ω\'在unicode表中的位置:"+(int)cEnd);
		System.out.println("------------希腊字母表------------");
		for(int i=startPosition ; i<=endPosition ; i++) {
			//i做char型转换运算，并将结果赋值给ch
			ch = (char)i;
			System.out.print(ch+"  ");
			counter++;
			if(counter%10==0)
				System.out.println();
		}
	}
}