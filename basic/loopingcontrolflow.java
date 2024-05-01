package basic;

import java.util.Scanner;

public class loopingcontrolflow {
	public static void main(String[] args) {
		/*
		 * loop
		 * loops are used to perform same action again and again
		 * while using for loop we know the ending limit
		 */
		//printing name
		for(int i=1;i<10;i++) {
			//System.out.println("vanathi");
		}
		//printing no 1 to 10	
		for(int j=1;j<=10;j++) {
			//System.out.println(j);
			//System.out.println("vanathi");
			
		}
		//System.out.println("stopped");
		
		
		
		int counter =16;
	while (counter<=10) {
			System.out.println(counter);
		counter=counter+1;}
		
		
		int c=16;
		do {
			System.out.println(c);
			c++;
		}while(c<=10);
			
		
			
		
		
		//if name is ajay print trainer or else print participant
		//used to control the flow of execution
		//decision that which line should be executed
		//.equals to for string
		String name="pooja";
		if(name.equals("ajay")) {
			System.out.println("trainer");}
		else {
			System.out.println("participant");}
		//age to vote
		int age=23;
		if(age<18) {
			System.out.println("not eligible to vote");
		}
		else
			System.out.println("eligible to vote");
		}
		
		
		//if id is 1,then print manager
		//if id is 2,then print admin
		//if id is 3,then print staff/
		//else employee
		
		int empid = 4;{
		if (empid==1) {
			System.out.println("manager");
		}
		else if(empid ==2){
			System.out.println("staff");
		
		}
		else if(empid==3) {
			System.out.println("staff");
		}
		else
		System.out.println("employee");
		
		
		//to print the day by number
		int daynumber;
		Scanner in=new Scanner(System.in);
		System.out.println("the number to print day");
		daynumber=in.nextInt();
		int day=3;
		if(day==1) {
			System.out.println("monday");
			
	}
		else if(day==2){
			System.out.println("tuesday");
		}
		else if(day==3){
			System.out.println("wednesday");
		}
		else if(day==4){
			System.out.println("thursday");
		}
		else if(day==5){
			System.out.println("friday");
		}
	else if(day==6){
			System.out.println("saturday");
		}
		else if(day==7) {
			System.out.println("sunday");
		}
		else 
			System.out.println("please enter a valid number between 1 to 7");
		
		//switch case//ambiquity problem
		/*switch(daynumber) {
		case 1:
			System.out.println("monday");
		case 2:
			System.out.println("tuesday");
		case 3:
			System.out.println("wadnesday");
		case 4:
			System.out.println("thursday");
		case 5:
			System.out.println("friday");
		case 6:
			System.out.println("saturday");
		case 7:
			System.out.println("sunday");
		 defualt:
			break;
			}
		*/
		 
		 /*
		  * if value<5
		  * and greater than 2 :: print greater than 2 but less then 5
		  * and less than 2 :: print less than 5 and less than 2
		  * 
		  * if value >5
		  * print greater than 5
		  */
		
		/* int value=2;
		 if(value<5) {
			 if(value>2) {
				 System.out.println("the value is greater than 2 but less than 5");
			 }
			 else
				 System.out.println("the value is less than 5 and less than 2");
		 }
		 else {
			 System.out.println("the value is greater than 5");}
		*/
		 //dept="it" and living in "mumbai" and age>18
		 String dept="it";
		 String loc="mumbai";
		 int age=34;
		 if(dept.equals("it")&&loc.equals("mumbai")&&(age>18))
			 System.out.println("vanATHI");
	
		 
		 
		 
	 
	}
	}
