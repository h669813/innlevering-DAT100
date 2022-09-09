package mineProsjekt;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Fakultet {

	public static void main(String[] args) {

		String Tall1 = showInputDialog("Heltall");
		int p = parseInt(Tall1);
		if(p<0)
			System.out.println("Error");
		else {
			int b=1;
		while(p>1) {
			int a = p*(p-1);
			b = b*a;
			p=(p-2);
		}
	
		
	System.out.println(b);
	
		}
	}

}
