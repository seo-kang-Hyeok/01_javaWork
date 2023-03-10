package _01_abstract;

public class Dog extends Animal{
	Dog() {
		kind = "포유류";
	}

	@Override // 오타방지.
	void sound() {
		System.out.println("멍멍");
	}
}
