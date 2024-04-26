package javaPractice;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("write a and b");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a"+a+"b"+b);

	}

}
