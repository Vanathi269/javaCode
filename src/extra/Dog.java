package extra;

public class Dog extends Animal {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.makeSound();
		obj.eat();
	}

	
	void makeSound() {
		System.out.println("sounding");
		
	}

}
