package basic;
/*
 * DATA types:
 * defines the type of data we will store in the variable
 * it is compulsory to define the data types of each variable in java
 * 
 *  float rule :
 *  by default all the decimal values are considered as double by java
 *  add f in the end to make it float
 *  
 *  
 *  types
 *  1.primitive data type(8)
 *  	integers:byte,short,int,long
 *  	decimal:float,double
 *  	character:char
 *  	yes/no:boolean
 *  
 *  2.non-primitive data types
 *  
 *  
 *  
 *  identifiers:variables
 *  keywords:reserved words
 *  
 *  names as apple no they are reserved words we cannot use as variables
 */
public class datatypes {
public static void main(String[] args) {
	byte id=1;//-128 to +127
	System.out.println(id);
	byte b1=12;
	System.out.println(b1);
	short b3=132;//-32768 to +32767
	System.out.println(b3);
	int b4=32785;//-2^31 to +2^31
	System.out.println(b4);
	long b5=4355667;
	System.out.println(b5);
	
	float f1=34.2527f;//less than 8 digit
	//salary may declare in float
	System.out.println(f1);
	
	double d1=4545.564554;//greater than 8 digit
	System.out.println(d1);
	
	//character
	//anything u see on keyboard is a character
	//character is single value, we use single quotes
	char c1='a';
	char c2='1';
	char c3='*';
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	
	//boolean
	boolean b = true;
	boolean ispresent = false;
	System.out.println(ispresent);
	
	//true,false is valid keyword for java,True,False,0,1 are not valid because java is case sensitive
	
	
	//string
	//sequence of character is called string
	String na="vanathi";
	System.out.println(na);
	
}
}
