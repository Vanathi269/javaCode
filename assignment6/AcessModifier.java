package assignment6;

public class AcessModifier {
	private int data=40;  
	private void msg(){		//private Acess modifier
		System.out.println("Hello private");
		msg1();
		}
	
	public void msg1() {	//public Acess modifier
		
		System.out.println("hello public");
		
		
	}
	
	
public static void main(String[] args) {
	AcessModifier in = new AcessModifier();
	in.msg();
	in.msg1();
	System.out.println(in.data);
}
	} 

