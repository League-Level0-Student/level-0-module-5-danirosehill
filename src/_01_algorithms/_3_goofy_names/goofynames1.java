package _01_algorithms._3_goofy_names;

import javax.swing.JOptionPane;

public class goofynames1 {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Write your name.");
String goofyname="";
System.out.println(name.toUpperCase());
int x = name.length();
for (int y= 0; y < x; y++) {
if (y%2==0) {
goofyname += Character.toUpperCase(name.charAt(y));
} else {
goofyname += Character.toLowerCase(name.charAt(y));

}
}	
System.out.println(goofyname);

}
}

