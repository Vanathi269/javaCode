package basic;

public class string {

	/*
	 * String
	 * it is non primitive datatype
	 * it is a class
	 * 
	 * rule:
	 * 1.it is a final class
	 * 2.the objects are immutable(do not changed)
	 * 
	 * string usage:
	 * 1.string literal
	 * 	follow immutable rule
	 * 	objects are created inside string constant pool(SCP)
	 * 	before creating an object it checks if an object with the same value exists:
	 * 		if yes,it will not create anew object and point the same existing object
	 * 
	 * 
	 * 
	 * 2.using new keyword
	 * 	follow are immutable rule
	 * objects are created directly inside heap memory
	 * even though an object with similar value exists , it will still create a new object as we are using new keyword
	 * 
	 * 
	 * 
	 * 
	 *
	 */
public static void main(String[] args) {
	
	///string literal
	String name="vanathi";//name reference variable is pointing to object(vanathi) string is immutable
	System.out.println(name);
	name=name.concat(" ravichamdran");//we were changing the pointer towards to concat name
	System.out.println(name);
	
	//string using new keyword
	String s1=new String("main");
	System.out.println(s1);
	
	
	//string function
	String demo="hello world";
	System.out.println(demo);
	System.out.println(demo.contains("llo"));
	System.out.println(demo.charAt(5));
	System.out.println(demo.endsWith("rld"));
	System.out.println(demo.indexOf('l'));
	System.out.println(demo.isEmpty());
	System.out.println("the length of the string is"+demo.length());
	System.out.println(demo.toLowerCase());
	System.out.println(demo.toUpperCase());
	System.out.println(demo.substring(2));
	System.out.println(demo.substring(2,5));
	
	//String buffer
	//it is thread safe
	//multiple thread cannot works at the same time
	//String builder
	//supports multi threading(multi people can work on the one objects is called multi threading)
	//not thread safe
	//these are mutable representations of String class
	
	StringBuffer sb = new StringBuffer("programming");
	System.out.println(sb);
	sb.append("oops");//in stringbuffer we don't want re initialize value it will automatically add
	System.out.println(sb);
	
	StringBuilder sb1 = new StringBuilder("abc");
	System.out.println(sb1);
	sb1.append("school");
	System.out.println(sb1);
	
	System.out.println(sb1.deleteCharAt(2));
	System.out.println(sb1.reverse());
	
	String org="my name is vanathi";
	for(int i=org.length()-1;i>=0;--i) {
	System.out.print(org.charAt(i));}
}
	
}
