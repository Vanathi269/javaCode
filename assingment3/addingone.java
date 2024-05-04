package assingment3;

import java.util.ArrayList;
import java.util.List;

public class addingone {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		System.out.println(list);
		list.add(0,"pink");
		System.out.println(list);

	}

}
