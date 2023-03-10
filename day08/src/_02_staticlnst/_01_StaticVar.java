package _02_staticlnst;

public class _01_StaticVar {
	//인스턴스 변수 지금까지 사용했던 변수들.
	int num1;
	String str;
	double dou1;
	boolean b1;
	
	//클래스 변수 = 공동으로 사용한다. 
	//거의 변경되지 않거나 객체가 생성되어도 값을 모두 같이 사용할때.
	//보통 똑같이 사용하는 것들을 넣어주는 것이 좋다.
	static int staNum1 = 100;
	static String staStr1 = "KH정보교육원";
	static double staDou1 = 3.14;
	static boolean staB1 = true;
	//값을 지정하지않으면 null . false. 0. 으로 들어갑니다.
	
	
}
