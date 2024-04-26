package javaPractice;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("the count of the number is"+count);

	}

}
