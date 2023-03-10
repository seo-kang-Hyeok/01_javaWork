package _07_super;
class Parent2 {
	int x;
	Parent2(int x) {
		this.x = x;
		System.out.println("부모 생성자");
	}

}
class Child2 extends Parent2{ //자식 객체 생성하면 부모객체가 생성됩니다. 그런데 부모의 값이 들어와있지 않으면
	int x = 10;
	Child2() {
		// super는 부모의 생성자를 의미
		super(100);
		System.out.println("자식 생성자");
	}
	void superX() {
		System.out.println(super.x);
	}
}

public class SuperTest3 {
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		ch2.superX();
	
	}
}