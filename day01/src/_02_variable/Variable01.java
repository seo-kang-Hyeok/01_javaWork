package _02_variable;

public class Variable01 {

	public static void main(String[] args) {
		//정수
		
		int number;
		number = 25 ;
		
		int number2 = 30;
		
		System.out.println(number+number2);
		
		int result = number + number2;
		System.out.println(result);
		System.out.println(result*3);
		System.out.println(result/5);
		System.out.println(result*number);
		System.out.println("---------------------------");
		//int 넣지 않으면 기존 변수 사용. = 덮어쓰기.
		//기존 값은 변하지 않음.(한줄씩 읽는 방식이라 그런듯?)
		number = 100;
		number2 = 200;
		System.out.println(result);
		int result2 = number + number2;
		System.out.println(result2);
		System.out.println(result+result2);
		
		
	}

}
