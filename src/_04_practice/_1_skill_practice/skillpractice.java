package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class skillpractice {
	public static void main(String[] args) {
	skill1();
	skill2();
	}
	
	static void skill1() {
	String di= JOptionPane.showInputDialog("How many dimes do you have?");
	int dimes = Integer.parseInt(di);
	int answer = dimes*10;
	JOptionPane.showMessageDialog(null, "You have " + answer + " cents.");
	
	String h = JOptionPane.showInputDialog("How tall are you in inches?");
	int height = Integer.parseInt(h);
	
	if (height < 36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties!");
	}
	}
	static void skill2() {
	for (int i=1; i<30; i++) {
	if (i%3==0) {
	System.out.println(i);
	}
	}
	}
	void skill3() {
	
	}
	}

