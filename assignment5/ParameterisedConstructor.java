package assignment5;

public class ParameterisedConstructor {
	int id;
	String name;
	
	public ParameterisedConstructor(int id , String name) {
		System.out.println("constructor");
		this.id=id;
		this.name=name;
		System.out.println(id);
		System.out.println(name);

	}

	public static void main(String[] args) {
		ParameterisedConstructor in=new ParameterisedConstructor(123,"vanathi");
		
	}


}
