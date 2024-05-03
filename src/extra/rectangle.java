package extra;

import java.util.Scanner;

public class rectangle implements polygon {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("enter the lenght");
		int lenght=in.nextInt();
		System.out.println("enter the widht");
		int width=in.nextInt();
		rectangle obj=new rectangle();
		obj.getArea(lenght, width);
		
	}

	
	public void getArea( int length ,int width) {
		
		int area=((length*width)/2);
		System.out.println("Area is "+area);
	}

}
