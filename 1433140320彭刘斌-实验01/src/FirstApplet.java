
import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		//��Java Applet�л���һ�����֣�������һ��Java Applet ����
		g.drawString("����һ��Java Applet ����", 20, 50);
		g.setColor(Color.red);
		g.setFont(new Font("����",Font.BOLD,20));
		//��Java Applet�л���һ�����֣����Ҹı������塱
		g.drawString("�Ҹı�������", 100, 200);
	}
}