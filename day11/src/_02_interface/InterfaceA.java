package _02_interface;

public interface InterfaceA {
	public static final int MAX = 100; //변경 불가. 값을 지정해줘야한다.
	int MIN = 0; //앞에 쓰지 않아도 자동으로 컴파일됨.
	//public static final int Min = 0; 과 같다.
	
	public void methodA();
	public void methodA1();

//	구현되어 있는 메소드가 있으면 안됨.
//	public void methodAA();
//		System.out.println("dddd"); 구현된 매소드 = 오류발생.
}
