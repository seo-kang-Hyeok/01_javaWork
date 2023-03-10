package _02_staticlnst;

public class _01_StaticVarTest {

	public static void main(String[] args) {
		_01_StaticVar s1 = new _01_StaticVar();
		_01_StaticVar s2 = new _01_StaticVar();
		_01_StaticVar s3 = new _01_StaticVar();
		//.변수는 삼형, 초록 동그라미는 메서드, 빨간s는 클레스변수를 의미
		s1.num1 = 10;
		s2.num1 = 20;
		s3.num1 = 30;
		
		System.out.println("s1.num1 = " + s1.num1);
		System.out.println("s2.num1 = " + s2.num1);
		System.out.println("s3.num1 - " + s3.num1);
		System.out.println("-------------------------");
		
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 - " + s3.staNum1);
		System.out.println("-------------------------");
		
		s1.staNum1 = 500;
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 - " + s3.staNum1);
		//한 곳에서만 수정해도 어디에서 호출하던 모두 수정되서 추출됨.
		//static 변수들은 상위 클래스이기 때문?
		//1. 지역변수확인 2. 인스턴스 변수확인 3. 클레스 변수 확인.
		//static로 저장하면 객체를 생성하지 않아도 사용 가능하다.
		//사용방법 클레스이름.변수이름 
		//static 이 붙은건 클레스이름.변수이름 으로 호출하기를 권장한다.
		System.out.println("_01_StaticVar.staNum1 = " + _01_StaticVar.staNum1 );
		//Math.PI; = 클래스와 변수명으로 출력가능 static 이 붙어있다. 대분자 = 상수 final이 붙어있다. 
		System.out.println(Math.PI);
	
	}
}
