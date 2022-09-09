package mineProsjekt;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Karakter {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
		String Tall1 = showInputDialog("Poengsum");
		
		int p = parseInt(Tall1);
	
		if (p<0) {	
		i = i-1;
		}
		else if (p>100) {
			i = i-1;
		}
		else if (p < 40) {
			String UtTxt = 
					"F";	
			System.out.println(UtTxt);
		}
		else if (p < 50) {
			String UtTxt = 
					"E";	
			System.out.println(UtTxt);
		}	
		else if (p < 60) {
			String UtTxt = 
					"D";	
			System.out.println(UtTxt);
		}
		else if (p < 80) {
			String UtTxt = 
					"C";	
			System.out.println(UtTxt);
		}
		else if (p < 90) {
			String UtTxt = 
					"B";	
			System.out.println(UtTxt);
		}
		else if (p < 101) {
			String UtTxt = 
					"A";	
			System.out.println(UtTxt);
		}
		}
	}

}
