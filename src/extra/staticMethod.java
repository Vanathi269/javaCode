package extra;

public class staticMethod {
	int mul;
	static int sum;
public void multiply(int a,int b) {
	mul=a*b;
	System.out.println("multiplied value "+mul);
}
static void add(int a,int b) {
	sum=a+b;
	System.out.println("added value "+sum);
	
}
	public static void main(String[] args) {
		staticMethod st=new staticMethod();
		st.multiply(2, 2);
		staticMethod.add(2, 3);
	}

}
