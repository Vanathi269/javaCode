package javaPractice;

import java.util.Scanner;

public class AllDivisorOfNumber {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number to find divisor");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
