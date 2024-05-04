package assingment3;

import java.util.LinkedList;
import java.util.List;

public class addingspecifyone {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		list.add("pink");

		System.out.println(list);
		list.add(0,"blue");
		list.add(2,"orange");
		System.out.println("added list"+list);

	}

}
