package filereadingexceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionhandlingdemo {
	/*
	 * exception: it is an abnormal condition
	 * is an event that disrupts the normal flow of the program
	 * 
	 * flight?2 hours>>delayed by 5 hours
	 * 
	 * exception handling: what to do if the the exception occurs
	 * 
	 * try:risky lines of code which might throw an excetion
	 * catch:what to do if the the excetion has occured
	 * finally:what to do irrespective of the exception
	 * 
	 * types of exception:
	 * 1.compile time -the error occur before running the code or exception suggestion displayed at compile time
	 * 2.runtime -the error while running the code
	 * 
	 * 
	 * FileNotFound(ist declaration)>> can handle (FNException) IOException(2nd declaration) >>Exception
	 * 
	 * the problem in exceptin is after completion of try catch statement we cannot able execute if the exception is occured
	 */

	public static void main(String[] args) throws IOException {
		String filepath="./src/filereadingexceptionhandling/testdata";
		System.out.println("opening the db connection");
		try {
			System.out.println("trying to open the file");
			FileReader reader=new FileReader(filepath);
			reader.read();
			int value;
			while((value=reader.read())!=-1){//used to print all the value
				//-1 is the end of the stream
				System.out.print((char)value);
			}
			
		}catch(FileNotFoundException e){
			//e.printStackTrace(); exception url
			System.out.println("file not found please check the file");
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		finally {
			System.out.println("closing the db connection");
		}
		try {
			//System.out.println(9/0);
			int[] a=new int[5];
			//System.out.println(a[6]); if the excetion occurs it go to the excetion oyther wise throw will exceute
			throw new NullPointerException(); //it throw to the particular exception
			//throw new IOException();//throw is an keyword used to throw exception
		}catch(ArithmeticException e) {//child class
			System.out.println("cannot divided by zero");
		}catch(IndexOutOfBoundsException e) {//parent class
			System.out.println("index out of range");
		}catch(Exception e) {//grand parent class
			System.out.println("handled the exception");
		}
		
		System.out.println("nextline");
	}
}
