package javaPractice;

import java.util.Scanner;

public class ExtraCharacterInString {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		for(int i=0;i<=a.length();i++) {
			char ans=a.charAt(i);
		for(int j=0;j<b.length();j++) {
			if(ans==b.charAt(j)) {
				return;
			}else
				System.out.println(ans);
		}
		}
	}

}
