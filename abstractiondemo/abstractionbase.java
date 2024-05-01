package abstractiondemo;

public abstract class abstractionbase {
	public void b1() {
		System.out.println("base 1");
	}
	
	//public void b2(); this method cannot able to find it ia an abstract method
	//we using keyword abstract
	public abstract void b2();
}
