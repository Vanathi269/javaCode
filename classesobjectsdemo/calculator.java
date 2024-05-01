package classesobjectsdemo;

import java.util.Scanner;

public class calculator {
	int n1;
	int n2;
	int add;
	int sub;
	
	public void add1(int n1,int n2) {//it is local
		//System.out.println("constructor");
		add=n1+n2;
		this.n1=n1;
		this.n2=n2;
		System.out.println(add);//assigning global variable to local variable
	}
		public void sub1(int n1,int n2) {//it is local
			//System.out.println("3 parameter working");
			sub=n1-n2;
			this.n1=n1;
			this.n2=n2;
			System.out.println(sub);
			//this.mno=mno;//assigning global variable to local variable
				
	}

	
	public static void main(String[] args) {
		calculator in= new calculator();
		Scanner obj=new Scanner(System.in);
		System.out.println("1st no");
		int n1=obj.nextInt();
		System.out.println("2nd no");
		int n2=obj.nextInt();
		in.add1(n1,n2);
		in.sub1(n1,n2);
				

	
}
}
