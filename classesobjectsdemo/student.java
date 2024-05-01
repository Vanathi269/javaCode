package classesobjectsdemo;

public class student {
//properties of any student object
//properties should be written in side the class
	int id;
	String name;
	String address;
	int rollno;
	int standard;
	char division;
	static String schoolname;

//behaviour	
	public void appearexam() {//instance dependent on the object
		int abc=1;//local variable only can used in this method
		int id=2;//java will accessed nearer variable
		System.out.println(abc);
		System.out.println(id);
		//accessing global variable by using this keyword
		System.out.println(this.id);//this indicates the class and go to the class and find the variable
		System.out.println("appearing exam");
	}

	public void markattendance() {
		System.out.println("students are marking attendance");
	}

	public void doexercise() {
		System.out.println("students are doing excersie");
	}

	public void subjectproject() {
		System.out.println("students are submitting projects");
	}
	public static void printschoolname() {//static dependent on object
		System.out.println(schoolname);
	}
	// class without main method is ok

}
