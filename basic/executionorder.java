package basic;

public class executionorder {
public static void main(String[] args) {
	System.out.println(1);
	m2();
	System.out.println(13);

}
public static void m1() {
	System.out.println(2);
}
public static void m2() {
	System.out.println(3);
	m3();
	System.out.println(11);
	
}
public static  void m3() {
	System.out.println(4);
	System.out.println(12);
}
}
