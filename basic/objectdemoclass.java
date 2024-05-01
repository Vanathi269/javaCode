package basic;

public class objectdemoclass implements Cloneable{
	int id;
	String name;
	
	public objectdemoclass(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) throws Throwable {
		objectdemoclass obj=new objectdemoclass(1,"vanathi");
		objectdemoclass obj1=(objectdemoclass)obj.clone();
		System.out.println(obj.id);
		System.out.println(obj1.id);
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj.toString());
		//obj.wait();
		//obj.notify();
		//obj.finalize();
		
Object[] a=new Object[4];
a[0]=1;
a[1]="ajay";
System.out.println(a[0]);
System.out.println(a[1]);

	}

}
