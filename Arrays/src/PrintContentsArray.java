import java.awt.*;
import java.applet.*;

public class PrintContentsArray extends Applet { //It's inherited to �Applet�.
	int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, //Create array of eleven elements.
	max = 10, start, value; //Create max with ten like value, and �start� and �value�.
	
	public void paint (Graphics g) {
		for (start = 0; start <= max; start++) {
			value = 10 * (start + 1);
			System.out.println(value);
			g.drawString("array["+start+"] = "+array[start], 3, value);// �3� gives margin values and �value� gives spaces value.
		}
	}
	
}
