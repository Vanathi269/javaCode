package assignment7;

public class Manager extends Member {
	private String speciallization="java";
	private String Department="it";

	public static void main(String[] args) {
		Member obj=new Member();
		obj.setName("abc");
		System.out.println("the name of the manager "+obj.getName());
		obj.setAge(38);
		System.out.println("Age of the manager is"+obj.getAge());
		obj.setPhno(15663);
		System.out.println("the phone number of the manager is"+obj.getPhno());
		obj.setAddress("xyx");
		System.out.println("the address of the manager is"+obj.getAddress());
		obj.setSalary(1000008);
		obj.printSalary();		
		
		Manager obj1=new Manager();
		System.out.println("the specializtion of the manager is"+obj1.speciallization);
		System.out.println("the department is"+obj1.Department);

	}
}
