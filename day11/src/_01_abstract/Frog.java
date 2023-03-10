package _01_abstract;

public class Frog extends Animal{
	Frog() { 
		kind = "양서류";
	}

	@Override
	void sound() {
		System.out.println("꾸엑꾸엑");
		
	}
}
