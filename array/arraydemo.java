package array;

import java.util.Scanner;

public class arraydemo {

	/*
	 * arrays:
	 * used to store multiple elements of same datatype
	 * 
	 * 
	 * rules:
	 * 1.it can contain only similar elements
	 * 2.while creating ,we need to define the size of the array
	 * 3.all the element are by default initialized 0 or null
	 * 
	 * 
	 * array has 3 parts:
	 * 1.declaration
	 * 2.instantiation
	 * 3.initialization
	 * 
	 * disadvantage of array:
	 * it is fixed in size
	 * 
	 */
	
	public static void main(String[]args) {
		int[] id;//declaration part
		id=new int[20];//instantiation
		id[0] =11;//initialization
		System.out.println(id[0]);
		System.out.println(id[1]);//value is 0
		id[1] =23;
		System.out.println(id[1]);
		System.out.println("the length of the array is"+id.length);
		//System.out.println(id[5]);//0, ArrayIndexOutOfBoundException
		
		//declaration + instantiation
		//int[] a=new int[10];
		
		
		//declaration+instantiation+initialization
		//int[] b={10,2,54};
	//	int name;
		int[] a1=new int[10];
		for(int i=0;i< a1.length;i++) {
			a1[i]=(i+1)*10;//10,20,30
			System.out.println(a1[i]);
		}
		
		
		int[] ab={23,45,98,102,11};
		//compare and store the value
		int max=ab[0];
		for(int i=0;i<ab.length;i++) {
			
			if(ab[i]>max) {
				max=ab[i];
			}
			}
		System.out.println("maximum value"+max);
			
		
		int[] abc={23,45,98,102,11};
		int min=abc[0];
		for(int i=abc.length-1;i>0;i--) {
			
			if(ab[i]<min) {
				min=abc[i];
			}
			}
		System.out.println("manimum value"+min);
		
		int sum=0;
		for(int i=0;i<ab.length;i++) {
			sum=sum+ab[i];
		}
		System.out.println(sum);
	double area;
	Scanner om=new Scanner(System.in);
	System.out.println("enter the lenght");
	double len=om.nextDouble();
	System.out.println("enter the breath");
	double bre=om.nextDouble();
	area=len*bre;
	System.out.println("the area is"+area);
	
	int temp;
	System.out.println("enter first number");
	int first=om.nextInt();
	System.out.println("enter second number");
	int second=om.nextInt();
	temp=first;
	first=second;
	second=temp;
	System.out.println("first="+first);
	System.out.println("second="+second);
	
	}
}
