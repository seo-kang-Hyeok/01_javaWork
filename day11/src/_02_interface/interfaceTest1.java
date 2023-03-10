package _02_interface;

public class interfaceTest1 {
	public static void main(String[] args) {
		InterClass ic = new InterClass();
		//Interface를 상속받았기 때문에 Interface 형변환이 가능하다.
		
		//인터페이스는 객체를 생성 할 수 없다.
		//자료형변환은 가능.
		Interface interf = ic; //부모타입
		interf.method();
		interf.methodA();
		interf.methodB1();
		System.out.println(interf.MAX);
	
		InterfaceA interA = ic; //부모의 부모타입
		interA.methodA();
		
		InterfaceB interB = ic; //부모의 부모타입 모두 가능하다.
		interB.methodB1();
	}
}
