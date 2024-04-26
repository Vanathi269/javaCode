package javaPractice;

import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		
		System.out.println("factorial of "+n+" is "+fact(n));
	}

}
