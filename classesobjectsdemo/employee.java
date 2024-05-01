package classesobjectsdemo;

public class employee {
	/*
	 * types of  variables
	 * Global variable:
	 * 		declared in side the class but outside the method
	 * 		default value given by java
	 *		scope is across the class and can be accessed in any method in the object
	 *		to access global variable we might need to use "this" keyword to solve ambiguity if any
	 * local variable:
	 * 		declared in side the class but inside the method
	 *		 it is compulsory to initialize before using it
	 *		scope restricted only within the method
	 *types of global variables
	 * 1.instance:
	 * 		a variable declared without static keyword
	 * 		the value of the variables is dependent on the object
	 * 		should be accessed by an object
	 * 2.static:
	 * 		a variable declared with a static keyword
	 * 		the value of the variable is same across all the object
	 * 		should be accessed directly by class name, no need to create an object
	 * 
	 * types of method
	 * 1.instance:
	 * 	a method without a static keyword
	 * 	should be accessed by an object
	 * 	can access both static variable as well as instance variables
	 * 
	 * 2.static
	 * 	a method with static keyword
	 * 	should be accessed directly by class name, no need to create an object
	 * 	can access only static variables and cannot access instance variable
	 * 
	 * constructor:
	 * 	is a block of which is used initialize the variable
	 * 	it should be of the same name as the class name
	 * there is default constructor available for all the class
	 * 
	 * 
	 * constructor is used to initialize variable
	 */
	int empid;
	String empname;
	long mno;
	static String company;
	
	public employee(int empid,String empname) {//it is local
		System.out.println("constructor");
		this.empid=empid;
		this.empname=empname;//assigning global variable to local variable
	}
		public employee(int empid,String empname,long mno) {//it is local
			System.out.println("3 parameter working");
			this.empid=empid;
			this.empname=empname;
			this.mno=mno;//assigning global variable to local variable
				
	}

	public static void main(String[] args) {
		employee e1=new employee(1,"abi");//employee(constructor call)
		System.out.println(e1.empid);
		System.out.println(e1.empname);
		//System.out.println(e1.company);
		employee e2=new employee(1,"abi",86547);//employee(constructor call)
		System.out.println(e2.empid);
		System.out.println(e2.empname);
		System.out.println(e2.mno);
		
		/*employee e2;
		e2=new employee();
		System.out.println(e2.empid);
		System.out.println(e2.empname);
		System.out.println(e2.company);
		e2.company="accounts";
		e2.empname="harsha";
		System.out.println(e2.company);
		System.out.println(e2.empname);
		employee e3=new employee();
		System.out.println(e3.empid);
		System.out.println(e3.empname);
		System.out.println(e1.company);
		
		
*/
	}

}
