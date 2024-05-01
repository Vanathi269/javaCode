package basic;

public class methodsdemo {
/*
 * method:
 * access_modifier static_instance return_type method_name(parameter name)
 */
	public static void main(String[] args) {
	m2();//static function we don't want to create object
	methodsdemo obj=new methodsdemo();
	obj.m1();
	obj.printname();
	obj.getandprintname("abinaya");
	obj.add(10, 10);
	int total = obj.addreturn(12,12);
	System.out.println(total);

	}
public void m1() {
	System.out.println("m1");

}
public static void m2() {      //static method
	System.out.println("m2");
}

public void printname() {
	System.out.println("vanathi");
}
public void getandprintname(String name) {  //instance method no static keyword
	System.out.println(name);
	
	
}
//add 2 number and print it
public void add(int a,int b) {
	int sum=a+b;
	System.out.println(sum);
}


//add 2 number and return me thetotal
public int addreturn(int a,int b) {  //returning we should not use void data type should be written
	int sum=a+b;
	return sum;
}

}
