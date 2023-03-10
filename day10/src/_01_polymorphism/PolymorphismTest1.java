package _01_polymorphism;
class A {  }
class B extends A {  }
class C extends A {  }
class D extends B {  }
class E extends C {  }

public class PolymorphismTest1 {
	public static void main(String[] args) {
		B b = new B();  //B 위에 A있디.
		C c = new C();
		D d = new D();
		E e = new E();
		// 다형성 : class 자도 형변환
		A a1 = b; 	//???
		A a2 = c;	//C는 A를 상속 받았지. C를 A타입으로 형변환하겠다!(C안쓰겠다)
		A a3 = d;	//D는 B를 상속 받았지. B는 A를 상속 받았지. A로 형변환 하겠다!(B,D안쓰겠다)
		A a4 = e;	//E는 C를 상속 받았지. C는 A를 상속 받았지.A타입으로 형변환 하겠다!(C,E안쓰겠다)
//		A 상속받은 애들은 A로 형변환 가능하다!
		B b1 = d;	//D는 B를 상속 받았지. B타입으로 형 변환하겠다!(D안쓸랭)
		C c1 = e; 	//E는 C를 상속 받았지. C타입으로 형 변환하겠다!(E안쓸랭)
		//이게 전부 자동 형변환입니다.
		//자식이 부모로 형변환 자동형변환됨.
	
	}
	

}
