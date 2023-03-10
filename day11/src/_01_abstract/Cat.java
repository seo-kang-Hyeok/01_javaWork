package _01_abstract;

public class Cat extends Animal {
	Cat() {
		kind = "포유류";
	}
	@Override
	void sound() {
		System.out.println("야옹");
		
	}
}
