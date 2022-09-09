package mineProsjekt;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Valgsetninger {

	public static void main(String[] args) {
		
String Tall1 = showInputDialog("tall 1");

String Tall2 = showInputDialog("Tall 2");

int a = parseInt(Tall1);
int b = parseInt(Tall2);

if (b > 0) {
	int c = a/b;
	String UtTxt = 
			"Svaret er: " + c;	
	System.out.println(UtTxt);; 

}
else {
	String UtTxt2 =
	    "Error";
	showMessageDialog(null, UtTxt2);
			
			
	
}

	
	}


}
