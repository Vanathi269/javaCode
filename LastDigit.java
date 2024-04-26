package javaPractice;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int neg=Math.abs(n);//for negative number to convert positive
		int ans=neg%10;
		System.out.println(ans);

	}

}
