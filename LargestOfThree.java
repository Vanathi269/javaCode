package javaPractice;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the three number");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		System.out.println("Greatest number is");
		if((a>=b) && (a>=c)) {
			System.out.println(a);
			
		}else if(b>=a && b>=c) {
			System.out.println(b);
		}else
			System.out.println(c);
		

	}

}
