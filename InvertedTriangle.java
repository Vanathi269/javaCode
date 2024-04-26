package javaPractice;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=(n-i)) {
				System.out.print(" ");
				j++;
			}
			int k=0;
			while(k<=(2*(i-1))) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
