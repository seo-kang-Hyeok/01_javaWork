package _01_print;

public class Print02 {

	public static void main(String[] args) {
		
		//문자열에서 +는 연결기호, 숫자에서는 연산자
		System.out.println(5 + 3 + " : 5+3의 연산결과 출력");
		
		//문자열이 앞에 사용되면 뒤에 숫자도 문자로 인식됨.
		//+,-는 문자열 뒤에ㅓ 연산하고자 하면 반드시 괄호 안에 넣어야 한다.

		System.out.println("5+3의 연산결과 : " +  5 + 3 );
		System.out.println("5+5의 연산결과 : " + (5 + 3));
		System.out.println("5+3의 연산결과 : " + (5 - 3));
		
		// *,/ 은 상관없음
		System.out.println("5*3의 연산결과 : " + 5*3);
		System.out.println("5/3의 연산결과 : " + 5/3);
		

	}

}
