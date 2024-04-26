package javaPractice;

import java.io.File;

public class CreatingFile {

	public static void main(String[] args) {
		try {
			File obj=new File("D:\\File.txt");
			if(obj.createNewFile()) {
				System.out.println(obj.getName()+"file created");
			}else {
				System.out.println("already exist");
			}
		}catch(Exception e) {
			System.out.println(e+"exception occured");
		}
	}

}
