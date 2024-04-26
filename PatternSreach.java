package javaPractice;

import java.util.Scanner;

public class PatternSreach {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String pat=in.nextLine();
		for(int i=0;i<str.length()-pat.length()+1;i++) {
			if(str.substring(i,i+pat.length()).equals(pat)){
				System.out.print(pat+" ");
			}
		}

	}

}
