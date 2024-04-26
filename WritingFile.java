package javaPractice;

import java.io.FileWriter;

public class WritingFile {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("D:\\file.txt");
			obj.write("this is the file i created");
			obj.close();
			System.out.println("executed....!");
			
		}catch(Exception e){
			System.out.println(e+"exception occured");
		}
	}

}
