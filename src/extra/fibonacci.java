package extra;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		Scanner obj=new Scanner(System.in);
		System.out.println("1st number to add");
		int tot=obj.nextInt();
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<tot;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
