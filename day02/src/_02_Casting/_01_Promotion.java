package _02_Casting;

public class _01_Promotion {

	public static void main(String[] args) {
//		* 큰제목 형변환
//		묵시적 형변환 테스트
		int num1 = 1234567890;
		int num2 = 1234567890;
			
		//자동형 변환 작은 타입 -> 큰 타입에 넣을 때
		//자동으로 형이 변환 되어 들어간다.
		
		float num3 = num2; //묵시적 형변환 float가 int 보다 큰 형식이기 때문에 자동으로 변환 됨.
//		byte byte1 = num1; //명시적 형변환byte 가 int 보다 작은 형식이기 때문에 자동으로 변환되지 않음.
//	    (1byte)    (4byte) 
		
		long num4 = num1;
		int result = num1 * num2; //자동으로 변환되나 int의 범위를 넘어서기 때문에 정확한 값이 나오지 않음.
		System.out.println(result);
			
		byte b1 = 40;
		short sh1 = b1; //char는 들어가지 않음. 이유? char은 음수가 없기 때문. 
			
		char ch = 'H';
		int num5  = b1;
		num5 = b1;
		num5 = sh1;
			
//		double 은 가장 큰 범위이기 때문에 무엇을 넣어도 변환가능.int등.
		double dou1 = ch;
		dou1 = num5;
		dou1 = b1;
		dou1 = sh1;
			
//		byte -> short -> int -> long -> float -> double
//				char  ->
		//작은 것에서 큰 것은 자동 형변환이 된다.
		
	}

}
