package assignment7;

public class Parentclass extends Childclass {

	public void parent() {
		System.out.println("this is parents class");
	}
	
	public static void main(String[] args) {
		Parentclass obj=new Parentclass();
		obj.parent();
		obj.child();

	}

}
