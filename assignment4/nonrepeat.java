package assignment4;

public class nonrepeat {
	public static void main(String[] args) {
		String name = "anathi";
		for(char i:name.toCharArray()) {
		if(name.indexOf(i)==name.lastIndexOf(i)) {
			System.out.println("the first non repeating character is "+i);
			break;
			}
		
	}
	}
}
