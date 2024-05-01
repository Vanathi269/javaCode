package classesobjectsdemo;
//assign schoolname within another class
public class application {
	public static void main(String[] args) {
		employee e123=new employee(123,"vanu");
		System.out.println(e123.empid);
		System.out.println(e123.empname);
		//System.out.println(e123.company);not recommended
		System.out.println(employee.company);//it is recommended for static
		
		

		
		
	}
}
