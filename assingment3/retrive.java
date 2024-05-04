package assingment3;

import java.util.ArrayList;
import java.util.List;

public class retrive {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		list.add("pink");

		System.out.println(list);
		System.out.println("retrieved element"+list.get(2));


	}

}
