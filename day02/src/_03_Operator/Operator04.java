package _03_Operator;

public class Operator04 {

	public static void main(String[] args) {
//		논리연산자와 그예시
//		논리 값 두 개를 비교하는 연산자
//		&& : 조건이 모두 다 참 일때만 참. 두 피연산자가 모두 true 일 때 true (AND) 모두 참이여야 참! 논리합
//		|| : 조건 중 1개라도 참이 있으면 참. 두 피연산자 중 하나만 true 여도 true (OR) 하나라도 참이라면 참! 논리곱?그게머임?
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 > 20 && num2 > 5); //( false && true ) //false 출력. 둘 다 참이어야 참.
		System.out.println(num1 > 20 || num2 > 5); //( false || true ) //true 출력. 1개만 참이어도 참.
		System.out.println("------------------------");
		
		int num3 = 10;
		System.out.println(num1 < 20 && num2 > 5 && num3 < 15); // ( true && true && true  ) // true 출력.
		System.out.println(num1 < 20 || num2 > 5 || num3 > 15); // ( true || true || false ) // true 출력. 
		System.out.println("------------------------");
		
		// ! : not
		boolean bool = true;
		bool = !bool; 				//bool은 bool이 아니다!?
		System.out.println(bool); 	//false 아닌디;
		
		char ch = '[';				//역슬래시는 두번 입력해줘야 역슬레시라고 이해함. 아니면 입력기다림.
		
		bool = ch < 'C';			//아스킥코드상 C의 숫자가 A보다 큼!
		System.out.println(bool);
		System.out.println("------------------------");  
		
		System.out.println((ch >= 'A') && (ch <= 'Z'));  //ch는 A보다 크거나 같고 Z보다 작거나 같다. 보기 변하게 개체마다 괄호를 해줌.
		System.out.println((ch >= 'a') && (ch <= 'z'));  //소문자는 더 큼!
		System.out.println((ch >= 'A') && (ch <= 'Z') || (ch>='a') && (ch<='z'));
		
		
	}

}
