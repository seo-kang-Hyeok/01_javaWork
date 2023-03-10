package _06_overriding;
class Ea {
	void print() {
		System.out.println("부모 클래스의 ptint() 메서드");
	}
}

class Eb extends Ea {
	void print() {
		System.out.println("자식 클래스의 print() 메서드");
	} //void 반환형 같다. print 변수명 같다.
}
public class OverridingTest1 {
	public static void main(String[] args) {
		Eb eb = new Eb();
		eb.print(); //출력 자식 클래스의 print() 메서드 
		//오버라이딩 된다( 상속에서만 사용.)
		
		Ob ob = new Ob();
		ob.show(); //오버로딩(상속,메서드,생성자 사용)
		ob.show("인자1개");
	}
}
class Oa {
	void show( ) {
		System.out.println("부모 show() 메서드");
	}
}
class Ob extends Oa {
	//오버로딩 매개변수가 다릅니다.
	void show(String name) {
		System.out.println("자식 show() 메서드 " + name);
	}
}