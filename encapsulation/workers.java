package encapsulation;

public class workers {

	//access modifier only can use within the class
	private int id=5;//r-yes , w-no
	private String name;//r-yes,w-yes
	private String address;//r-yes,w-yes
	private double salary;//r-yes,w-yes
	private int exp=10;//r-yes,w-no
	private long pno;//r-yes,write-yes
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	public int getId() {
		return id;
	}
	public int getExp() {
		return exp;
	}
	
	
	
}
