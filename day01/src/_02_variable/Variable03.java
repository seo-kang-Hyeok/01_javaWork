package _02_variable;

public class Variable03 {

	public static void main(String[] args) {
		byte by1 = 10 ;
		System.out.println(by1) ;
		//byte 는 127보다 작은 수만 가능.8bit.
		//byte by2 = 128; = 출력 불가.

		short sh = 30000;
		System.out.println(sh);
		//char은 외따옴표 사용.
		//문자열에 있는 'ch1'을 숫자열 int로 출력.
		char ch1 = '가';
		int chInt = ch1;
		System.out.println("'가' 의 유니코드 : " + chInt);
		
		//double는 소수점 16자리 까지만 출력.
		double dou1 = 5/3.0;
		System.out.println(dou1);
		
		
				
		
	}

}
