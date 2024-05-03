package assingment1;

import java.util.Scanner;

public class positiveornegative {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number to be checked:");
		int num=in.nextInt();
		if(num<0) {
			System.out.println("the number is negative");
		}else if(num>0) {
			System.out.println("the number is positive");
		}else {
			System.out.println("the number is zero");
		}
	}
}
