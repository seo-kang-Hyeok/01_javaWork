package _03_inheritance;
//여기에 클래스를 만들어도 됩니다. 클래스가 2개 될 수도 있습니다. public는 1개만 붙힐 수 있습니다.
class A {
	int aa = 1;
}
class B extends A { //A클레스로 부터 상속 받을께요.
	int bb = 10;
}
class C extends B { //B클레스로 부터상속 받을께요.
	int cc = 30;
}	//C는 B를 포함하고 B는 A를 포함합니다.

public class InheritanceTest01 {
	public static void main(String[] args) {
		C objC = new C(); //C를 이용해서 객체 생성하겠습니다.
		System.out.println("aa = " + objC.aa); //내부 클래스는 클래스명.변수로 불러 올 수 있습니다.
		System.out.println("bb = " + objC.bb);
		System.out.println("cc = " + objC.cc);

		B objB = new B();
		System.out.println("aa = " + objB.aa);
		System.out.println("bb = " + objB.bb);
//		System.out.println("cc = " + objB.cc); 사용불가 B는C를 사용 할 수 없기 때문이다.
		
		A objA = new A();
		System.out.println("aa = " + objA.aa);
//		System.out.println("bb = " + objA.bb); 사용불가
//		System.out.println("cc = " + objA.cc); 사용불가



	}
}
