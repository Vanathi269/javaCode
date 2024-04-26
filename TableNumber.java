package javaPractice;

import java.util.Scanner;

public class TableNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the table number");
		int n=in.nextInt();
		System.out.println("enter the limit");
		int l=in.nextInt();
		for(int i=1;i<=l;i++) {
			System.out.println(n*i);
		}

	}

}
