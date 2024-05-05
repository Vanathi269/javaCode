package assignment5;

public class constructors {
			int id;
		String name;
		
		public constructors() {
			System.out.println("constructor");
			this.id=101;
			this.name="vanathi";
			
		}

		public static void main(String[] args) {
			constructors in=new constructors();
			System.out.println(in.id);
		}

	
}
