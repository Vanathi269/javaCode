package filereadingexceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreaderdemo {

	public static void main(String[] args) throws IOException {
		String filepath="./src/FileReadingExceptionHandling/TestData";
		FileReader reader =new FileReader(filepath);
		BufferedReader br=new BufferedReader(reader);
		System.out.println(br.readLine());
		String value;
		while((value= br.readLine())!=null){
			System.out.println(value);
			
		}
		br.close();

	}

}
