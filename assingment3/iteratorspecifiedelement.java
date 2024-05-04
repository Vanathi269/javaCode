package assingment3;

 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorspecifiedelement {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>() ;
		list.add("red");
		list.add("violet");
		list.add("grey");
		System.out.println(list);
		
		Iterator p =list.listIterator(1);

		   while (p.hasNext()) {
		   System.out.println(p.next());
	}
	}
}
