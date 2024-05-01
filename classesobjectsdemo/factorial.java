package classesobjectsdemo;

import java.util.Scanner;

	public class factorial {

	    public static void main(String[] args) {
	    	Scanner val = new Scanner(System.in);
	    	System.out.println("enter the limit");
	    	int num = val.nextInt();
	        int fact = 1;
	        for(int i = 1; i <= num; i++)
	        {
	            fact= fact * i;
	           
	        }
	        System.out.printf("Factorial of "+ num +" is equal "+ fact);
	    }
	
	
	}

