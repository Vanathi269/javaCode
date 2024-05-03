package inheritance;

public class methodoverloading {
	public void add(int a,int b) {
		System.out.println("adding two int numbers");
	}
	public void add(float a,float b){
		System.out.println("adding 2 float number");
	}
	public void add(int a,int b,int c) {
		System.out.println("adding 3 int number");
	}
public static void main(String[] args) {
	methodoverloading obj=new methodoverloading();
	obj.add(10,12.3f);
	obj.add(2, 30);
}
}
