package assignment;

import java.util.Scanner;

public class calculator {
	int n1;
	int n2;
	int add;
	int sub;
	int mul;
	float div;
	
	public void add1(int n1,int n2) {
		add=n1+n2;
		this.n1=n1;
		this.n2=n2;
		System.out.println("added number = "+add);
	}
	public void sub1(int n3,int n4) {
		sub=n3-n4;
		this.n1=n3;
		this.n2=n4;
		System.out.println("subracted number = "+sub);
	}
	public void mul1(int n5,int n6) {
		mul=n5*n6;
		this.n1=n5;
		this.n2=n6;
		System.out.println("multiplied number = "+mul);
	}
	public void div1(float n7,float n8) {
		div=n7/n8;
		this.n1=(int) n7;
		this.n2=(int) n8;
		System.out.println("divided number = "+div);
	}
	public static void main(String[] args) {
		calculator in= new calculator();
		Scanner obj=new Scanner(System.in);
		System.out.println("Calculator\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.exit");
		int choice;
		do
		{
		System.out.println("enter your choice");
		choice=obj.nextInt();
		switch(choice){
			case 1:{
				System.out.println("1st number to add");
				int n1=obj.nextInt();
				System.out.println("2nd number to add");
				int n2=obj.nextInt();
				in.add1(n1,n2);
				break;
			}
			case 2:{
				System.out.println("1st number to sub");
				int n3=obj.nextInt();
				System.out.println("2nd number to sub");
				int n4=obj.nextInt();
				in.sub1(n3,n4);
				break;
			}
			case 3:{
				System.out.println("1st number to multiply");
				int n5=obj.nextInt();
				System.out.println("2nd number to multiply");
				int n6=obj.nextInt();
				in.mul1(n5,n6);
				break;
			}
			case 4:{
				System.out.println("1st number to division");
				float n7=obj.nextFloat();
				System.out.println("2nd number to division");
				float n8=obj.nextFloat();
				in.div1(n7,n8);
				break;
			}
			case 5:{
				break;
			}
		}
	}
	while(choice!=5);
		
}
}


