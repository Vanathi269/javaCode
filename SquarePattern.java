package javaPractice;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=in.nextInt();
		System.out.println("square pattern");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("number cube");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("triangular pattern");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
