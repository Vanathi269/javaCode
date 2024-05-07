package assignment7;

public class Member {
	private String Name;
	private int Age;
	private double phno;
	private String address;
	private int salary=100000;
	
	public void printSalary() {
		System.out.println("The salary is"+getSalary());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getPhno() {
		return phno;
	}

	public void setPhno(double phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
