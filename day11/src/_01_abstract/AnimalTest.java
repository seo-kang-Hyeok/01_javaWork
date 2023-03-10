package _01_abstract;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		
		dog.sound();
		cat.sound();
		frog.sound();
		System.out.println();
		//추상클래스는 객체 생성안됨. = 메서드가 구현되어 있지않기 때문에 아무것도 할 수 없기 때문.
		//Animal a = new Animal();
		
		//형변환은 가능
		Animal ani = dog; //오버라이딩된 것은 무조건 자식것이 호출 됨.
		ani.sound();
		
		ani = cat;
		ani.sound();
		
		ani = frog;
		ani.sound();
		//누가 들어가는 지를 넣어줘야하죠? 메서드로 지정해두고 사용해 두면 편합니다. - 메인 하단에 작성
		//이처럼 반복되어 사용되는 것들은 메서드를 지정해 사용하시면 됩니다.
		System.out.println("----------------");
		
		aniSound(new Cat());
		aniSound(new Dog());
		aniSound(new Frog());
		
	}
	static void aniSound(Animal ani) {
		ani.sound();
	
		
	}
}
