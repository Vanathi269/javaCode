package assingment1;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number to be check");
		int num=in.nextInt();
		if(num%2==0) {
			System.out.println("the number "+ num +" is even ");
		}else {
			System.out.println("the number "+num+"is odd");
		}

	}

}
