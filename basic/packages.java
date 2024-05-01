package basic;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;//instead of using arraylist and linkedlist util
import encapsulation.workers;

public class packages {
/*
 * packages:
 * group of similar classes
 * 
 * 1.built-in
 * 2.user-defined
 * 
 * packagename.classname
 * packegename.*;
 * 
 * serializatin
 * objectinputstream
 * objectoutputstream
 * object is serialized and stored into database and when we want to read it we should deserialized            
 */
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> l;
		LinkedList<Integer> ll;
		workers w1=new workers();
		w1=null;
		
		
		
		String name;
		name="vanathi";
		System.out.println(name);
		ObjectOutputStream obj=new ObjectOutputStream(System.out);
		obj.writeObject(w1);
	}
}
