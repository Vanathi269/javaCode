package javaPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		File obj=new File("D:\\file.txt");
		Scanner myReader=new Scanner(obj);
		while(myReader.hasNext()) {
			String content=myReader.nextLine();
			System.out.println(content);
		}
	}

}
