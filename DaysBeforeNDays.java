package javaPractice;

import java.util.Scanner;

public class DaysBeforeNDays {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the day from 0 to 6");
		int n=in.nextInt();
		System.out.println("enter the day before");
		int b=in.nextInt();
		if(b>7) {
			b=b-7;
		}
		int result=n-b;
		if(result>0) {
			return;
		}else
			result+=7;//if value was in minus add 7 to cal backward
		switch(result) {
		case 0: {
			System.out.println("sunday");
			break;
		}
		case 1: {
			System.out.println("monday");
			break;
		}
		case 2: {
			System.out.println("tuesday");
			break;
		}
		case 3: {
			System.out.println("wednesday");
			break;
		}
		case 4: {
			System.out.println("thursday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("saturday");
			break;
		}
		
		}
		
	}

}
