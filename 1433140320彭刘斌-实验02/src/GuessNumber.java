import javax.swing.JOptionPane;
public class GuessNumber {
	public static void main (String args[ ]) { 
		int realNumber=(int)(Math.random()*100)+1;
		int yourGuess;
		int times=1;
		System.out.println("����һ��1��100֮�������,��²������");
		String str=JOptionPane.showInputDialog("�������Ĳ²�:");  
		yourGuess=Integer.parseInt(str);
		System.out.println("��µĵ�"+times+"�Σ�"+yourGuess);
		while(yourGuess != realNumber) {	//ѭ������
			if(yourGuess > realNumber) {		//��������
				str=JOptionPane.showInputDialog("�´���,��������Ĳ²�:");
				yourGuess=Integer.parseInt(str);
			} else if(yourGuess < realNumber) {	//��������
				str=JOptionPane.showInputDialog("��С��,��������Ĳ²�:");
				yourGuess=Integer.parseInt(str);
			}
			times++;
			System.out.println("��µĵ�"+times+"�Σ�"+yourGuess);
		}
		System.out.println("�¶��ˣ��������"+realNumber+"����һ������"+times+"��");
	}
}