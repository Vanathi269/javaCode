package assignment5;

public class ConstructorOverloading {
	
	int rno;
	String name,lname;
	
	
	public ConstructorOverloading(int rno,String name) {
		this.rno=rno;
		this.name=name;
		System.out.println("roll no :"+rno);
		System.out.println("name :"+name);
	}
	
	public ConstructorOverloading(int rno,String name,String lname) {
		this.rno=rno;
		this.name=name;
		this.lname=lname;
		System.out.println("roll no :"+rno);
		System.out.println("name :"+name);
		System.out.println("last name :"+lname);
	}

	public static void main(String[] args) {
		ConstructorOverloading in=new ConstructorOverloading(123,"vanathi");
		

	}

}
