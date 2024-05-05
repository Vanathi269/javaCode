package assignment5;

public class JavaVariable {
	public static String fruit="apple";   //Declared static variable
	public String name="vanathi";   // Declared Instance Variable
	
	public static void main(String[] args) {
		int a=34;	//declared local variable
		System.out.println("the local variable: "+a);
		System.out.println("the static variable: "+JavaVariable.fruit);
		JavaVariable var = new JavaVariable();
		System.out.println("the instance variable: "+var.name);

	}

}
