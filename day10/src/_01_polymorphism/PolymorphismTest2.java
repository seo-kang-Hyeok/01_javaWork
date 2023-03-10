package _01_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent-method1()");
	}
	void method2() {
		System.out.println("parent-method2()");
	}
}
class Child extends Parent {
	@Override
	void method2() {
		System.out.println("parent-method2()를 오버라이딩");
	}
	void method3() {
		System.out.println("child-methid3()");
	}
	void method4() {
		System.out.println("child-methid4()");
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		
//		Child c1 = new Child();
//		Parent p1 = c1;
//		한 줄로 줄여 쓰기 가능! 형번환하믄대
		Parent p1 = new Child(); //나 자식인데 엄빠꺼만 쓸라요.
		p1.method1();
		//오버라이딩을 한 경우 부모타입으로 형변환을 했어도 자식것이 호출됨.
		p1.method2(); //엄빠꺼 사용가능.
		
//		p1.pmethod3();  자식을 부모로 형변환 해서 자식의 메서드는 사용 할 수 없다.
		
	}

}
