package _02_switchCase;

import java.util.Scanner;

public class _02_Ex {

	public static void main(String[] args) {
//		5칙연산(+, -, *, /, %)
//		3개 (숫자로 2개, 문자 1개)
//		연산자에 해당하는 연산을 수행하여 출력
//		5
//		3
//		+
//		5+3=8
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 항을 입력하시오 : ");
		int num1 = scn.nextInt();
		System.out.println("두번째 항을 입력하시오 : ");
		int num2 = scn.nextInt();
		System.out.println("5칙연산(+, -, *, /, %)을 입력하시오");
		String str1 = scn.next();
		
		switch (str1) {
		case "+" : 
			System.out.println((num1)+"+"+(num2)+"="+(num1+num2));
		break;
		
		case "-" : 
			System.out.println((num1)+"-"+(num2)+"="+(num1-num2));
		break;
		
		case "/" : 
			System.out.println((num1)+"/"+(num2)+"="+(num1/num2));
		break;
		
		case "*" : 
			System.out.println((num1)+"*"+(num2)+"="+(num1*num2));
		break;
		
		case "%" : 
			System.out.println((num1)+"%"+(num2)+"="+(num1%num2));
		break;
		
		default :
			System.out.println("유효한 값이 아닙니다.");
			}		
	}

}
