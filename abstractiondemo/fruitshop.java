package abstractiondemo;

public class fruitshop implements shoprule {

	@Override
	public void shopfeet() {
		System.out.println("the feet should 10 by 10");
		
	}

	@Override
	public void shoploc() {
		System.out.println("the location should be good");
		
	}

	@Override
	public void shopitems() {
		System.out.println("the item should quality");
		
		
	}
	public void shopname() {
		System.out.println("the name of the shop is fruitshop");
	}
	

}
