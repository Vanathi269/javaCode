package filereadingexceptionhandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderdemo {
	
	/*
	 * file reader
	 * a book..?
	 * nearest library and get me the book?
	 * which book
	 * and where is the book
	 * abc book 
	 * 
	 * reading
	 * 1.it is reading only one character at a time
	 * 2.it is returning the ASCII value of the read character
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException {
		writeData();
		readData();
	}
	public static void readData() throws IOException{
		
		String filepath="./src/FileReadingExceptionHandling/TestData";
		FileReader reader =new FileReader(filepath);
		//System.out.println(reader.read());//h ascii 
		//System.out.println((char)reader.read());//h character to print
		int value;
		while((value=reader.read())!=-1){
			//-1 is the end of the stream
			System.out.print((char)value);
		}
		reader.close();
	}
	
	public static void writeData() throws IOException {
		String filepath="./src/FileReadingExceptionHandling/TestData";
		FileWriter writer =new FileWriter(filepath);
		writer.write("my java program");
		writer.close();
	}

}
