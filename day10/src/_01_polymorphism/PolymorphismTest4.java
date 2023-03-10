package _01_polymorphism;
class Animal {
	void breathe() {
		System.out.println("쒸익쒸익");
	}
	void sound() {
		System.out.println("부시럭 부시럭");
	}
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("으르렁 멍머머어멍ㄴ미ㅏㅜㅏ");
	}
}
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("안녕하세요. 고양입니다. 야옹");
	}
}
public class PolymorphismTest4 {
	public static void main(String[] args) {
		Animal a1;
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		a1 = dog; //형변환 a1은
		a1.sound();
		a1.breathe();
		
		a1 = cat;//형변환
		a1.sound();
		a1.breathe();
		
		cat = (Cat)a1;
//		dog = (Dog)a1; 불가능 . a1은 자식클래스cat 부모클래스Animal의 결합이다.
//		dog.sound();	불가능 . a1은 자식클래스cat 부모클래스Animal의 결합이다.
		
		Animal a2 = new Animal(); //부모 클래스만 생성.
//		cat = (Cat)a2; 부모 클래스로 만들어서 자식이 붙어있지 않기 떄문에 형변환 불가.자식을 낳은적이 없는데 어떻게 써요. 
//		강제 형변환 안됩니다. Animal객체만 생성되어 있기 떄문에 (Cat객체가 만들어 지지 않았음)
		
		Animal cat2 = new Cat(); //형변환
		cat2.breathe();
		cat2.sound();			//오버라이딩 해서 자식꺼씁니다.
		System.out.println();
	
		Animal dog2 = new Dog(); //형변환
		dog2.breathe();
		dog2.sound();			//오버라이딩 해서 자식꺼씁니다.
		System.out.println();
		
//		클래스명 instanceof 클래스명
//		왼쪽의 객체가 오른쪽의 객체의 타입으로 만들어졌느냐를 검사.
		Animal a3 = new Cat();
		if(a3 instanceof Cat) {
		Cat cat1 = (Cat) a3;
			System.out.println("자식클래스로 변환됨");
		} else {
			System.out.println("자식클래스로 강제 형변환 안됨");
		}
		
		Animal a4 = new Animal();
		if(a4 instanceof Cat) {
			Cat cat1 = (Cat)a4;
			System.out.println("자식클래스로 변환됨");
		} else {
			System.out.println("자식클래스로 강제형변환 안됨");
		}
		
	}
}