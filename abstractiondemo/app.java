package abstractiondemo;

public class app {
	public static void main(String[] args) {
		vegshop in = new vegshop();
		in.shopfeet();
		in.shopitems();
		
		fruitshop as = new fruitshop();
		as.shopfeet();
		as.shoploc();
		as.shopname();
		
		
		//shoprule rule=new shoprule(); we cannot create an object of interface
		
		shoprule s1 =new fruitshop();//dynamic dispatch
		//s1.shopname here the method in the shoprule interface should be called,we cannot call the direct method from the fruitshop class
		//not allowed since the ref_var is or interface
		s1.shopfeet();

	}

}
