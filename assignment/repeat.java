package assignment;

public class repeat {

	public static void main(String[] args) {
		String name = "vanathi";
		for(char i:name.toCharArray()) {
		if(name.indexOf(i)!=name.lastIndexOf(i)){
			System.out.println("the first repeating character is "+i);
			break;
			
	}

	}
	}
}
