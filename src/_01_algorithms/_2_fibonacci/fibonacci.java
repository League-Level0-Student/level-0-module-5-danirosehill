package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {

int number1;
int number2;
int sum;
number1 = 0;
System.out.println(number1);
number2 = 1;
System.out.println(number2);
for (int x=0; x < 10; x++) {
sum= number1 + number2;
System.out.println(sum);
number1 = number2;
number2= sum;
}
}
}