package mineProsjekt;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Trinnskatt {

	public static void main(String[] args) {
		
	String Tall1 = showInputDialog("Inntekt Brutto");
		
		int p = parseInt(Tall1);

		if (p<0) {
			System.out.println("Error");
		}
			else if(p<190350) {
				System.out.println("Du betaler ingen skatt");
			}
			else if (p<267899) {
				double a = p*0.017;
				System.out.println("Du betaler: "+ a +"kr i trinnskatt.");
			}
			else if (p<643800) {
				double a = p*0.04;
				System.out.println("Du betaler: "+ a +"kr i trinnskatt.");
			}
			else if (p<969200) {
				double a = p*0.134;
				System.out.println("Du betaler: "+ a +"kr i trinnskatt.");
			}
			else if (p<2000000) {
				double a = p*0.164;
				System.out.println("Du betaler: "+ a +"kr i trinnskatt.");
			}
			else if (p>=2000000) {
				double a = p*0.174;
				System.out.println("Du betaler: "+ a +"kr i trinnskatt.");
			}
		
	}

}
