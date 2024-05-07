package assignment7;

public class Square extends Rectangle {
	public void square() {
		System.out.println("Square is rectangle");
	}
	public static void main(String[]args) {
		Square obj=new Square();
		obj.rec();
		obj.samshape();
	}
}
