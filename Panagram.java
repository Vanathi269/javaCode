package javaPractice;

import java.util.Scanner;

public class Panagram {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  sen;
		sen=sc.next();
		
		String sen1 = "Thequickbrownfoxjumpsoverthelazydog";
		if(panagram(sen)) {
		System.out.println("the given sentence is panagram");
		}else {
			System.out.println("the given sentence is not panagram");
		}
	}
	static boolean panagram(String s) {
		int n=s.length();
		if(n<26) {
			return false;
		}
		Boolean visited[]=new Boolean[26];
		for(int i=0;i<n;i++) {
		char x=s.charAt(i);
		if(x>='a'&&x>='z') {
			int letter=x-'a';
			visited[letter]=true;
		}
		}for(int i=0;i<26;i++) {
		if(visited[i]=false){
			return false;
		}
	}
	return true;
		}


}
