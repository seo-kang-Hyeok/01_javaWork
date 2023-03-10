package _01_object;

class kh {
	String addr = "서울";
	int num = 10;
}

class Student {
	String name = "홍길동";
	boolean gender = true;
	
}	// 실행되지 않는 라이브러리 같은 패키지 안에서만 사용가능하다.

public class _02_ObjectTest {
//public은 1개만 가능하다. public울 붙혀줘야 다른 프로젝트에서도 사용 가능!
	public static void main(String[] args) {
		kh kh1 = new kh();
		
		Student st = new Student();
		
		Car car = new Car();
		
	}

}
