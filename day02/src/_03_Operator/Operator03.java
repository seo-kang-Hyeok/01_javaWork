package _03_Operator;

public class Operator03 {

	public static void main(String[] args) {
//		비교연산자
//		>, <, >=, <=, ==(같다), !=(같지않다.)
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 > num2);
		
		boolean bool = num1 > num2;	//num1 이 num2 보다 큰가? 크면 true 아니면 false
		System.out.println(bool); 	//false
		
		bool = num1 == num2; 		//num1 과 num2 이 같은가? 같으면 true 아니면 false
		System.out.println(bool);	//false
		
		bool = num1 != num2;		//num1 과 num2 이 같지 않은가? 같지않으면 true 같으면 false
		System.out.println(bool);	//true
		
		/*논리연산자
		논리 값 두 개를 비교하는 연산자
		&& : 두 피연산자가 모두 true 일 때 true (AND) 모두 참이여야 참! 논리합
		|| : 두 피연산자 중 하나만 true 여도 true (OR) 하나라도 참이라면 참! 논리곱?그게머임?
		*
		*
		*/
	}

}
