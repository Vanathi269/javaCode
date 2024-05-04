package assingment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		System.out.println("Original linked list:" + list);  
		 
	    Iterator it = ((LinkedList<String>) list).descendingIterator();

	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }

	}

}
