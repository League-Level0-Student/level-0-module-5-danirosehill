package _02_nested_loops._3_for_loop_gauntlet;

public class forloopgauntlet {
public static void main(String[] args) {
	
int a=1;
int b=4;
for (int i=1; i<=3; i++) {
for (int j=a; j<b; j++) {
System.out.print(j + " ");
}
System.out.println();
a= a + 3;
b =b + 3;
}

}
}
