package assingment1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=in.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial value of "+num+" is "+fact);

	}

}
