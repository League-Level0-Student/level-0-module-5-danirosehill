package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	
	static Robot Rob = new Robot ();

	public static void main(String[] args) {
	String question = JOptionPane.showInputDialog(null, "What shape do you want?");
	if (question.equals("square")) {
		String question2 = JOptionPane.showInputDialog(null, "What color should it be: red, yellow, or blue?");
		if (question2.equals("red")) {
		Rob.setPenColor(Color.red);
		}
		if (question2.equals("blue")) {
		Rob.setPenColor(Color.blue);
			}
		if (question2.equals("yellow")) {
		Rob.setPenColor(Color.yellow);
			}
		drawSquare();
	}
	if (question.equals("circle")) {
		String question2 = JOptionPane.showInputDialog(null, "What color should it be: red, yellow, or blue?");
		if (question2.equals("red")) {
		Rob.setPenColor(Color.red);
		}
		if (question2.equals("blue")) {
		Rob.setPenColor(Color.blue);
			}
		if (question2.equals("yellow")) {
		Rob.setPenColor(Color.yellow);
			}
		drawCircle();
	}
	if (question.equals("triangle")) {
		String question2 = JOptionPane.showInputDialog(null, "What color should it be: red, yellow, or blue?");
		if (question2.equals("red")) {
		Rob.setPenColor(Color.red);
		}
		if (question2.equals("blue")) {
		Rob.setPenColor(Color.blue);
			}
		if (question2.equals("yellow")) {
		Rob.setPenColor(Color.yellow);
			}
		drawTriangle();
	}
	}
	
	
	static void drawSquare(){
	for (int i=0; i<4; i++) {
	Rob.setSpeed(50);
	Rob.penDown();
	Rob.move(100);
	Rob.turn(90);
	}
	}
	
	static void drawTriangle() {
	for (int i=0; i<3; i++) {
		Rob.setSpeed(50);
		Rob.penDown();
		Rob.move(100);
		Rob.turn(120);
	}
	}
	
	static void drawCircle() {
		for (int i=0; i<30; i++) {
		Rob.setSpeed(50);
		Rob.penDown();
		Rob.move(10);
		Rob.turn(12);
	}
	}
}

