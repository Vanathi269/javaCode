package assingment3;

import java.util.LinkedList;
import java.util.List;

public class linkedlistiterator {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		System.out.println(list);
		
		for(String element:list) {
			System.out.println(element);

		}
	}

}
