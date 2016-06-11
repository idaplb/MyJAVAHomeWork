
import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		//在Java Applet中绘制一行文字：“这是一个Java Applet 程序”
		g.drawString("这是一个Java Applet 程序", 20, 50);
		g.setColor(Color.red);
		g.setFont(new Font("宋体",Font.BOLD,20));
		//在Java Applet中绘制一行文字：“我改变了字体”
		g.drawString("我改变了字体", 100, 200);
	}
}