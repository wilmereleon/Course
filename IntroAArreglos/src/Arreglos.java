import java.awt.*;
import java.applet.*;

public class Arreglos extends Applet{
	int arreglo[] = {25, 14};
	
	public void paint(Graphics g) {
		g.drawString("Posición cero: "+arreglo[0], 20, 20);
		g.drawString("Posición uno: "+arreglo[1], 20, 40);
	}
}
