package classesobjectsdemo;

public class constructor {
	int id;
	String name;
	
	public constructor(int id , String name) {
		System.out.println("constructor");
		this.id=id;
		this.name=name;
		System.out.println(id);
		System.out.println(name);

	}

	public static void main(String[] args) {
		constructor in=new constructor(123,"vanathi");
		System.out.println(in.id);
	}

}
