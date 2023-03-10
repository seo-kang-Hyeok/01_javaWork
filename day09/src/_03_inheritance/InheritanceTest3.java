package _03_inheritance;
class A1{
	int i;
}

class B1 extends A1 { 
	String i;
}

public class InheritanceTest3 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.i = "KH정보교육원";
		System.out.println(b1.i);
//		우선순위는 자손의 변수가 있으면 먼저 실행됩니다.
//		b1.i = 100; 오류 B1클래스의 i변수를 먼저 수행하므로 자료형 맞지않음
//		내꺼에 있으면 내껄보고 없으면 조상클래스로 넘어갑니다. 나의 우선순위가 높다. 없으면 부모에게 올라간다.
//		나에게 i라는 변수가 있기 때문에 오류로 실행됩니다.
		
		A1 a1 = new A1();
		a1.i = 100;
		System.out.println(a1.i);
	}
}

