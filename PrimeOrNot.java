package javaPractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=2;
		while(i<n) {
			
			if(n%i==0) {
				System.out.println("Not a Prime number");
				return;
			}
			i++;
		}
		System.out.println("Prime Number");
	}

}
