package exersize;

public class swapwithout3variable {

	public static void main(String[] args) {
		int a=3,b=2;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
