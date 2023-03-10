package _02_objectMethod;
class Op {
	//method(기능)
	void print1() { //리턴 값이 없다? 저장 할 수 없다??
		System.out.println("반환값이 없고 매개변수가 없는 메서드");
	}
	
	int print2() { //반환값을 int로 넣었으므로 반환하는 것은 int형이여야 한다.
		System.out.println("반환값이 정수형이고 매개변수가 없는 메서드");
		return 10;	//나를 호출 한 곳으로 나를 가져가라 10을 되돌려줘라...?
	}		
	String print3() {
		System.out.println("반환값이 문자열이고 매개변수가 없는 메서드");
		return "kh정보교육원";
	}
	boolean print4() {
		System.out.println("반환값이 boolean이고 매개변수가 없는 메서드");
		return true;
	}
	//매개변수가 있는 메소드
	void print5(int x) {
		System.out.println("반환값은 없고, 매개변수가 1개인 메서드");
		int result = x + 10;
		System.out.println(result);
	}
	
	String print6(String name) {
		System.out.println("반환값은 없고, 매개변수가 문자열 1개인 메서드");
		return name + "님 반갑습니다.";
	}
	
	int print7(int x, int y) {
		int result = x + y;
		return result;
	}
}
public class _01_MethodTest {
	public static void main(String[] args) {
		Op op1 =new Op();
		op1.print1();
		op1.print2(); //출력하고 10이 들어온다!
		
		int result = op1.print2();
		System.out.println(result);
		System.out.println("---------------------------");
		
		System.out.println(op1.print2()); 
		//호출! 위로 올라감 ! return ! 10을 가지고 돌아온다! 
		
		System.out.println(op1.print3());
		
		op1.print5(50);
		System.out.println(op1.print6("홍길동"));
	
		result = op1.print7(5,  10);  //덮어쓰기.
		System.out.println(result);
		//System.out.pprintln(op1.print7(5,10));
		
		
	}

}
