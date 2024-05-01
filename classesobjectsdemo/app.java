package classesobjectsdemo;

public class app {
	public static void main(String[] args) {
		// create object
		// accessing the object in another class
		student s12 = new student();
		s12.name = "harsha";
		System.out.println(s12.name);
		s12.id=123;
		s12.markattendance();
		s12.appearexam();
		// class_name ref_var_new=new_keyword constructor_call
		// object
		student s1 = new student();
		s1.name = "vanathi";
		s1.id = 123;
		System.out.println(s1.name);
		System.out.println(s1.id);
		s1.markattendance();
		s1.address = "sathy";
		s1.standard = 12;
		s1.division = 'a';
		s1.rollno = 123;
		s1.schoolname = "gasc";
		System.out.println(s1.address);
		System.out.println(s1.standard);
		System.out.println(s1.division);
		System.out.println(s1.rollno);
		System.out.println(s1.schoolname);
		//static variable can be accessed directly by class name
		
		
		student obj=new student();
		

	}
}
