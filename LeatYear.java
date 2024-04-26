package javaPractice;

import java.util.Scanner;

public class LeatYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year=in.nextInt();
		if((year%4==0) && (year%100!=0)) {
			System.out.println("Leat Year");
		}else if(year%400==0) {
			System.out.println("Leap year");
		}else{
			System.out.println("Not leap year");
		}
	}

}
