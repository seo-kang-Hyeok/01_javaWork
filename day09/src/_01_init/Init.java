package _01_init;

public class Init {
	int num = 10;
	static int sNum = 100;
	
	// 인스턴스 초기화 블럭 : 객체가 생성될 때 호출
	{
		System.out.println("인스턴스 초기화 블럭");
		System.out.println("인스턴스 변수 num = " + num);
		num = 1;
	}
	
	// 클래스 초기화 블럭 : 클래스가 올래올때 호출
	static {
		System.out.println(); //시안성용
		System.out.println("클래스 초기화 블럭");
		System.out.println("인스턴스 변수 num = " + sNum);
		sNum = 200;
//		num = 1 호출불가 . 객체를 생성하지 않아 호출이 불가능하다.
		
	}
	// 생성자 : 객체가 생성될 때 //보통 이친구를 많이 사용합니다.
	Init() {
		System.out.println(); //시안성용
		System.out.println("생성자 호출");
		System.out.println("인스턴스 변수 num = " + num);
		System.out.println("클래스 변수 sNum = " + sNum);
		num = 2;	//객체가 생성되어 호출이 가능하다.클래스가 올라와서 저장공간이 생성되었다.
		sNum = 500;
	}
	
}
