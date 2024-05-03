package extra;

public class constructorOverloading {
float sum;
int id;
	constructorOverloading(int a,int b){
		sum=a+b;
		System.out.println(sum);
	}
	constructorOverloading(float a,float b,float d){
		sum=a+b+d;
		System.out.println(sum);
	}
	constructorOverloading(int a,int b,int c){
		sum=a+b+c;
		System.out.println(sum);
	}
	constructorOverloading(){
		System.out.println("hi everyone...!");
	}
	public static void main(String[] args) {
		constructorOverloading obj=new constructorOverloading();
		constructorOverloading obj1=new constructorOverloading(1.2f,4,3.0f);

	}

}
