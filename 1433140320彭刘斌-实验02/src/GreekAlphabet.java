public class GreekAlphabet {
	public static void main (String args[ ]) {
		int startPosition=0 , endPosition=0 , counter=0;
		char cStart='��',cEnd='��',ch;
		//cStart��int��ת�����㣬���������ֵ��startPosition
		startPosition = cStart;
		//cEnd��int��ת�����㣬���������ֵ��endPosition
		endPosition = cEnd;
		System.out.println("��һ��ϣ����ĸ\'��\'��unicode���е�λ��:"+(int)cStart);
		System.out.println("���һ��ϣ����ĸ\'��\'��unicode���е�λ��:"+(int)cEnd);
		System.out.println("------------ϣ����ĸ��------------");
		for(int i=startPosition ; i<=endPosition ; i++) {
			//i��char��ת�����㣬���������ֵ��ch
			ch = (char)i;
			System.out.print(ch+"  ");
			counter++;
			if(counter%10==0)
				System.out.println();
		}
	}
}