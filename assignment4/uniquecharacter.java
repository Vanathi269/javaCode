package assignment4;

import java.util.Scanner;

public class uniquecharacter {
	public static void main(String args[]) {
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the required String: ");
	      String str = in.next();
	      System.out.println("Enter the required character: ");
	      char ch = in.next().toCharArray()[0];
	      int i = str.indexOf(ch);
	      if(i!=-1) {
	         System.out.println("Sting contains the specified character");
	      } else {
	         System.out.println("String doesn’t contain the specified character");
	      }
	   }
}
