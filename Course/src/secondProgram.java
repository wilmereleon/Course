import java.awt.*;
import java.applet.*;

public class secondProgram extends Applet{
	int age = 35;
	int a = 5;
	int b = 7;
	int c = a + b;
	
	public void paint(Graphics g) {
		g.drawString("Edad: "+c++, 10, 20);
	}
	

}
