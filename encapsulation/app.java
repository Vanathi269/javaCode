package encapsulation;

public class app {

	public static void main(String[] args) {
		workers in = new workers();
		System.out.println(in.getId());
		in.setName("vanathi");
		System.out.println(in.getName());
		in.setAddress("sathy");
		System.out.println(in.getAddress());
		System.out.println(in.getExp());
		in.setPno(467364736);
		System.out.println(in.getPno());
		in.setSalary(6758.50);
		System.out.println(in.getSalary());
		
	}
	
}
