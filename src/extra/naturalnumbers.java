package extra;

import java.util.Scanner;

public class naturalnumbers {

	public static void main(String[] args) {
		int i,a=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		if(n>0) {
		for(i=1;i<=n;i++) {
		a=a+i;
		}
		System.out.println(a);
	}
	
	else{
		System.out.println("the number is negative");
	}
	}
}
