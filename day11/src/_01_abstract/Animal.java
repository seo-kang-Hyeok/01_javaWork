package _01_abstract;

abstract public class Animal { //클래스 앞에  abstract! 순서는 public 앞이던 뒤던 상관 없습니다.
	String kind;

	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	abstract void sound();
}
//