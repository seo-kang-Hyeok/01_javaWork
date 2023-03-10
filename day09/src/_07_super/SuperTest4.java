package _07_super;

class Parent3 {
	int x;
	Parent3(int x) {
		this.x = x*x;
//		System.out.println("매개변수의 값 "+ x +"의 제곱을 하여 인스턴스 변수에 저장 합니다.");
//		System.out.println(this.x); 혹은
//		System.out.println(x + "의 제곱 = " + this.x);혹은
	}
}

class Child3 extends Parent3{
	int y;
	Child3(int x, int y) {
		super(x); //부모의 x 값을 넣어줍니다.
		this.y = y*y;
//		System.out.println("매개변수의 값 "+y+"의 제곱을 하여 인스턴스 변수에 저장 합니다.");
//		System.out.println(this.y);혹은
//		System.out.println(y + "의 제곱 = " + this.y);혹은
	}
}

public class SuperTest4 {
	public static void main(String[] args) {
		Child3 ch3 = new Child3(3,7);
		System.out.println("x변수의 제곱 = " + ch3.x);
		System.out.println("Y변수의 제곱 = " + ch3.y);
	}
}