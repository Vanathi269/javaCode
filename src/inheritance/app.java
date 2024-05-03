package inheritance;

public class app {

	public static void main(String[] args) {
		student s1=new student();
		s1.markattendance();
		s1.lunchtime();
		s1.attendlecture();
		
		teacher t1=new teacher();
		t1.conductsession();
		t1.markattendance();
		t1.lunchtime();
		
		staff st=new staff();
		st.printingresult();
		st.markattendance();
		st.lunchtime();
		
		schoolbase sb=new schoolbase();
		sb.markattendance();
		//sb.conductsession();parent class object cannot access child class method
		
		 
	
	
		
		//toString , notify,notifyall,getclass ,hashcode

	}

}
