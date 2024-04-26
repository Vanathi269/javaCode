package javaPractice;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String a=in.nextLine();
		String b=" ";
		int lenOfString=a.length()-1;
		while(lenOfString>=0) {
			b=b+a.charAt(lenOfString);
			lenOfString--;
		}
		System.out.println("Reverse of String "+b);
	}

}
