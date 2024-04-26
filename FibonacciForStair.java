package javaPractice;

import java.util.Scanner;

public class FibonacciForStair {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of staircases");
		int n=in.nextInt();
		int sc1=1,sc2=1;
		int sc3=0;
		for(int i=1;i<n;i++) {
			sc3=sc1+sc2;
			sc1=sc2;
			sc2=sc3;
		}
System.out.printf(sc3+" steps can be involved");
	}

}
