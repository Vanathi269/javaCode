package assignment7;

public class Employee extends Member {
	private String speciallization="java";
	private String Department="computer science";
	
	
	public static void main(String[] args) {
		Member obj=new Member();
		obj.setName("vani");
		System.out.println("the name of the employee "+obj.getName());
		obj.setAge(18);
		System.out.println("Age of the employee is"+obj.getAge());
		obj.setPhno(185795663);
		System.out.println("the phone number of the employee is"+obj.getPhno());
		obj.setAddress("xyx");
		System.out.println("the address of the employee is"+obj.getAddress());
		obj.printSalary();		
		
		Employee obj1=new Employee();
		System.out.println("the specializtion of the employee is"+obj1.speciallization);
		System.out.println("the department is"+obj1.Department);
	}
}
