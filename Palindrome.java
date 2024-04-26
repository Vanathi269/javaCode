package javaPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.next();
		String b="";
		int len=a.length()-1;
		while(len>=0) {
			b=b+a.charAt(len);
			len--;
		}
		if(a.equals(b)) {
			System.out.println("palindrome");
		}else
			System.out.println("Not a palindrome");
	}

}
