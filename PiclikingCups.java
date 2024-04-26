package javaPractice;

import java.util.Scanner;

public class PiclikingCups {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//first cup should be picked by you(odd chance)
		//second chance is given to opponent(even chance)
		int chance=in.nextInt();
		if(chance%2==0) {
			System.out.println("opponent will pick the cup last");
			
		}else
			System.out.println("you will pick the cup last");
	}
}
