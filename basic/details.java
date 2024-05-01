package basic;

import java.util.Scanner;

public class details {

	public static void main(String[] args) {
		String source;
		int m;
		long n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the name");
		source=in.next();
		System.out.println("the stored name is"+ source);
		System.out.println("enter your id");
		m=in.nextInt();
		System.out.println("the id stored" +m);
		System.out.println("enter your phone number");
		n=in.nextLong();
		System.out.println(n);
		

	}

}
