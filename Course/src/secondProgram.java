import java.awt.*;
import java.applet.*;

public class secondProgram extends Applet{
	int age = 35;
	
	public void paint(Graphics g) {
		g.drawString("Edad: "+age, 10, 20);
	}
	

}
