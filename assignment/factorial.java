package assignment;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
	int fact=1,n;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the limit");
	n=in.nextInt();
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println("factorial value "+fact);
	}
}