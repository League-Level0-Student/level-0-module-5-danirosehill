package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
String num= JOptionPane.showInputDialog(null, "Choose a number.");
int number= Integer.parseInt(num);
int y= number;
for (int x=2; x<y; x++) {
	if (y % x == 0 ) {
	JOptionPane.showMessageDialog(null, "This number is not prime.");
	System.exit(0);
}
}
	JOptionPane.showMessageDialog(null, "This number is prime.");
}
}
