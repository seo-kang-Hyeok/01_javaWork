package _02_Casting;

public class _03_OperCasting {

	public static void main(String[] args) {
//		*연산과 형변환 .
		
		byte b1 = 10;
		byte b2 = 30;
		
		int int1 = b1 + b2; // int형보다 작은 자료형을 연산하면 int로 자동 형변환
		byte b3 = (byte)(b1 + b2);  // 명시적 형변환
	
		short s1 = 34;
		short s2 = 54;
		
		int int2 = s2 - s1;
		int int3 = s1 * b1;
		
		char c1 = '&';
		char c2 = 'a' + 3;
		int c3 = c1 + c2; //char이 int로 자동 형변환됨.
		System.out.println(c3);
		
		//int 보다 큰 자료형으로 사칙연산을 하면 큰 자료형으로 자동형변환.
		long long1 = 1234L;
		long c4 = long1 * c3; //2개중 큰 것 으로 자동 형변환.
		
		float f1 = 3.15f;//소주점 이하의 자료는 더블로 인식. 뒤에f로 float 형입니다. 지정해줘야 됨.
//		float f1 = (float)3.15; //혹은 명시적 형변환 하여야함.
		float f2 = f1 + c3;
		
		char c5 = 'a';
//		char c6 = c5 + 10 ; //오류 발생. 사칙연산시 자동으로 int로 변환되기 때문에 앞에 char로 넣으면 오류. int로 지정해야함. 
		
	
		
		
		
		
	}

}
